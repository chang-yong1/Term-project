import java.util.*;
public class Termproject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random rn=new Random();//난수
		
		int a=0;
		int b=0;
		
		System.out.println("생성할 데이터의 개수를 입력해주세요");
		int data_n=sc.nextInt();
	
		System.out.println("렌덤으로 생성할 구간의 개수를 입력해주세요");
		int range_n=sc.nextInt();
		long start = System.currentTimeMillis();
		int sum =0;
		int arr[]=new int[data_n];
		for(int i=0;i<data_n;i++) {
			arr[i]=rn.nextInt();//n개의 데이터 셍성
		}
		int min = arr[a];
		int max = arr[a];
		
		for(int j=0;j<range_n;j++) {
			while(true) {
				a=rn.nextInt(data_n);//구간 시작점
				b=rn.nextInt(data_n);//구간 끝 점
				if(a<=b) break;
			}
			//System.out.println(a+"  "+b);
		
			for(int k=a;k<=b;k++) {
				if(min>=arr[k]) min=arr[k];
				if(max<=arr[k]) max=arr[k];
				sum=sum+arr[k];
				}
			System.out.println("최솟값: "+min);
			System.out.println("최댓값: "+max);
			System.out.println("합계 :"+sum);
			//11월22일
		}
		long end = System.currentTimeMillis();
		System.out.println("걸린시간은: "+(end-start)+"ms입니다" );
	}

}
