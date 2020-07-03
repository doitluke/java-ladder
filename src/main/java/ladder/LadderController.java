package ladder;

import ladder.domain.*;
import ladder.ui.OutputView;

public class LadderController {

    private Users users;
    private Prize prize;

    public LadderController(Users users, Prize prize){

        if(users.getUserCount() != prize.getPrizeCount()){
            throw new IllegalArgumentException("상품수가 유저 수와 다를 수가 없습니다.");
        }
        this.users = users;
        this.prize = prize;

    }

    public void drawLadderGame(Height height){
        Ladder ladder = new Ladder(height.getHeight(),users.getUserCount());
        OutputView.drawLadder(ladder, users, prize);
    }

    public String matchResult(User user) {
        int startPostion = users.findStartIndex(user);

        return null;
    }
}
