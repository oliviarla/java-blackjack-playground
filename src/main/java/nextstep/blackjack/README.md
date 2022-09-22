# 설계

### Denomination
- 상태
  - 2~9, ACE, K, Q, J 중 하나의 값을 갖도록 한다.
- 행동


### Suit
- 상태
  - 네 종류의 모양 중 하나를 갖도록 한다.
- 행동

### PlayingCard
- 상태
  - Denomination과 Suit 변수를 가진다.
- 행동

### Cards
- 상태
  - PlayingCard의 리스트를 가진다.
- 행동
  - Card들의 총합을 계산한다.
  - isBust()
  - isBlackjack()
  - isStay()

### State
- 상태
  - draw(), stay(), isFinished(), cards(), profit() 메소드를 가진 인터페이스

### Started
- 상태
  - cards를 가진다.

- 행동
  - State의 cards() 메소드를 구현해 cards를 정보를 반환한다.

### Running
- 상태
  - 플레이어의 게임 진행 여부 가진다.
- 행동
  - 플레이어의 활동이 끝났는 지 확인한다.
  - 플레이어의 수익을 계산해 반환한다.

### Finished
- 상태
  - 플레이어가 더이상 카드를 뽑지 않아 승패가 가려진 상태
  - earning rate를 가져 수익을 계산할 수 있도록 함
- 행동
  - isFinished에서 true를 반환해 종료하도록 한다.
  - profit을 계산하여 반환할 수 있다.

### 힛(Hit)
- 행동 
  - draw()를 구현해 처음 2장의 상태에서 카드를 더 뽑을 수 있다.
  - stay()를 구현해 처음 2장의 상태를 유지할 수 있다.
  
### 스테이(Stay)
- 상태
  - 카드를 더 뽑지 않고 차례를 마쳐 Finished를 상속받은 상태
- 행위
  - 딜러의 Cards와 비교해 이기면 earning rate 1, 지면 earning rate 0 반환

### 블랙잭(Blackjack)
- 상태
  - 처음 두 장의 카드 합이 21이어서 Finished를 상속받은 상태
- 행동
  - earning rate로 1.5 반환

### 버스트(Bust)
- 상태
  - 카드 총합이 21을 넘어 Finished를 상속받은 상태
- 행동
  - earning rate로 0을 반환


