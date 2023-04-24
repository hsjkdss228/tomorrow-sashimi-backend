# 클론 코딩 프로젝트: 내일회

## 개발 기간

- 2023.4.24 ~ 진행중

## Tech Stack

### Language

[![Java Badge](https://img.shields.io/badge/Java-007396?style=flat-square)]()

### Framework, Dependencies, Etc.

[![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=flat-square&logo=SpringBoot&logoColor=white)]()
[![Spring Security Badge](https://img.shields.io/badge/Spring%20Secutiry-6DB33F?style=flat-square&logo=SpringSecurity&logoColor=white)]()
[![Spring Data JPA Badge](https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=flat-square)]()
[![PostgreSQL Badge](https://img.shields.io/badge/PostgreSQL-4169E1?style=flat-square&logo=PostgreSQL&logoColor=white)]()
[![JUnit5 Badge](https://img.shields.io/badge/JUnit5-25A162?style=flat-square&logo=JUnit5&logoColor=white)]()
[![Gradle Badge](https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=Gradle&logoColor=white)]()

## 사용자 스토리

### 상품 목록

- 구매자는, 상품 목록을 조회해, 등록된 상품들의 기본 사진이나 중요한 정보들만을 빠르게 알 수 있다.

### 상품 상세 정보

- 구매자와 판매자는, 상품의 등록 정보를 확인해, 해당 상품에 대해 구체적으로 알 수 있다.
- 구매자는, 특정 상품의 상세정보를 조회해, 등록된 상품에 대한 모든 정보를 알 수 있다.
  - 다른 고객이 함께 조회한 상품 목록을 확인해,
    관련있는 다른 상품들은 무엇이 있는지 목록으로 돌아가지 않아도 쉽고 빠르게 알 수 있다.
- 판매자는, 특정 상품을 등록해, 구매자가 해당 브랜드의 상품을 확인할 수 있도록 할 수 있다.
- 판매자는, 특정 상품의 등록 정보를 변경해, 상품 정보를 최신화할 수 있다.
- 판매자는, 특정 상품을 삭제해, 구매자가 더 이상 해당 상품을 확인하지 못하게 할 수 있다.

### 상품 후기

- 구매자는, 상품의 후기를 확인해, 다른 고객들이 상품에 내린 평가를 참고할 수 있다.

### 장바구니

- 구매자는, 장바구니에 등록된 상품 개수를 조회해, 구매 의사가 있는 상품이 얼마나 있는지 빠르게 확인할 수 있다.
- 구매자는, 장바구니를 조회해, 구매 의사가 있는 상품 목록을 한 번에 빠르게 확인할 수 있다.
- 구매자는, 상품을 장바구니에 추가해, 해당 상품에 구매 의사가 있음을 확실하게 할 수 있다.
- 구매자는, 장바구니에 등록된 상품의 수량을 변경해, 구매 의사가 있는 상품의 희망 구매 개수를 관리할 수 있다.
- 구매자는, 장바구니에 등록된 상품을 삭제해, 구매 의사가 없어진 상품을 더 이상 인지하지 않을 수 있다.

### 결제

- 구매자는, 구매를 희망하는 상품들의 대금을 결제해, 구매 의사가 있는 상품들의 구매를 확정할 수 있다.

### 주문 내역

- 구매자와 판매자는, 주문 내역 목록을 조회해, 여러 주문 내역들에서 중요한 정보들만을 빠르게 알 수 있다.
- 구매자와 판매자는, 특정 주문 내역의 상세정보를 조회해, 해당 주문 내역의 모든 정보를 알 수 있다.
- 구매자는, 특정 주문 내역의 주문을 취소해, 배송을 원하지 않는 주문 내역을 철회할 수 있다.
- 판매자와 배송자는, 특정 주문 내역의 주문 상태를 변경해, 구매자가 배송 상태를 정확하게 인지하도록 할 수 있다.

### 로그인

- 구매자, 판매자 및 배송자는, 로그인을 해, 로그인이 필요한 모든 기능을 사용할 수 있다.

### 회원가입

- 구매자, 판매자 및 배송자는, 회원가입을 해, 로그인이 가능한 계정을 생성할 수 있다.
- 구매자, 판매자 및 배송자는, 계정 정보를 변경해, 판매자나 배송자가 자신의 정보를 정확하게 인지하도록 할 수 있다.
