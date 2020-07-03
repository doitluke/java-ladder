package ladder.domain;

import ladder.utils.InputUtils;

import java.util.Collections;
import java.util.Objects;

import static ladder.utils.InputUtils.BLANK;
import static ladder.utils.InputUtils.MAX_NAME_LENGTH;

public class User {

    private String name;

    public User(String inputName) {
        String name = InputUtils.isEmptyOrNull(inputName);
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 5글자를 초과할 수 없습니다.");
        }
        this.name = inputName;
    }

    @Override
    public String toString() {
        int needBlank = MAX_NAME_LENGTH - name.length();
        return String.join("", Collections.nCopies(needBlank, BLANK)) + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
