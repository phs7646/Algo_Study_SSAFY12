import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_4_9470 {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int t=1;t<=T;t++) {
			st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			
			int[] indegree = new int[M+1];
			
			//�׷��� �ʱ�ȭ
			List<Integer> graph[] = new ArrayList[M+1];
			for (int i=0;i<=M;i++) {
				graph[i] = new ArrayList<>();
			}
			
			for (int i=0;i<P;i++) {
				st = new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				
				indegree[B]++;
				graph[A].add(B);
				
			}
			
			int[] maxOrder = new int[M+1];
			int[] count = new int[M+1];
			
			Queue<int[]> q = new ArrayDeque<>();
			//�����ϴ� ��õ ť�� �ֱ�
			for (int i=1;i<=M;i++) {
				if (indegree[i] == 0) {
					q.add(new int[] {i,1}); //[��õ��ȣ, ����]
				}
			}
			
			while (!q.isEmpty()) {
				int[] cur = q.poll();
				int cur_num = cur[0];
				int cur_order = cur[1];
				
				for (int next : graph[cur_num]) {
					//�ִ� ����
					if (maxOrder[next] < cur_order) {
						maxOrder[next] = cur_order;
						count[next] = 1; //�ִ�(i)�� ���� 
					}
					else if (maxOrder[next] == cur_order) {
						count[next]++;
					}
					
					indegree[next]--; //�������� -1
					//���԰��� (ť�� �ֱ�)
					if (indegree[next] == 0) {
						//�ִ��� 2�� �̻��̸�
						if (count[next] >= 2) maxOrder[next]++;
						q.add(new int[] {next, maxOrder[next]});
					}
				}
			}
//			System.out.println(Arrays.toString(maxOrder));
			System.out.println(t+" "+maxOrder[M]);
//			sb.append(K).append(" ").append(maxOrder[M]).append("\n");
			
		}
//		System.out.println(sb);

	}

}