package ladder;

import ladder.domain.Height;
import ladder.domain.Prize;
import ladder.domain.User;
import ladder.domain.Users;
import ladder.ui.InputView;
import ladder.utils.InputUtils;

public class LadderMain {

    public static void main(String[] args) {



        Users users = InputView.inputUser();
        Prize prize = InputView.inputPrize();

        LadderController ladderController = new LadderController(users,prize);
        Height height = InputView.inputHeight();

        ladderController.drawLadderGame(height);

        User user = InputView.inputWantResult();
        String result = ladderController.matchResult(user);

    }
}
