---
# 문제

## 1번

14495 피보나치 비스무리한 수열 : f(n)= f(n-1) + f(n+3) 수열 만들기  
DP  

## 2번
17216 가장 큰 감소 부분 수열 : 수열에서 감소하는 수열중 합이 가장 큰 감소수열 구하기  
DP  

## 3번
17141 연구소2 : 바이러스가 가장 빨리 모든곳에 퍼지는 시간 구하기  
dfs, bfs  

## 4번 - 풀이중
위상정렬

---

# TIL

2번  
모든 수를 고려하지 못했다가 while안의 break문을 해제하고 맞춤  
모든 수 고려 생각하기

3번  
main문에서 실수로 int N으로 계속 사용해서 풀이시간중에 계속 함수로 올바른 N 값이 넘어가지못해서  
시간외에 풀 수 있었음, 2번과 마찬가지로 모든 경우의수 고려 해야 해서 반례 찾아서 해결함  