import java.util.*;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;
		char[][] arr = new char[N + 1][M + 1];

		for (int i = 0; i < N; i++) {

			String a = sc.next();

			for (int j = 0; j < M; j++) {
				arr[i][j] = a.charAt(j);
			}

		}

		if (arr[0][0] == 'W') {
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {

					if (i % 2 == 0 && j % 2 == 1) {
						if (arr[i][j] != 'B')
							cnt += 1;
					} else if (i % 2 == 0 && j % 2 == 0) {
						if (arr[i][j] != 'W')
							cnt += 1;
					}

					else if (i % 2 == 1 && j % 2 == 1) {
						if (arr[i][j] != 'W')
							cnt += 1;
					} else {
						if (arr[i][j] != 'B')
							cnt += 1;
					}

				}
			}
		} else if (arr[0][0] == 'B') {
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {

					if (i % 2 == 0 && j % 2 == 1) {
						if (arr[i][j] != 'W')
							cnt += 1;
					} else if (i % 2 == 0 && j % 2 == 0) {
						if (arr[i][j] != 'B')
							cnt += 1;
					}

					else if (i % 2 == 1 && j % 2 == 1) {
						if (arr[i][j] != 'B')
							cnt += 1;
					} else {
						if (arr[i][j] != 'W')
							cnt += 1;
					}

				}
			}
		} else {
			return;
		}

	
		 System.out.println(cnt);
	}


}
