import java.util.*;
public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random rn=new Random();//����
		int n=1;
		int a=0;//�Է¹��� ����
		int b=0;//�Է¹��� ����
		
		while(true) {
			System.out.println("������ �������� ũ�⸦ ������ �Է����ּ���");
			n = sc.nextInt(); //�Է¹��� �迭 ũ��
			System.out.println("���� ������ �ϱ� ���ؼ� �� ������ �Է��� �ּ��� ");
			System.out.println("�� �ι�°�� �Է��� �� �� ù��°�� �Է��� �� ���� ���ų� Ŀ�� �մϴ� ");
			a = sc.nextInt();//�Է¹��� ����
			b = sc.nextInt();
			if(a<=b && a<=n && b<=n) break;
			System.out.println("���ǿ� �°� �ٽ� �Է��� �ּ���");	
		}
		int arr[] = new int[n];//n���� �����͸� ������ �迭 ����
		for(int i=0; i<n;i++) {
			arr[i]=rn.nextInt();//�迭�� ������ �����͸� ����
		}
		//�ּڰ�,�ִ�,�հ� ���ϱ�
		int min = arr[a];
		int max = arr[a];
		int sum =0;
		for(int j=a;j<=b;j++) {
			if(min>=arr[j]) min=arr[j];
			if(max<=arr[j]) max=arr[j];
			sum=sum+arr[j];
		}
		System.out.println("�ּڰ�: "+min);
		System.out.println("�ִ�: "+max);
		System.out.println("�հ� :"+sum);
	}

}
