package ����_ť;
import java.util.*;
class Queue_1<E>{
	int front;
	int rear;
	int size;
	E []data;
	Queue_1(int n){
		front=0;
		rear=0;
		size=n;
		data = (E[]) new Object[n];
		
	}
	public void push(E v) {
		data[rear]=v;
		rear=(rear+1)%size;
	}
	public void pop() {
			System.out.println(data[front]);
			data[front]=null;
			front=(front+1)%size;
	}
	public E front() {
		return data[front];
	}
	public E back() {
		return data[rear-1];
	}
	public boolean empty() {
		return front == rear;
	}
	public int size() {
		return (rear-front+size)%size;
	}
	public E peek() {
		return data[front];
	}
}
public class ����10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		int k;//push�ڿ� �Է¹��� ����
		String str;
		while(true) {
			System.out.print("(1~10000) ���̿� �ش��ϴ� ����� ���� �Է����ּ���: ");
			n=sc.nextInt();
			if(n>=1 && n<=10000) break;
		}
		Queue_1 queue=new Queue_1(n);
		System.out.println("��ɾ� �Է����ּ���");
		for(int i=0;i<n;i++) {
			str=sc.next();
			if(str.equals("push")) {
					k=sc.nextInt(); 
					queue.push(k);	
					
			}
			else if(str.equals("pop")){
				if(queue.empty()==true) System.out.println(-1);
				else queue.pop();
			}
			else if(str.equals("size")) {
				System.out.println(queue.size());
			}
			else if(str.equals("empty")) {
				if(queue.empty()==true)System.out.println(1);
				else System.out.println(0);
			}
			else if(str.equals("front")) {
				if(queue.size()==0){
					System.out.println(-1);
				}
				else System.out.println(queue.front());
			}
			else if(str.equals("back")) {
				if(queue.size()==0){
					System.out.println(-1);
				}
				else System.out.println(queue.back());
			}
		}

	}

}

