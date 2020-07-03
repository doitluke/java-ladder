package ladder.domain;

import ladder.utils.InputUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static ladder.domain.User.MAX_NAME_LENGTH;
import static ladder.utils.InputUtils.BLANK;
import static ladder.utils.InputUtils.COMMA;

public class Prize {

    private List<String> prizes;
    public Prize(String prize) {
        this(Arrays.stream(InputUtils.isEmptyOrNull(prize).split(COMMA))
                .map(String::trim)
                .filter(text -> !text.isEmpty())
                .collect(Collectors.toList()));
    }

    public Prize(List<String> prizes){
        this.prizes = prizes;
    }

    public int getPrizeCount(){
        return prizes.size();
    }

    @Override
    public String toString() {
        return prizes.stream().map(prize -> {
            int needBlank = MAX_NAME_LENGTH - prize.length();
            return String.join("", Collections.nCopies(needBlank, BLANK)) + prize;
        }).collect(Collectors.joining(BLANK));
    }
}
