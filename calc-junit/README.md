Java Calculator & JUnit4 테스트


Java로 간단한 사칙연산 컴포넌트(Calculator)를 구현하고, JUnit4 프레임워크를 이용해 해당 기능들을 테스트합니다.

프로젝트 구조
Calculator.java: 사칙연산 기능을 제공하는 메인 클래스.
CalculatorComponentTest.java: Calculator 클래스의 기능들을 테스트하는 JUnit 테스트 코드입니다

lib/: JUnit 라이브러리 파일(junit-4.13.2.jar, hamcrest-core-1.3.jar)이 포함된 폴더.

.vscode/settings.json: VS Code에서 테스트를 실행하기 위한 라이브러리 경로 설정 파일.


<실행 및 테스트 방법>
1. 프로젝트 열기: VS Code에서 calc-junit 폴더를 엽니다.

2. JUnit 라이브러리 추가: lib 폴더에 junit-4.13.2.jar와 
hamcrest-core-1.3.jar 파일이 있는지 확인합니다.

3.테스트 실행:

VS Code 왼쪽 사이드바에서 Test Runner 아이콘(플라스크 모양)을 클릭합니다.

4. CalculatorComponentTest.java 옆에 있는 재생(▶️) 버튼을 눌러 모든 테스트를 실행합니다.

5. 결과 확인: 모든 테스트가 성공적으로 통과하면 초록색 체크 표시가 나타납니다.

<JUnit 테스트 결과>

