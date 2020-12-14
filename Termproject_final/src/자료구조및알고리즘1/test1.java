package 자료구조및알고리즘1;

import java.util.*;
public class test1{
	public static int[] findMaxMin(int[] A, int i , int j) {
		int mid;//배열의 중간
		int[]result = new int[2]; //a배열 최대최소 저장하는 배열
		int [] leftResult = new int[2]; //i부터 mid까지
		int [] rightResult = new int[2]; 
		
		/*if(i==j) { result[0]=A[i]; result[1]=A[i];}
		else if(i ==j-1) {
			if(A[i] <A[j]) {
				result[0]=A[i];
				result[1]=A[j];
			}
			else {
				result[0]=A[j];
				result[1]=A[i];
			}
		}*/
		
			mid=(int)(i+j)/2;
			leftResult=findMaxMin(A,i,mid);
			rightResult=findMaxMin(A,mid+1,j);
			if(leftResult[0]<rightResult[0]) result[0]=leftResult[0];
			if(leftResult[1]<rightResult[1]) result[1]=rightResult[1];	
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random rn=new Random();//난수
		int[] answer=new int[2];
		System.out.println("생성할 데이터의 개수를 입력해주세요");
		//int data_n=sc.nextInt();
		int data_n=100000;

		System.out.println("렌덤으로 생성할 구간의 개수를 입력해주세요");
		int range_n=sc.nextInt();
		//int range_n=5;
		long start = System.currentTimeMillis();
		int arr[]=new int[data_n];
		
		for(int i=0;i<data_n;i++) {
			arr[i]=rn.nextInt();//n개의 데이터 셍성
			//System.out.print(arr[i]+"  ");
		}
		for(int j=0;j<range_n;j++) {
			int a=0;
			int b=0;
			int sum =0;
			while(true) {
				a=rn.nextInt(data_n);//구간 시작점
				b=rn.nextInt(data_n);//구간 끝 점
				if(a<=b) break;
				}
			System.out.println(a+"와 "+b);
			int[] new_arr = Arrays.copyOfRange(arr, a, b);
			for(int k=a;k<=b;k++) {
				sum=sum+arr[k];
				}
			System.out.println("합계 :"+sum);
			answer=findMaxMin(new_arr,0,b-a-1);
		}
			long end = System.currentTimeMillis();
			System.out.println("걸린시간은: "+(end-start)+"ms입니다" );
			
	}

}

