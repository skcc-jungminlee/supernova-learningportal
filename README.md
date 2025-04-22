# AI Hackathon
**Team Super NOVA** 

## 분석
### 도메인 모델링
- 산출물
    - 도메인 모델 다이어그램
- 산출물 링크
    - https://github.com/skcc-jungminlee/supernova-learningportal/blob/master/docs/1.%20%EB%B6%84%EC%84%9D%20-%201.%20%EB%8F%84%EB%A9%94%EC%9D%B8%20%EC%A0%95%EC%9D%98%EC%84%9C.png
- AI 활용 내용
    - ChatGPT 활용한 PlantUML 도출
### 비즈니스 모델링
- 산출물
  - 1. 분석 - 2. 비즈니스 정의서
- 산출물 링크
  - 할루시네이션(hallucination) 검증
    - ChatGPT와 PerPlexity로 Cross-Check
    - RFP 기반 누락 사항 검증 
- AI 활용 내용
  - https://github.com/skcc-jungminlee/supernova-learningportal/blob/master/docs/1.%20%EB%B6%84%EC%84%9D%20-%202.%20%EB%B9%84%EC%A7%80%EB%8B%88%EC%8A%A4%EC%A0%95%EC%9D%98%EC%84%9C.md
### 요구사항 정의
- 산출물
  - 1. 분석 - 3. 요구사항 정의서
    - 1. (대분류 별)
       - 요구사항 ID, 요구사항 유형, 대분류, 중분류, 소분류, 요구사항명, 요구사항 설명, 중요도, 난이도, 관련부서, 관련 비즈니스 패키지 ID, 관련 근거
- 산출물 링크
  - https://github.com/skcc-jungminlee/supernova-learningportal/blob/master/docs/1.%20%EB%B6%84%EC%84%9D%20-%203.%20%EC%9A%94%EA%B5%AC%EC%82%AC%ED%95%AD%20%EC%A0%95%EC%9D%98%EC%84%9C.md
- AI 활용 내용
  - ChatGPT 활용 반복적 품질 개선
    - 원하는 Output 도출
### 유스케이스 모델링
- 산출물
  - 1. 분석 - 4. 유스케이스 명세서
    - 1. 유스케이스 목록
      - 유스케이스 ID, 유스케이스명, 주요 액터, 대분류, 중분류, 소분류, 관련 요구사항 ID
    - 2. 유스케이스 상세
      - (유스케이스 별)
        - 유스케이스 ID, 유스케이스명, 관련 비즈니스 패키지, 관련 요구사항, 액터, 사전 조건, 사후 조건
        - 기본 흐름
        - 대안 흐름
        - 예외 흐름
        - 상호작용 다이어그램
- 산출물 링크
  - https://github.com/skcc-jungminlee/supernova-learningportal/blob/master/docs/1.%20%EB%B6%84%EC%84%9D%20-%204.%20%EC%9C%A0%EC%8A%A4%EC%BC%80%EC%9D%B4%EC%8A%A4%20%EB%AA%85%EC%84%B8%EC%84%9C.md
- AI 활용 내용
  - ChatGPT 활용 반복적 품질 개선
    - 원하는 Output 도출
### 사용자 인터페이스 정의
- 산출물
  - 1. 분석 - 5. 사용자 인터페이스 정의서
        1. 메뉴 목록
            - 메뉴 ID, 상위 메뉴, 메뉴명, 설명

        2. 화면 목록
            - 화면 ID, 화면명, 화면구분, 관련 메뉴 ID, 설명

        3. 화면 정의
            ㅇ (화면 별)
                - 화면 설명
                - 항목 구성 (구분, 항목명, 항목 속성, 설명)
- 산출물 링크
    - https://github.com/skcc-jungminlee/supernova-learningportal/blob/master/docs/1.%20%EB%B6%84%EC%84%9D%20-%205.%20%EC%82%AC%EC%9A%A9%EC%9E%90%20%EC%9D%B8%ED%84%B0%ED%8E%98%EC%9D%B4%EC%8A%A4%20%EC%A0%95%EC%9D%98%EC%84%9C.md
- AI 활용 내용
  - ChatGPT 활용 반복적 품질 개선
    - 원하는 Output 도출

## 설계
### Open API 설계
- 산출물
  - 2. 설계 - 1. Open API 설계서
    - 1. Open API 목록
      - Tag, Mehod, Endpoint, Summary
  - 2. 설계 - 2. Open API Specification(yaml)
    - Open API Specfication 3.0 Yaml
- 산출물 링크
  - https://github.com/skcc-jungminlee/supernova-learningportal/blob/master/docs/2.%20%EC%84%A4%EA%B3%84%20-%202.%20Open%20API%20Specification.yaml
- AI 활용 내용
  - ChatGPT 활용 반복적 품질 개선
    - 원하는 Output 도출
### 도메인 모델링
- 산출물
  - 2. 설계 - 3. 도메인 모델 설계서
    - 1. 도메인 모델 다이어그램
    - 2. Entity 목록
        - Entity명, 설명
    - 3. Entity 상세
- 산출물 링크
  - https://github.com/skcc-jungminlee/supernova-learningportal/blob/master/docs/2.%20%EC%84%A4%EA%B3%84%20-%203.%20%EB%8F%84%EB%A9%94%EC%9D%B8%20%EB%AA%A8%EB%8D%B8%20%EC%84%A4%EA%B3%84%EC%84%9C.md
- AI 활용 내용
  - Cursor AI와 ChatGpt를 활용
    - Open API Specification 기반 생성
### 데이터 모델링
- 산출물
  - 2. 설계 - 4. 데이터 모델 설계서
    - 데이터 모델 다이어그램
- 산출물 링크
  - https://github.com/skcc-jungminlee/supernova-learningportal/blob/master/docs/2.%20%EC%84%A4%EA%B3%84%20-%204.%20%EB%8D%B0%EC%9D%B4%ED%84%B0%20%EB%AA%A8%EB%8D%B8%20%EC%84%A4%EA%B3%84%EC%84%9C.md
- AI 활용 내용
  - Cursor AI와 ChatGpt를 활용
    - Open API Specification 기반 생성

## 구현
### 프론트엔드
- 산출물
  - 3. 구현 - 1. 프론트엔드
    - 프론트엔드 개발 결과
    - 화면 ID 별 개발 내역
- 산출물 링크
  - https://github.com/skcc-jungminlee/supernova-learningportal/blob/master/docs/3.%20%E1%84%80%E1%85%AE%E1%84%92%E1%85%A7%E1%86%AB%20-%201.%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%86%AB%E1%84%90%E1%85%B3%E1%84%8B%E1%85%A6%E1%86%AB%E1%84%83%E1%85%B3.md
- AI 활용 내용
    - Figma MCP 활용 반복적 품질 개선
        - 디자인 시스템 생성 
    - Cursor AI로 소스코드 생성
        - Open API Specification 기반 생성
### 백엔드
- 산출물
  - 3. 구현 - 2. 백엔드
    - 백엔드 개발 결과 - Swagger UI
- 산출물 링크
  - https://github.com/skcc-jungminlee/supernova-learningportal/blob/master/docs/3.%20%EA%B5%AC%ED%98%84%20-%202.%20%EB%B0%B1%EC%97%94%EB%93%9C.md
- AI 활용 내용
  - Cursor AI 활용 반복적 품질 개선

## 표준
### DBMS 표준
- 산출물
  - 4. 표준 - 1. PostgreSQL Naming Rules
- 산출물 링크
  - https://github.com/skcc-jungminlee/supernova-learningportal/blob/master/docs/4.%20%ED%91%9C%EC%A4%80%20-%201.%20PostgreSQL_Naming_Rules.md
- AI 활용 내용