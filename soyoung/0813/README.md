시간 안에 해결한 문제 수 : 1

# 문제 요약
-------------
## 1번
구현

## 2번
bfs

# TIL
-------------
## 2번
최단 거리로 이동할 때 가장 긴 시간이 걸리는 육지 두 곳을 찾는 방법 :
1. 두 곳이 어디인지 처음부터 특정할 수 없으므로, bfs로 모든 좌표를 방문하며 L을 발견하면 그 곳을 출발점으로 삼고 가장 먼 곳을 최단거리로 갈 경우 몇 시간이 걸리는지 일일이 구한다.
2. 이 작업을 모든 L에 대해 반복하면서 가장 긴 시간을 찾는다.
3. 구해진 시간을 출력한다.
