# 24.08.01 알고리즘 스터디

## 문제 1) 번데기 (구현)
## 문제 2) 영상처리 (BFS)

## 문제 풀이 1번
번 - 데기 - 번 - 데기 - 번 * (n -1) - 데기 * (n-1) 
을 반복하면서 n번째 번 or 데기를 말하게 되는 사람은 누구인가를 구하는 문제였음.
간단하게 초기 번-데기-번-데기는 고정이기 때문에 매 반복마다 추가해 줬고,
뒤에 n-1번씩 반복되야 하는 번,데기는 총 반복 count를 세고 그만큼 따로 반복을 돌려서
추가해 주는 방식을 선택했음. 그리고 총 횟수를 mod 연산 해주면 끝.

### 문제점
없음

## 문제풀이 2번
개인적으로 느끼기엔 그냥 간단한 BFS문제였음.
모든 연결 되어있거나 아닌 255를 찾으면 되는 문제였기 때문에, BFS로 찾았음.

### 문제점
없음.