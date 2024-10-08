import java.io.*;
import java.util.*;

public class q17216 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 자연수 N
		StringTokenizer st = new StringTokenizer(br.readLine()); // arr 입력
		int arr[] = new int[N];
		int result = 0;
		int dp[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = arr[i];
		}

		for (int i = 1; i < N; i++) {
			for(int j = 0; j<i; j++) {
				if(arr[j]>arr[i]) {
					if(dp[j]+arr[i] > dp[i])
						dp[i] = dp[j]+arr[i];
				}
			}
			if(dp[i]>result)
				result = dp[i];
		}
		System.out.println(result);
	}
}
