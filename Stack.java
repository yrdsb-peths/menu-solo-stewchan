public class Stack<T> {
  private Node first = null;

  private int size = 0;

  public int size() {
    return size;
  }

  private class Node {
    private T item;
    private Node next;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public void push(T item) {
    Node second = first;
    first = new Node();
    first.item = item;
    first.next = second;
    size++;
  }

  public T pop() {
    T item = first.item;
    first = first.next;
    size--;
    return item;
  }
}
