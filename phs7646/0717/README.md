시간 안에 해결한 문제 : 1,2,3,4 

# 문제 요약

### 1번
그리디 : 길이부터 정하고 가장 작은수로 먼저 채운다음,
자릿수가 큰수부터 가능한 가장 큰 값 넣기

### 2번
그리디 : 팁을 확보할 사람을 고르기.
큰사람부터 선택하고, 선택할때마다 이미선택된 사람들 한칸씩 뒤로 밀기.
다음 사람을 선택했을때 팁보다 페널티가 크면 그만 선택

### 3번
완전탐색(백트래킹)
그냥 삼중포문으로 할걸

### 4번
그리디
변하지 않고 확보할 수 있는 최대 maxL길이 찾기
확보 가능한 조건 :
B의 뒤에서부터 maxL 길이 만큼의 문자열이
A에서 순서대로 있어야함(붙어있을 필요는 없음)

# TIL

오늘 그리디 문제가 3문제나 출제되었는데, 3문제 다 운이 좋게 금방 아이디어를 떠올린 것 같다.

### 3번
3개를 고르는거라 그냥 3중 포문이 깔끔했을 것 같은데 백트래킹을 구현하느라 시간을 많이 쓴 것 같다.
