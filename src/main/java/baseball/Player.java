package baseball;

import nextstep.utils.Console;

import java.util.*;
import java.util.regex.Pattern;

public class Player {
    private final String threeDigitExp = "^[0-9]{3}";

    public String play() {
        String input = Console.readLine();
        validate(input);
        return input;
    }

    private void validate(String input) {
        if (!Pattern.matches(threeDigitExp, input)) {
            throw new IllegalArgumentException("[ERROR] 0~9 3자리 숫자만 입력 가능합니다.");
        }
        checkDuplicateInput(input);
    }

    private void checkDuplicateInput(String input) {
        List<String> list = Arrays.asList(input.split(""));
        Set<String> set = new HashSet<>(list);

        for (String str : set) {
            if (Collections.frequency(list, str) > 1) {
                throw new IllegalArgumentException("[ERROR] 서로 다른 수로 이루어진 3자리의 수로 입력하세요.");
            }
        }
    }


}
