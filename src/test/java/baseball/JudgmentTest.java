package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JudgmentTest {
    private Judgment judgment = new Judgment();

    @DisplayName("3스트라이크")
    @Test
    void three_strike_judge() {
        //given
        String answer = "123";
        String input = "123";

        //when
        Result result = judgment.judge(input, answer);
        //then
        assertEquals(result.getStrike(), 3);
    }

    @DisplayName("3볼")
    @Test
    void three_ball_judge() {
        //given
        String answer = "123";
        String input = "312";

        //when
        Result result = judgment.judge(input, answer);
        //then
        assertEquals(result.getBall(), 3);
    }

    @DisplayName("1스트라이크 2볼")
    @Test
    void one_strike_two_ball_judge() {
        //given
        String answer = "123";
        String input = "132";

        //when
        Result result = judgment.judge(input, answer);
        //then
        assertEquals(result.getStrike(), 1);
        assertEquals(result.getBall(), 2);
    }
}