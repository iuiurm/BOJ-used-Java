import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
	//	char []b = new char[30]; 
		char[] b = a.toCharArray();// char로 바꾸면 String으로 바꾸기 어려움.
		
		
		for(int i=0; i< b.length; i++){
			if(i%2 == 0){
			System.out.print(b[i] + " ");
			}
		}
		
	}

}
