import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * �� �Ͷ߸���
 * ���� ���� N ���� �� K
 * @author KOREA
 *
 */
public class Main_19939 {
	static int[] toNum;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //���� ����
		int K = Integer.parseInt(st.nextToken()); //�ٱ����� ����
		
		toNum = new int[K+1];
		
		int num = 1;
		for (int i=2;i<=K;i++) {
			num += i;
		}
		int answer; //���� ���� ��� �ٱ��Ͽ� ���� ���� ��� �ٱ����� ���� ���� ����
		N -= num;
		if (N < 0) answer = -1;
		else {
			if (N%K == 0) answer = K-1;
			else answer = K;
		}
		
		System.out.println(answer);
		
		
		
		
	}
	

}