package nextstep.optional;

import java.util.Arrays;
import java.util.stream.Stream;

enum Expression {
    PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/");

    private String expression;

    Expression(String expression) {
        this.expression = expression;
    }

    private static boolean matchExpression(Expression e, String expression) {
        return expression.equals(e.expression);
    }

    static Expression of(String inputExpression) {
        return Arrays.stream(values())
                .filter(enumExpression -> matchExpression(enumExpression, inputExpression))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("%s는 사칙연산에 해당하지 않는 표현식입니다.", inputExpression)));
    }
}
