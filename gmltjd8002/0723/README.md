시간 안에 해결한 문제 : 1
추가 해결한 문제 : 2,3

# 문제 요약

### 1번

브루트 포스

### 2번

브루트 포스

### 3번

dfs

### 4번

구현

# TIL

### 1번

처음 구현에 어렵지는 않았고, 금방 넘어갈 수 있는 문제라 생각했었지만, 자꾸만 오류가 발생했다.
조건문에서 continue를 실행할 때 가장 가까운 조건문만 적용을 받는다는 점을 간과했다.
### 2번

수학의 점화식이 나왔고, 처음에는 블록의 개수를 구하는 문제로 착각했고, 실제로 오답도 받았다.
문제 해석부터 까다로웠던 것 같고, 문제를 다시 보았는데, 탑의 개수를 구하는 문제였다.
그래서 등차수열에 맞지않는경우 카운트를 늘리는 방식으로 접근했다.
1번에서 시간을 많이 할애하여 충분히 구현 가능했을 문제를 시간안에 풀지 못해 아쉬웠다.

### 3번
bfs도 가능할 것 같았지만 dfs에 익숙해질 겸 dfs로 풀어보았다.
좌표 개념을 도입해 수업시간에 배운 델타를 선언했고, 기존의 dfs와 접목해 경계 체크 및 방문 기록 등을 체크했다.
기존 dfs와는 달리 울타리 내부의 양과 늑대의 개수를 구해 값을 비교해야하는 응용문제가 있었던 것 같다.

### 총평

1번에서 continue구문을 잘못 사용해 많은 시간을 들여 겨우 정답을 맞췄지만 2,3번 문제를 거의 쳐다보지도 못했던 것이 아쉽다.
boolean 형태로 flag를 선언해 트리거를 설정하는 습관을 들여야겠다고 생각했다.