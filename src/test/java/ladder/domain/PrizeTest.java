package ladder.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrizeTest {

    private Prize prize;

    @BeforeEach
    public void setUp(){
        prize = new Prize("꽝,5000,꽝,3000");
    }

    @Test
    void testToString() {
        System.out.println(prize);
    }
}