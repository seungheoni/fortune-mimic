# Toy Project: Backend Server with Ollama, Spring AI, and Flutter

## 프로젝트 개요

이 프로젝트는 Ollama, Spring AI, 그리고 Flutter를 사용해 구성한 백엔드 서버입니다. Ollama는 로컬에서 모델을 구동하고, Spring AI는 Ollama와 연결되어 사용자 요청을 처리합니다. Flutter는 사용자 인터페이스로, 백엔드와 통신해 결과를 화면에 보여줍니다.

## 기술 스택
- **Ollama**: 로컬 AI 모델 호스팅 및 텍스트 생성 처리
- **Spring AI**: Ollama와 상호작용하는 백엔드 애플리케이션 구성
- **Flutter**: 사용자 인터페이스 및 클라이언트 애플리케이션

## 프로젝트 구조
- **Ollama 서버**: 로컬 머신에 AI 모델을 호스팅하고 `http://<server-ip>:11434`에서 서비스 제공.
- **Spring AI**: Ollama의 API와 통신하여 클라이언트의 요청을 처리하고 필요한 응답 생성.
- **Flutter 앱**: 백엔드와 통신하여 Ollama의 응답을 사용자에게 표시.

### 구성도
![image](https://github.com/user-attachments/assets/adcb37ab-f8e9-4569-a14a-70b4ca236623)




## 구성 및 설정
### 1. Ollama 설치 및 모델 다운로드
<details>
<summary>설치 및 다운로드 방법 보기</summary>

- Ollama 설치 후 필요한 모델을 다운로드:
  ```bash
  ollama pull EEVE-Korean-10.8B
