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
    ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(6);

    ExecutorService executorService = Executors.newFixedThreadPool(3);

    MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_GREEN);
    MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE);
    MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN);


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
  private ArrayBlockingQueue<String> buffer;
  private String color;

  public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
    this.buffer = buffer;
    this.color = color;
  }

  public void run() {
    Random random = new Random();
    String[] nums = { "1", "2", "3", "4", "5"};

    for (String num : nums) {
      try {
        System.out.println(color + "Adding..." + num);
        buffer.put(num);
        Thread.sleep(random.nextInt(1000));
      } catch(InterruptedException e) {
        System.out.println("Producer was interrupted");
      }
    }
    System.out.println(color + "Adding EOF and exiting...");
    try {
      buffer.put(Main.EOF);
    } catch(InterruptedException e) {
    }

  }
}

class MyConsumer implements Runnable {
  private ArrayBlockingQueue<String> buffer;
  private String color;

  public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
    this.buffer = buffer;
    this.color = color;
  }

  public void run() {
    while (true) {
      synchronized (buffer) {
        try {
          if (buffer.isEmpty()) {
            continue;
          }
          if (buffer.peek().equals(Main.EOF)) {
            System.out.println(color + "Exiting");
            break;
          } else {
            System.out.println(color + "Removed " + buffer.take());
          }
        } catch(InterruptedException e) {
        }
      }
    }
  }
}
