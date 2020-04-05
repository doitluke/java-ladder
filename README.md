# 사다리 게임
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)



#개발계획
*사람수입력 - 사다리갯수입력 - 사다리생성 - 사다리사이라인생성 - 결과출력


#프로그램목록
* InputView - 사람수입력, 사다리수입력
* User - 사람에 관한 클래스/ 입력한 사람에 대하여 객체생성 / 이름 글자수 체크 / split 로직  
* Ladder - 사다리에 관한 클래스 / 입력받은 갯수에 대하여 객체생성 / 
* Line - 한 사다리당 라인 객체를 생성 / true, false 로 랜덤생성 / 이전것이 true 면 무조건 false / 
* ResultView - 실행결과 / 이름 객체 / 한라인당 사다리, 라인 출력 / 