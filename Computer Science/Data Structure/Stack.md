# Stack

- Stack은 쌓다의 의미로 data를 순서대로 쌓기 때문에 나중에 저장하는 데이터가 가장 먼저 나오는 구조이다. 

- LIFO (= Last In First Out) 또는 FILO (= First In Last Out)라고도 한다.

- 바로 넣었다가 거꾸로 정렬된 데이터를 꺼내고 싶을 때 유용하다.

- 지원 기능
    - pop() : 맨 마지막에 넣은 데이터를 가져오면서 삭제
    - push() : 새로운 데이터 삽입
    - peek() : 맨 마지막 데이터 출력
    - isEmpty() : stack에 데이터가 있는지 없는지 확인

## 코드 구현

```java
import java.util.EmptyStackException;

class Stack<T> {
    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public T pop() {
        if(top == null) {
            throw new EmptyStackException();
        }

        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        Node<T> t = new Node<T>(item);
        t.next = top;
        top = t;
    }

    public T peek() {
        if(top == null) {
            throw new emptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class Test {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // [1, 2, 3, 4]

        System.out.println(s.pop());
        // 4 -> [1, 2, 3]
        System.out.println(s.pop());
        // 3 -> [1, 2]
        System.out.pritnln(s.peek());
        // 2 -> [1, 2]
        System.out.println(s.pop());
        // 1 -> [1]
        System.out.println(s.isEmpty());
        // false
        System.out.pritnln(s.pop());
        // 1 -> []
        System.out.println(s.isEmpty());
        // true
    }
}