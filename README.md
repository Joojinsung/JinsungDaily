# JinsungDaily

JinsungDaily는 제 일상을 기록하고 공유하기 위한 개인 블로그 프로젝트입니다.
개인블로그이지만 다수의 사용자가 이용할 수 있도록 설계하여 개발중입니다. 

## 기술 스택

- 언어: Java
- JDK: 17
- 프레임워크: Spring Boot 3.2.3
- ORM: Spring Data JPA
- 보안: Spring Security, JWT, OAuth2 (구글)
- 데이터베이스: MariaDB, Redis
- 스토리지: AWS S3
- 서버: AWS EC2
- 빌드 도구: Gradle
- 배포: AWS EC2, Amazon S3, Amazon Route53, AWS 로드 밸런서

## 구조도

![구조도](structure.png)

## 주요 기능

### 회원

- 회원가입 및 로그인
- 이메일 중복 체크
- OAuth2 (구글) 로그인 지원
- Access Token 발급 및 관리

### 게시글

- 게시글 등록, 수정, 삭제
- 이미지 업로드

### 댓글

- 댓글 등록, 수정, 삭제
- 다수의 댓글 작성 가능


## 패키지 구조

![패키지 구조](package_structure.png)

## REST API 문서

- [API 문서 링크](link_to_api_documentation)

## ERD

- ERD 다이어그램을 추가하기

