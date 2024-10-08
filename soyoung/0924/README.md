# 2024/09/24 풀이
시간 안에 해결한 문제 : 1 2

추가로 해결한 문제 : 3
## [문제 1] 소가 길을 건너간 이유 3 (구현, 정렬)
이차원 배열의 1열에 소의 도착시간, 2열에 검문 시간을 저장하고, 도착시간 순서대로 정렬한다.

도착시간이 빠른 소부터 순서대로 '도착시간 + 검문시간'을 계산해 입장 시간을 구한다.

만약 이전 소 입장시간이 다음 소 도착시간보다 늦으면, 다음 소는 '이전 소 입장시간 + 본인의 검문시간'으로 입장 시간을 구한다.

## [문제 2] 내 뒤에 나와 다른 수 (구현)

본인보다 뒤에 있는데 본인과 같지 않은 수 중 가장 작은 수를 구하는 문제이다.

다른 숫자가 입력되었다면 지금까지 같은 숫자가 나온 갯수 만큼 현재 인덱스로 채운다.

## [문제 3] 휴먼 파이프라인 (그리디, 정렬)

N명을 작업 속도 기준으로 정렬한 후 0번째 ~ i번째, i+1번째 ~ N-1번째의 두 팀으로 나눈다.

각 팀의 작업 속도를 '팀에서 가장 느린 사람의 속도 * 팀원 수'로 계산하여 가장 빠른 속도를 계산한다.

(두 팀은 동시에 일을 시작할 수 있으므로, 두 팀의 속도를 비교할 필요는 없다.) 

K를 최고 속도로 나누어 답을 구한다.
