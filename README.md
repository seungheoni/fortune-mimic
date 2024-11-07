# Toy Project: 행운을 말하는 미믹

## 프로젝트 개요
이 프로젝트의 주요 기능은 사용자에게 오늘의 운세와 행운의 메시지를 제공하는 것입니다. Flutter 앱에서 사용자가 요청을 보내면, Spring AI가 Ollama를 통해 운세와 행운의 메시지를 생성하고 그 결과를 사용자에게 반환합니다.

## 기술 스택
- **Ollama**: 로컬 AI 모델 호스팅 및 텍스트 생성 처리
- **Spring AI**: Ollama와 상호작용하는 백엔드 애플리케이션 구성
- **Flutter**: 사용자 인터페이스 및 클라이언트 애플리케이션

### 구성도
![image](https://github.com/user-attachments/assets/15a35521-0831-4469-abb0-f7b5029315b6)

## 구성 및 설정
### 1. Ollama 설치 및 모델 다운로드
<details>
<summary>설치 및 다운로드 방법 보기</summary>

- Ollama 설치 후 필요한 모델을 다운로드:
  ```bash
  ollama pull EEVE-Korean-10.8B
