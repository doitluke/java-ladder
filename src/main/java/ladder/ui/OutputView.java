package ladder.ui;

import ladder.domain.Ladder;
import ladder.domain.Prize;
import ladder.domain.Users;

public class OutputView {

    private OutputView(){
    }

    public static void drawLadder(Ladder ladder, Users users, Prize prize){
        System.out.println(users);
        System.out.println(ladder);
        System.out.println(prize);
    }

    public static void gameResult(String result){
        System.out.println("실행 결과");
        System.out.println(result);
    }

}
