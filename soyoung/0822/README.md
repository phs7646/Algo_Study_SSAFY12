# 2024/08/23 풀이
시간 안에 해결한 문제 :

추가로 해결한 문제 : 2
## [문제 2] 행운의 문자열 (백트래킹)
### 잘못된 접근 방식
입력값이 작아 백트래킹으로 풀었다.
재귀호출 시 이때까지 만들어진 문자열, 방문체크 배열을 넘겨주었는데 메모리 초과가 발생했다.
### 풀이 1 : next permutation
주어진 문자열의 모든 사전 순 정렬 결과 중 행운의 문자열을 만족하는 경우를 카운트한다.
자바에는 관련 함수를 지원하지 않기 때문에 np()를 직접 구현했다. 
### 풀이 2 : 백트래킹
같은 백트래킹이지만 이 방법은 행운의 문자열을 만드는 모든 경우를 탐색하지 않는다.
알파벳의 종류과 개수를 저장해둔 후 이 재료로 행운의 문자열을 몇 개 만들 수 있는지 카운트한다.


