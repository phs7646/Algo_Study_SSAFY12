시간 안에 해결한 문제 : 1,2
추가 해결한 문제 : 

# 문제 요약

### 1번

dfs

### 2번

dp

### 3번



### 4번



# TIL

### 1번
TSP라고도 자주 불리는 외판원 문제이다. 파이썬이긴 하지만 예전에 접했던 기억이 있었다.
유명한 문제로 추천을 받아 풀어본 경험이 도움이 됐던 것 같다.
단계별로 값을 갱신하고, 끝에 도달했을 때 되돌아가는 비용의 최소도 고려해야하는 까다로운 문제다.
중간에 Nullpointer 에러가 발생했고, 여러번 수정해도 나아지지 않아서 시간을 많이 소비했다.
코드를 다시 보니 isVisit[] 배열을 선언만 한 후 초기화하지 않은 상태로 사용해서 발생한 에러였다.
이런저런 오류를 고치고 발표를 담당하게 되었는데, 방문처리 배열이 한 번 순회한 이후 초기화가 제대로 이뤄지지 않고, 실질적인 의미가 없다는 피드백을 받았다. 설명해주시는 내용을 들으니 맞는 말 같았고, 다른 비슷한 문제를 풀 때 문제가 될 수 있는 부분이기도 해서 해당 부분은 다시 살펴봐야겠다.
### 2번
dp를 이용하되, 값의 합을 저장하지 않았고 가능 여부를 boolean형태로 저장해 해당 인덱스를 이용해 최대 볼륨에 가장 가까운 수를 찾았다. 기존엔 int배열로 선언해 뺀 값과 더한 값을 배열에 저장하고, 조건문을 이용해 값을 저장하였는데, 스스로 코드가 헷갈려 여러 실수들이 많았고, dfs에서 방문체크를 하는 방법과 이전에 풀었던 결혼식 문제와 약간 비슷한 느낌으로 boolean배열을 선언해서 [곡순서][해당볼륨사용가능여부]의 형태로 선언했고, 0이상 m이하인 값들만 true로 바꿔주었다. 배열순회가 끝나면 배열의 마지막 행의 가능한 오른쪽 열이 m과 가장 가까운 수였고, 이 값을 찾자마자 변수에 할당하고 루프를 빠져나와 출력하는 형태로 구현하였다. dfs에서도 했던 실수인데 dfs라고 무조건 델타를 이용한 탐색만 하지 않으며, dp라고 무조건 정수형의 값을 더해야만 하는 것은 아니다 라는 점을 배웠다. 