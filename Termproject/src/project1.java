import java.util.*;
public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random rn=new Random();//����
		int n=1;
		int min=0;
		int max=0;
		while(true) {
			System.out.println("������ �������� ũ�⸦ ������ �Է����ּ���");
			n = sc.nextInt(); //�Է¹��� �迭 ũ��
			System.out.println("���� ������ �ϱ� ���ؼ� �� ������ �Է��� �ּ��� ");
			System.out.println("�� �ι�°�� �Է��� �� �� ù��°�� �Է��� �� ���� ���ų� Ŀ�� �մϴ� ");
			int a = sc.nextInt();//�Է¹��� ����
			int b = sc.nextInt();
			if(a<=b && a<=n && b<=n) break;
			System.out.println("���ǿ� �°� �ٽ� �Է��� �ּ���");	
		}
		int arr[] = new int[n];//n���� �����͸� ������ �迭 ����
		for(int i=0; i<n;i++) {
			arr[i]=rn.nextInt();//�迭�� ������ �����͸� ����
		}
		
		
		
	}

}
