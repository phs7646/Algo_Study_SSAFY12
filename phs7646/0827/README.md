시간 안에 해결한 문제 : 1,2,3,4

# 문제 요약

### 1번

역방향으로 k번 셔플하기

### 2번

dfs로 오른쪽이 등장하는지 확인하기

### 3번

dp[i] = i번째를 마지막으로 묶었을 때 최소 비용
dp[i] = min( for(j = 0..i) pack(i...j) + dp[j-1] ) 

### 4번

BFS와 구현
매 승객마다 두번의 bfs를 해야하고, 이 때 탐색이 끝났으면 바로 바로 bfs 그만두기

# TIL

## 3번

시간복잡도 계산을 먼저 해보고 입력 제한을 이해했다.

## 4번

4번에 BFS를 적극적으로 활용하는 구현 문제가 나왔다. 디버깅을 미리 대비하고 출력문을 틈틈히 넣어서 코딩하는 습관이 정말 많이 도움이 된 것 같다.