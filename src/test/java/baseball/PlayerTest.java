package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PlayerTest {
    private Player player = new Player();

    @DisplayName("3자리 숫자 아닌 경우")
    @Test
    void notThreeDigit() throws NoSuchMethodException {
        Method method = player.getClass().getDeclaredMethod("checkThreeDigit", String.class);
        method.setAccessible(true);
        assertThrows(InvocationTargetException.class, () -> method.invoke(player,"abc"));
    }

    @DisplayName("중복 숫자가 있는 경우")
    @Test
    void duplicateDigit() throws NoSuchMethodException {
        Method method = player.getClass().getDeclaredMethod("checkDuplicateInput", String.class);
        method.setAccessible(true);
        assertThatExceptionOfType(InvocationTargetException.class).isThrownBy(() -> method.invoke(player,"111"));
    }
}