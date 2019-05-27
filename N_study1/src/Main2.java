import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in); // scanner 객체 
		int size  = sc.nextInt(); // size input
		int []b = new int[size]; // 배열 선언
		
		int x = sc.nextInt(); // int 형 변수 x input
		
		for (int i=0; i<size ; i++){// 배열 입력
			b[i] = sc.nextInt();
		}
		
		
		for(int i =0 ; i<size; i ++){
			if(b[i]<x){ // 배열 원소 값이 x보다 작을 때
				System.out.print(b[i]+" ");
			}
		}
		
	}

}
