# 24.07.23 알고리즘 스터디

## 문제 1) 호텔 방 번호 
## 문제 3) 양치기 꿍 (DFS)

## 문제 풀이 1번
간단하게 주어진 시작번호와 끝번호 사이의 숫자에 반복되는 숫자가 나오지 않는 경우를 찾는 문제였음.
그래서 간단하게 숫자는 0~9 사이로 존재하기 때문에 사이즈 10의 visited 배열을 만들고 해당 숫자가 나오면
1로 바꿔주고 다시 한번 이 1에 방문하면 종료하도록 했음.

### 문제점
없었음.

## 문제풀이 3번
DFS를 통해 울타리 내부의 양과 늑대의 수를 구하고, 늑대와 양의 숫자에 따라 둘의 수가 달라지는 문제였음.
늑대와 양의 숫자는 모든 경우에서 전체적으로 구하기 때문에 static을 사용했고 나머지 풀이는 그냥 일반적인 DFS 문제였음
델타를 이용해서 위치를 이동시켜 가면서 DFS를 진행하면 되었음.

### 문제점
개인적으로 DFS를 풀 때 static을 사용하는게 미숙 했는데, 싸피 과정 동안 static에 대해서 배우고 
이런 문제를 통해서 발전 시켜나갈 수 있었음.