# 사다리 게임
## 요구사항
- [x] 사다리 게임에 참여하는 사람에 이름을 최대5글자까지 부여할 수 있다. 
- [x] 사다리를 출력할 때 사람 이름도 같이 출력한다.
  - 사람 당 라인 하나이다.
- [x] 사람 이름은 쉼표(,)를 기준으로 구분한다.
- [x] 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
- [x] 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야 한다.
  - `|-----|-----|` 모양과 같이 가로 라인이 겹치는 경우 어느 방향으로 이동할지 결정할 수 없다.
  - 맨 처음 점은 50% 확률로 활성화된 점이 생성된다.
  - 앞의 점이 활성화된 점이라면 그 뒤의 점은 비활성화된 점으로 생트된다.
  - 앞의 점이 비활성화된 점이라면 뒤의 점은 50% 확률로 활성화 된 점으로 생성된다.
- [x] 점과 점끼리 연결 되어있는지 확인할 수 있다.
- [x] 점의 위치는 1부터 시작한다.
- [ ] 세로 위치도 신경써야 하는지
- [x] 사다리의 높이를 입력 받으면 높이 만큼의 선이 생성된다.
