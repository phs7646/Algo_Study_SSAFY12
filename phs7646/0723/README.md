시간 안에 해결한 문제 : 1,2,3,4 

# 문제 요약

### 1번
완전탐색
a부터 b까지 각 수에 중복 숫자가 있는지 검사

### 2번
완전탐색
i번째 탑을 기준(변경 x)로 잡고, 나머지 탑들 중 수정이 필요한 탑의 갯수 세기

### 3번
dfs
모든 구역이 탐사될 때 까지 각 구역을 dfs로 탐사, 조건에 맞게 늑대 또는 양 갯수 세주기

### 4번
구현, 완전탐색
첫 번째 퍼즐 조각을 바닥에 고정하고,
두 번째 퍼즐을 돌려가며 모든 위치에 끼워보기

# TIL

### 2번
처음에 문제를 잘못 읽어서 높이 차이가 K이하로 만들면 된다는 줄 알았는데 아무리 고심해도 문제 범위를 만족하는 알고리즘을 세울 수 가 없었다. (이후에 더 고민 해봐야 할듯)
그다음 다시 문제를 읽어서 높이 차이가 정확히 K로 만들면 된다는 줄 알았고, 백트래킹을 생각하고 있다가
다시 문제를 읽으니 +-K도아닌 정확히 +K였다.
문제를 잘못 읽는 경우가 종종 있어서 신경썼는데도 이런 실수가 종종 나오는걸 보니 앞으로 쉬운 문제일수록 천천히 읽는 습관을 들여야겠다.


