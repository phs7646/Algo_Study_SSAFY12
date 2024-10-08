import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2_11687 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		
		long low = 1;
		long high = Long.MAX_VALUE;
		long mid;
		while(low <= high) {
			mid = (low+high)/2;
			long sum = 0;
			for(int i = 1; i <=100; i++) {
//				5의 제곱수의 배수의 개수 구하기
				sum += mid/Math.pow(5, i);
			}
			if(sum >= M) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		
		long sum = 0;
		for(int i = 1; i <=100; i++) {
			sum += low/Math.pow(5, i);
		}
		System.out.println(sum == M ? low : -1);
	}

}
