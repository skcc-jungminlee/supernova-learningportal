# **공공사업 프로젝트 데이터베이스 네이밍 규칙 (PostgreSQL)**
## **1. 공통 원칙 (General Guidelines)**
- - 언어: 영어 사용 (일관성 및 국제화 고려)
- - 표기법: 스네이크 케이스 (snake\_case) 사용
- - 대소문자: 소문자만 사용 (PostgreSQL은 대소문자 구분에 민감)
- - 명확한 의미 전달을 위한 명사 위주 네이밍
- - 약어는 자제하되, 널리 사용되는 약어(id, url)는 허용
## **2. 테이블 명 (Table Names)**
- - 복수형 사용 권장 (예: projects, contracts)
- - 도메인 접두사 사용 가능 (예: infra\_projects, edu\_schools)
- - 중간 테이블은 연결 대상 테이블명을 \_로 연결 (예: project\_contracts)
## **3. 컬럼 명 (Column Names)**
- - 기본 식별자: id, 또는 참조 대상명\_id (예: project\_id)
- - 날짜/시간: 접미사에 \_at, \_on 사용 (예: created\_at, approved\_on)
- - 상태값: is\_, has\_ 등의 접두어 사용 (예: is\_active, has\_attachment)
- - 수치: \_amount, \_count, \_rate 등의 접미사 사용 (예: budget\_amount)
- - 참조 키: 참조 테이블명\_id (예: contractor\_id, region\_id)
## **4. 제약조건 명 (Constraints)**
- - 기본 키: pk\_{table} (예: pk\_projects)
- - 외래 키: fk\_{table}\_{referenced} (예: fk\_contracts\_project\_id)
- - 유니크: uq\_{table}\_{column} (예: uq\_employees\_email)
- - 체크: chk\_{table}\_{column} (예: chk\_projects\_budget\_positive)
- - 인덱스: ix\_{table}\_{column} (예: ix\_contracts\_created\_at)
## **5. 기타 객체 (Views, Sequences, Functions)**
- - 뷰(View): vw\_{주제} (예: vw\_active\_projects)
- - 시퀀스(Sequence): {table}\_{column}\_seq (예: projects\_id\_seq)
- - 함수(Function): fn\_{기능} (예: fn\_calculate\_budget)
## **6. 예시 스키마 (Schema Example)**
- CREATE TABLE infra\_projects (
- `    `id SERIAL PRIMARY KEY,
- `    `name TEXT NOT NULL,
- `    `start\_date DATE,
- `    `end\_date DATE,
- `    `budget\_amount NUMERIC(15,2),
- `    `created\_at TIMESTAMP DEFAULT now(),
- `    `updated\_at TIMESTAMP
- );

- CREATE TABLE contractors (
- `    `id SERIAL PRIMARY KEY,
- `    `name TEXT NOT NULL,
- `    `contact\_email TEXT
- );

- CREATE TABLE project\_contractors (
- `    `project\_id INT REFERENCES infra\_projects(id),
- `    `contractor\_id INT REFERENCES contractors(id),
- `    `PRIMARY KEY (project\_id, contractor\_id)
- );
## **7. 컬럼명 축약 규칙 (Abbreviation Rules for Column Names)**
- - 컬럼명이 길어질 경우, 의미를 훼손하지 않는 범위 내에서 축약 사용
- - 자주 사용되는 단어는 표준 축약어로 치환
- - 축약 시에도 팀 내 일관성을 유지하고, 문서화 필수
- - 축약은 컬럼명에만 적용하고, 테이블명은 가능한 한 축약 자제

※ 표준 축약어 목록 (예시):

`  `- amount → amt  (예: budget\_amt)

`  `- number → no   (예: contract\_no)

`  `- date → dt     (예: start\_dt, end\_dt)

`  `- name → nm     (예: contractor\_nm)

`  `- status → sts  (예: approval\_sts)

`  `- count → cnt   (예: participant\_cnt)

`  `- address → addr (예: site\_addr)

`  `- identifier → id (예: project\_id)

`  `- organization → org (예: org\_id, org\_nm)

`  `- category → ctg (예: expense\_ctg)
