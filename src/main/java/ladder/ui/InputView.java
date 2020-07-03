package ladder.ui;

import ladder.domain.Height;
import ladder.domain.Prize;
import ladder.domain.User;
import ladder.domain.Users;
import ladder.utils.InputUtils;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static Users inputUser() {

        System.out.println("참여할 사람 이름을 입력하세요.");
        String usersName = scanner.next();
        InputUtils.isEmptyOrNull(usersName);
        return new Users(usersName);

    }

    public static Height inputHeight() {

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return new Height(scanner.nextInt());

    }

    public static Prize inputPrize(){
        System.out.println("실행 결과를 입력하세요.( 결과는 쉼표(,)로 구분하세요");
        return new Prize(scanner.next());
    }

    public static User inputWantResult(){
        System.out.println("결과를 보고 싶은 사람은?");
        return new User(scanner.next());
    }
}
