import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_편의점2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine().trim());
		
		int[] x = new int[n];
		int[] y = new int[n];

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(x);
		Arrays.sort(y);

		long sum = 0;
		for(int i = 0; i < n/2; i++) sum += ( Math.abs(x[i]-x[n-1-i]) + Math.abs(y[i]-y[n-1-i]));
		
		System.out.println(sum);
	}
}
