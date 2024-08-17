package com.tsunazumi.quiver;

public class StackFromArray <T> {
  T[] array;
  int index = 0;
  public StackFromArray(int size) {
    array = (T[]) new Object[size];
  }

  public void push(T item) {
    if (index == array.length) {
      // need to resize the array
      // create a new array adding 2 elements
      T[] arrayBigger = (T[]) new Object[array.length + 2];
      // copy elements over
      for (int i=0; i < array.length; i++ ) {
        arrayBigger[i] = array[i];
      }
      array = arrayBigger;
    }
    array[index++] = item;
  }

  public T peek() {
    if (index - 1 >= 0) {
      return array[index - 1];
    } else {
      return null;
    }
  }

  public T pop() {
    T value = array[index-1];
    index--;
    return value;
  }

  public static void main(String[] args) {
    StackFromArray<String> stackFromArray = new StackFromArray<>(2);
    stackFromArray.push("foo");
    System.out.println(stackFromArray.peek());
    stackFromArray.push("bar");
    System.out.println(stackFromArray.peek());
    stackFromArray.push("moo");
    System.out.println(stackFromArray.peek());
    stackFromArray.pop();
    System.out.println(stackFromArray.peek());
    stackFromArray.pop();
    System.out.println(stackFromArray.peek());

  }
}
