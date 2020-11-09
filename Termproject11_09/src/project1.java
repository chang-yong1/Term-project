import java.util.*;
public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random rn=new Random();//난수
		int n=1;
		int a=0;//입력받을 구간
		int b=0;//입력받을 구간
		
		while(true) {
			System.out.println("생성할 데이터의 크기를 정수로 입력해주세요");
			n = sc.nextInt(); //입력받을 배열 크기
			System.out.println("구간 설정을 하기 위해서 두 정수를 입력해 주세요 ");
			System.out.println("단 두번째로 입력할 수 는 첫번째로 입력할 수 보다 같거나 커야 합니다 ");
			a = sc.nextInt();//입력받을 구간
			b = sc.nextInt();
			if(a<=b && a<=n && b<=n) break;
			System.out.println("조건에 맞게 다시 입력해 주세요");	
		}
		int arr[] = new int[n];//n개의 데이터를 저장할 배열 생성
		for(int i=0; i<n;i++) {
			arr[i]=rn.nextInt();//배열에 랜덤한 데이터를 저장
		}
		//최솟값,최댓값,합계 구하기
		int min = arr[a];
		int max = arr[a];
		int sum =0;
		for(int j=a;j<=b;j++) {
			if(min>=arr[j]) min=arr[j];
			if(max<=arr[j]) max=arr[j];
			sum=sum+arr[j];
		}
		System.out.println("최솟값: "+min);
		System.out.println("최댓값: "+max);
		System.out.println("합계 :"+sum);
	}

}
