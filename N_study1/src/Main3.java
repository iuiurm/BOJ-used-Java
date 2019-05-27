import java.util.*;
public class Main3 {

static int []b = new int[5]; // 전역 변수 선언.

static void sum(){
	int cnt=0;
	
	for(int i =0; i<5; i++){
		if(b[i]<40){
			b[i]= 40;
		}
		cnt += b[i];
	}
	
	System.out.println(cnt/5);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++){
			b[i]=sc.nextInt();
		}
		
		sum();
	}

}
