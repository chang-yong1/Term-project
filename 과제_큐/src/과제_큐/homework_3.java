package 과제_큐;
import java.util.*;
class Stack<E>{
	int top;
	E[] data;
	Stack(){
		data=(E[])new Object[10000];
		top=-1;
	}
	public void push(E v) {
		data[++top]=v;
	}
	public void pop() {
		data[top--]=null;
	}
	public E top() {
		return data[top];
	}
	public int size() {
		return top+1;
	}
	public boolean empty() {
		return top==-1;
	}
}
class Queue<E>{
	int front;
	int rear;
	E[] data;
	int size;
	Queue(){
		front=rear=0;
		size=10000;
		data = (E[])new Object[size];
	}
	public void add(E v) {
		data[rear]=v;
		rear=(rear+1)%size;
	}
	public void remove() {
		data[front]=null;
		front=(front+1)%size;
	}
	public E peek() {
		return data[front];
	}
	public int size() {
		return (rear-front+size)%size;
	}
	public boolean empty() {
		return front==rear;
	}
}
public class homework_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stack =new Stack();
		Queue<Integer> queue=new Queue();
		System.out.print("숫자 n을 입력해주세요: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			queue.add((int)(Math.random()*10000));
		}

		while(queue.empty()==false){
				
				if (stack.empty()==true || stack.top()==queue.peek()) {
					stack.push(queue.peek());
					queue.remove();
				}
				else if(stack.top()>queue.peek() ) {
					stack.push(queue.peek());
					queue.remove();
				}
				else if(stack.top()<queue.peek() ) {
					queue.add(stack.top());
					stack.pop();
				}
		}
		while(stack.size()!=0) {
			System.out.println(stack.top());
			stack.pop();
		}
		
	}

}
