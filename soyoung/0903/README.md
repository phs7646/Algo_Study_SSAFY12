# 2024/08/22 풀이
시간 안에 해결한 문제 :

추가로 해결한 문제 : 1 2 3
## [문제 1] 동방 프로젝트 (구현)
### 접근
배열에 1~N의 숫자를 넣어두고, a부터 b까지의 숫자를 모두 a로 변경
반례: a=5 b=8 이후에 a=4 b=7이 수행되면 인덱스 8이 다른 방으로 인식됨
### 풀이
(a, b)의 순서쌍을 모두 받아두고 a기준 오름차순 정렬 후 순서대로 위 방식을 적용
## [문제 2] 컴백홈 (dfs)
시작 위치 -> 도착 위치까지 모든 경로를 dfs로 탐색하여 거리가 K인 경우의 수 카운트
## [문제 3] 이모티콘 (bfs)
### 접근
복붙 : 약수 x를 찾아 dp[S] = min(dp[x1]+S/x1, dp[x2]+S/x2, ...)를 수행
삭제 : 모든 수 i에 대해 역순으로 삭제가 더 빠른지 확인 dp[i] = min(dp[i], dp[j]+(j-i))
테케와 질문게시판의 반례는 맞았지만 오답처리됨
### 풀이
복붙 -> 약수만 고려하는 방법은 x
bfs로 time+1되는 경우마다 가지치기해서 모든 경우를 고려해야함
