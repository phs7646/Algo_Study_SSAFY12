# 2024/08/22 풀이
시간 안에 해결한 문제 : 1

추가로 해결한 문제 : 2 3
## [문제 1] 편의점 2 (숫자, 구현)
여러 점이 있을 때, 그 점들과의 거리의 합을 최소화하는 지점은 정렬된 데이터의 '중간값'이다. 
중간값 기준 어느 한쪽으로 위치를 이동시키더라도 전체 거리의 합이 증가할 수밖에 없으므로 중간값이 최적의 값이 된다.
## [문제 2] 호반우 상인의 이상한 품질 계산법 (그리디)
가장 큰 수부터 가장 많이 카운트하도록 묶으려면 (가장 작은 값, 가장 큰 값)으로 최대한 묶어야 한다.
## [문제 3] 벼락치기 (dp, 배낭문제)
knapsack문제로 이차원배열을 사용해서 구하면 되는 문제였다. 
dp로 일차원배열을 사용할 경우 역순으로 dp를 업데이트한다.

dp[t] = t일을 사용할 수 있을 때 얻을 수 있는 최대 이익


