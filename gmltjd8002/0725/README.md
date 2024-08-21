시간 안에 해결한 문제 : 1
추가 해결한 문제 : 

# 문제 요약

### 1번

정렬

### 2번

dfs

### 3번

dp

### 4번

구현

# TIL

### 1번

최대값을 반환하는 것이 목표이다.
작은 수부터 큰 수를 순회하는 것이 유리하다고 생각했다.
배열을 정렬 후 반복문을 이용해 배열 순회 후 길이보다 작은 값의 개수를 더해주었다.

### 2번

처음엔 dfs로 구현을 해야겠다고 생각했다.
그렇지만 테스트케이스를 본 후 크기가 크지 않음을 느꼈고 완전탐색으로 구현을 시도했다.
결과적으로 시간안에 제출을 하지 못해 아쉽다.
내가 생각하지 못한 반례가 많았고, 테스트케이스는 맞았지만 다른 경우에는 아니었던 것 같다.
완전탐색은 구현은 간단하지만 반례가 많음을 간과한 것 같다.
다시 풀 때는 dfs 및 LinkedList의 노드를 이용해 풀어봐야겠다.
========================================================================================
다시 푼 결과 dfs로 구현을 성공하였다. 완전탐색에선 값이 작은 수가 먼저 들어온다고 판단해 문제가 생겼던 것 같다.
다시 풀었을 땐 값이 큰 수가 먼저 들어와도 문제없도록 두 경우를 모두 더해주어 문제를 해결했다.
dfs로 구현에 크게 어려움은 없었고, 처음부터 dfs로 풀었어도 좋았을 것 같다.



### 3번


### 총평

1번은 난이도가 낮아 딱히 할 말이 없는 것 같다.
2번은 처음에 dfs로 방향을 잡았었는데 그 방향이 맞았던 것 같다.
그래도 완전탐색을 통해 테스트케이스를 보며 해당되는 경우를 찾는 과정이 재밌었던 것 같다.
나중에 다른 반례가 생각나면 다시 풀어보고 싶은 문제인 것 같다.