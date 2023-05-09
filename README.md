## IT Blog 검색 사이트

### 프로젝트 목적
- 구글링을 통해 다양한 기술블로그를 접하다 보니 잘못된 정보를 전달하는 블로그가 너무 많다는 것을 느꼈습니다
- 망나니 개발자, Strangers Lab 등 제게 가장 맞는 기술 블로그들의 포스트를 우선적으로 검색하고 싶어서 기획하였습니다
- 테스트 주도 개발을 통해 리팩토링 과정이 용이하도록 합니다

### 프로젝트의 용도
- 키워드 검색 시, 유저가 구독한 블로그 포스트들이 우선적으로 검색됩니다
- 블로그 방문자수, 업로드 날짜, 좋아요 수 등 입맛에 맞게 포스트들이 정렬됩니다
- 포스트들을 통해 자신이 이해하고 공부한 내용을 마이페이지에 정리 후 저장할 수 있습니다

### 예상 프로젝트 기간
2023.05.09 ~ 2023.06.23 (1달 반 정도 예상)

### 사용할 기술

#### 백엔드
<p align="left">
   <img src="https://img.shields.io/badge/spring Boot-6DB33F?style=flat-square&logo=spring Boot&logoColor=white"/>
  <img src="https://img.shields.io/badge/spring Security-6DB33F?style=flat-square&logo=spring Security&logoColor=white"/>
  <img src="https://img.shields.io/badge/MariaDB-003545?style=flat-square&logo=MariaDB&logoColor=white"/>
  <img src="https://img.shields.io/badge/JUnit5-25A162?style=flat-square&logo=JUnit5&logoColor=white"/>
  <img src="https://img.shields.io/badge/Amazon AWS-232F3E?style=flat-square&logo=Amazon AWS&logoColor=white"/>
  <img src="https://img.shields.io/badge/Swagger-85EA2D?style=flat-square&logo=Swagger&logoColor=white"/>
  <img src="https://img.shields.io/badge/Apache Tomcat-F8DC75?style=flat-square&logo=Apache Tomcat&logoColor=white"/>
</p>

- Java 11
- JPA, QueryDSL(OSM)
- OAuth2.0, JWT(Login)


#### 형상관리
<p align="left">
  <img src="https://img.shields.io/badge/Git-F05032?style=flat-square&logo=Git&logoColor=white"/>
  <img src="https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=GitHub&logoColor=white"/>
</p>

#### 커뮤니케이션

<p align="left">
  <img src="https://img.shields.io/badge/Slack-4A154B?style=flat-square&logo=Slack&logoColor=white"/>
</p>


#### 일정관리

- Flow

#### ERD
- ERD Cloud

### 기술 명세

##### 로그인
- 소셜로그인(구글, 네이버, 깃허브) 및 로그인 기능 지원

##### 회원가입
- 소셜로그인을 통한 계정연동 및 회원가입 기능 지원

##### 홈
- 최신 포스트들이 표시되고, 클릭하면 해당 포스트로 Redirect 됩니다

##### 검색
- 키워드 검색 및 찜한 블로그 우선 정렬
- 날짜별, 좋아요 순 정렬기능

##### 마이페이지
- 자신의 페이지에 포스트를 정리


### 협업
- https://github.com/Kim-Jin-Uk/blog-with-mark-down-editor 
- 프론트엔드 개발자와 협업으로 
