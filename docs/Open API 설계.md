# **2. 설계 - 1. Open API 설계**
# **1. Open API 목록**

|**Tag**|**Method**|**Endpoint**|**Summary**|
| :-: | :-: | :-: | :-: |
|수강신청|GET|/courses|교육과정 목록 조회|
|수강신청|POST|/enrollments/draft|수강신청서 임시 저장|
|수강신청|POST|/enrollments/submit|수강신청서 최종 제출|
|수강신청|GET|/enrollments/status|수강신청 상태 확인|
|수강신청|POST|/enrollments/{id}/cancel|수강신청 취소 요청|
|회원가입|GET|/members/signup/types|회원유형 목록 조회|
|회원가입|POST|/members/signup/basic-info|기본정보 입력|
|회원가입|POST|/members/signup/agreements|약관 동의 저장|
|회원가입|POST|/members/signup/verification|본인인증 요청|
|회원가입|GET|/members/signup/complete|회원가입 완료 정보 조회|
|회원가입|PUT|/members/profile|회원정보 수정|
|회원가입|GET|/members/profile/history|회원정보 수정 이력 조회|
|프로그램관리|POST|/programs|교육 프로그램 등록|
|프로그램관리|POST|/programs/{id}/deactivate|교육 프로그램 폐지 요청|
|프로그램관리|GET|/instructors/search|강사 검색|
|프로그램관리|POST|/instructors/assign|강사 배정|
|프로그램관리|POST|/programs/{id}/schedule|교육 프로그램 일정 설정|
|프로그램관리|POST|/programs/{id}/mixed-mode|혼합교육 운영 설정|
|콘텐츠관리|POST|/contents|콘텐츠 업로드|
|콘텐츠관리|PUT|/contents/{id}/modification-request|콘텐츠 수정 요청|
|콘텐츠관리|PUT|/contents/{id}/review|콘텐츠 검수 처리|
|콘텐츠관리|PUT|/contents/{id}/categories|콘텐츠 분류 설정|
|시설관리|POST|/rooms|강의실 정보 등록|
|시설관리|GET|/rooms/{id}/location|강의실 위치 정보 제공|
|시설관리|PUT|/rooms/{id}/usage-info|강의실 이용안내 설정|
|시설관리|POST|/reservations|대관 신청 등록|
|시설관리|PUT|/reservations/{id}/status|대관 예약 승인 또는 반려 처리|
|시설관리|GET|/reservations/status|대관 이용현황 조회|
|수강신청|GET|/certificates/download|수료증 PDF 다운로드|
|평가관리|POST|/surveys|설문 등록|
|평가관리|POST|/surveys/{id}/responses|설문 응답 제출|
|평가관리|POST|/exams|시험 출제|
|평가관리|POST|/exams/{id}/submit|시험 응시 제출|
|평가관리|POST|/exams/{id}/autograde|시험 자동 채점|
|평가관리|GET|/exams/statistics|시험 통계 조회|
|포털관리|GET|/mypage|마이페이지 조회|
|포털관리|POST|/instructors/apply|강사 등록 신청|
|포털관리|GET|/instructors/{id}/history|강사 강의 이력 조회|
|포털관리|PUT|/instructors/applications/{id}/status|강사 승인 또는 반려 처리|
|포털관리|POST|/notices|공지사항 등록|
|포털관리|GET|/notices|공지사항 목록 조회|
|콘텐츠관리|POST|/contents/request|희망 콘텐츠 신청|
|포털관리|POST|/faqs|FAQ 등록|
|포털관리|GET|/faqs|FAQ 목록 조회|
|공통관리|POST|/system-config/ui-elements|UI 요소(메뉴/팝업/약관) 등록|
|공통관리|POST|/permissions|권한 설정 요청|
|공통관리|PUT|/permissions/{id}/status|권한 승인/반려 처리|
|공통관리|POST|/codes|공통 코드 등록|
|공통관리|PUT|/codes/{id}|공통 코드 수정|
|공통관리|DELETE|/codes/{id}|공통 코드 삭제|
|공통관리|POST|/notifications/sms|SMS 발송 요청|
|공통관리|GET|/notifications/sms/history|SMS 발송 이력 조회|
|정산관리|POST|/payments/enrollments|수강신청 결제 처리|
|정산관리|POST|/payments/enrollments/{id}/refund|수강신청 환불 요청 및 처리|
|정산관리|POST|/settlements/instructors|강사비 정산 등록|
|연계관리|POST|/integration/members/sync|통합회원 정보 연계 동기화|
|연계관리|POST|/integration/courses/sync|외부 교육과정 정보 연계|
|연계관리|POST|/integration/completions|교육수료 정보 외부 전송|
|연계관리|POST|/integration/certificates/request|수료증 신청 연계|
|연계관리|POST|/integration/certificates/history|수료증 발급 이력 수신|
# ** 
