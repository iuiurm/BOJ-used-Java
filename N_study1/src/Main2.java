import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in); // scanner ��ü 
		int size  = sc.nextInt(); // size input
		int []b = new int[size]; // �迭 ����
		
		int x = sc.nextInt(); // int �� ���� x input
		
		for (int i=0; i<size ; i++){// �迭 �Է�
			b[i] = sc.nextInt();
		}
		
		
		for(int i =0 ; i<size; i ++){
			if(b[i]<x){ // �迭 ���� ���� x���� ���� ��
				System.out.print(b[i]+" ");
			}
		}
		
	}

}
