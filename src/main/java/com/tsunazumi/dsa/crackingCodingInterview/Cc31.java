package com.tsunazumi.dsa.crackingCodingInterview;

public class Cc31 {
  
  public static void main(String[] args) throws Exception {
    Cc31 foo = new Cc31(3, 3);
    foo.push(1, 19);
    foo.push(1, 20);
    foo.push(1, 21);
    foo.push(1, 22);
  }
  
  private class StackInfo {
    public int start, size, capacity;
    public StackInfo(int start, int capacity) {
      this.start = start;
      this.capacity = capacity;
    }
    
    public boolean isWithinStackCapacity(int index) {
      if (index < 0 || index >= values.length) {
        return false;
      }
      
      int contiguousIndex = index < start ? index + values.length : index;
      int end = start + capacity;
      return start <= contiguousIndex && contiguousIndex < end;
    }
    
    public int lastCapacityIndex() {
      return adjustIndex(start + capacity - 1);
    }
    
    public int lastElementIndex() {
      return adjustIndex(start + size - 1);
    }
    
    public boolean isFull() { return size == capacity; }
    public boolean isEmpty() { return size == 0; }
  }
    
  private StackInfo[] info;
  private int[] values;
  
  public Cc31(int numberOfStacks, int defaultSize) {
    info = new StackInfo[numberOfStacks];
    for (int i = 0; i < numberOfStacks; i++) {
      info[i] = new StackInfo(defaultSize * i, defaultSize);
    }
    values = new int[numberOfStacks * defaultSize];
  }
  
  public void push(int stackNum, int value) throws Exception {
    if (allStacksAreFull()) {
      throw new Exception();
    }
    
    StackInfo stack = info[stackNum];
    if (stack.isFull()) {
      expand(stackNum);
    }
    
    stack.size++;
    values[stack.lastElementIndex()] = value;
  }
  
  public int pop(int stackNum) throws Exception {
    StackInfo stack = info[stackNum];
    if (stack.isEmpty()) {
      throw new Exception();
    }
      
    int value = values[stack.lastElementIndex()];
    values[stack.lastElementIndex()] = 0;
    stack.size--;
    return value;
  }
    
  public int peek(int stackNum) {
    StackInfo stack = info[stackNum];
    return values[stack.lastElementIndex()];
  }
  
  /* Sift items in stack over by one element. If we have abailable capacity, then
   * we'll end up shrinking the stack by one element. If we don't have available
   * capacity, then we'll need to shift the next stack over too. 
   */
  private void shift(int stackNum) {
    System.out.println("/// Shifting " + stackNum);
    StackInfo stack = info[stackNum];
    
    /* If this stack is at its full capacity, then you need to move the next
     * stack over by one element. This stack can now claim the freed index.
     */
    if (stack.size >= stack.capacity) {
      int nextStack = (stackNum +1) % info.length;
      shift(nextStack);
      stack.capacity++;
    }
    
    /* Shift all elements in stack overy by one. */
    int index = stack.lastCapacityIndex();
    while (stack.isWithinStackCapacity(index)) {
      values[index] = values[previousIndex(index)];
      index = previousIndex(index);
    }
    /*Adjust stack data. */
    values[stack.start] = 0;
    stack.start = nextIndex(stack.start);
    stack.capacity--;
  }
  
  private void expand(int stackNum) {
    shift((stackNum + 1) % info.length);
    info[stackNum].capacity++;
  }
  
  public int numberOfElements() {
    int size = 0;
    for (StackInfo sd : info) {
      size += sd.size;
    }
    return size;
  }
  
  public boolean allStacksAreFull() {
    return numberOfElements() == values.length;
  }
  
  private int adjustIndex(int index) {
    /*Java's mod operator can return neg values. For example, (-11 % 5) will return -1,
     * not 4. We actually want the value to be 4 (since we're wrapping around the index).
     */
    int max = values.length;
    return ((index % max) + max) % max;
  }
  
  private int nextIndex(int index) {
    return adjustIndex(index + 1);
  }
  
  private int previousIndex(int index) {
    return adjustIndex(index - 1);
  }

}
