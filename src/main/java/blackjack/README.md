# 블랙잭
## 게임 규칙
- 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 배팅 금액을 획득
- 딜러와 플레이어는 1:1로 경기 진행
- 게임 시작 시 모두에게 2장의 카드를 지급
  - 플레이어
    - 2장의 카드 합이 21 미만일 경우 추가로 1장씩 뽑을 수 있음
    - 카드 추가로 뽑아 21 초과 시 배팅금액 모두 상실
  - 딜러
    - 2장의 카드 합이 16 이하이면 카드 1장 추가
    - 2장의 카드 합이 17 이상이면 동작 없음
- 딜러가 21 초과 시 남은 플레이어는 무조건 승리해 배팅 금액 획득

## 설계

### domain
- Person
  - Cards cards
  - Dealer
    - income
  - Player
    - int betAmount
    - 
- CardFactory
  - createCard()
- Card
  - String name
  - int value
- Cards
  - pickCard()
  - getAllCards()
  - getTotal()