# 우주여행 티켓 재고 관리 시스템 설계

**목표**: 1분 내에 매진되는 인기 있는 행성 여행 티켓 판매 시스템을 위한 티켓 재고 관리 시스템을 구현

---

## 요구사항

1. **계정당 구매 가능 수량 제한**
   - 계정당 구매할 수 있는 화성(Mars)석, 금성(Venus)석 티켓을 **총 2장으로 제한**합니다.
   - 예) 금성석 2장과 화성석 2장(총 4장)은 구매 불가. 금성석 1장과 화성석 1장(총 2장)은 구매 가능.

2. **티켓 초과 판매 방지**
   - 보유하고 있는 티켓보다 **더 많은 티켓이 판매되지 않도록 재고를 철저히 관리**해야 합니다.
   - 매크로를 사용하는 부정 사용자로 인해 **하나의 계정에서 수많은 티켓 구매 요청**이 올 수 있습니다.

3. **초당 최소 1,000장의 티켓 구매 처리 성능 요구**
   - **5만 장의 티켓이 1분 내에 매진**되기 때문에, 초당 최소 **1,000장의 티켓 구매가 가능한 시스템**을 설계해야 합니다.
   - 구매에 실패한 요청(계좌 잔액 부족, 카드 비밀번호 오류 등)도 발생하기 때문에 **초당 1,000개 이상의 구매 요청이 발생**할 것을 염두에 둬야 합니다.

---