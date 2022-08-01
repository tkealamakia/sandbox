package com.tsunazumi.buchalka.concurrency.producerconsumer;

import com.tsunazumi.buchalka.concurrency.ThreadColor;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

  public static final String EOF = "EOF";
  public static void main(String[] args) throws Exception {
    List<String> buffer = new ArrayList<>();
    ReentrantLock bufferLock = new ReentrantLock();

    ExecutorService executorService = Executors.newFixedThreadPool(3);

    MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN, bufferLock);
    MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);
    MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);


    Future<String> future = executorService.submit(new Callable<String>() {
      @Override
      public String call() throws Exception {
        Thread.sleep(1000);
        System.out.println(ThreadColor.ANSI_RED);
        return "This is the callable result";
      }
    });
    executorService.execute(producer);
    executorService.execute(consumer1);
    executorService.execute(consumer2);

    try {
      System.out.println(future.get());
    } catch(ExecutionException e) {
      System.out.println("Something went wrong");
    } catch(InterruptedException e) {
      System.out.println("Thread running the task was interrupted.");
    }

    executorService.shutdown();

  }
}

class MyProducer implements Runnable {
  private List<String> buffer;
  private String color;
  private ReentrantLock bufferLock;

  public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
    this.buffer = buffer;
    this.color = color;
    this.bufferLock = bufferLock;
  }

  public void run() {
    Random random = new Random();
    String[] nums = { "1", "2", "3", "4", "5"};

    for (String num : nums) {
      try {
        System.out.println(color + "Adding..." + num);
        bufferLock.lock();
        try {
          buffer.add(num);
        } finally {
          bufferLock.unlock();
        }
        Thread.sleep(random.nextInt(1000));
      } catch(InterruptedException e) {
        System.out.println("Producer was interrupted");
      }
    }
    System.out.println(color + "Adding EOF and exiting...");
    bufferLock.lock();
    try {
      buffer.add(Main.EOF);
    } finally {
      bufferLock.unlock();
    }

  }
}

class MyConsumer implements Runnable {
  private List<String> buffer;
  private String color;
  private ReentrantLock bufferLock;

  public MyConsumer(List<String> buffer, String color, ReentrantLock bufferLock) {
    this.buffer = buffer;
    this.color = color;
    this.bufferLock = bufferLock;
  }

  public void run() {
    System.out.println("Running consumer");
    while (true) {
      bufferLock.lock();
      try {
        if (buffer.isEmpty()) {
          continue;
        }
        if (buffer.get(0).equals(Main.EOF)) {
          System.out.println(color + "Exiting");
          break;
        } else {
          System.out.println(color + "Removed " + buffer.remove(0));
        }
      } finally {
        bufferLock.unlock();
      }
    }
  }
}
