시간 안에 해결한 문제 : 1,2,3,4

# 문제 요약

### 1번

dp[i] = min(dp[i], dp[i-제곱수]+1)

### 2번

N! 의 0의 갯수 = 5의 갯수.
이분탐색

### 3번

이분탐색 구현

### 4번

사용할 수 있는 간선 비용의 최댓 값을 줄여 나가면서
다익스트라

# TIL

처음엔 이분탐색의 left, right값을 조절하고 정답을 출력하는 과정에서 잔실수가 많고 많이 헷갈렸는데, answer를 저장하는 방식을 사용하니 조금도 헷갈리지 않고 안전하게 이분탐색을 할 수 있었다.


