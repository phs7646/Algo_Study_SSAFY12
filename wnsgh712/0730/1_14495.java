import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static long[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        if (N == 1 || N == 2 || N == 3) {
            System.out.println(1);
            return;
        }
        dp = new long[N + 1];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 4; i <= N; i++) {
            dp[i] = dp[i-1] + dp[i-3];
        }

        System.out.println(dp[N]);
    }
}