package baseball;

public class Judgment {
    public Result judge(String answer, String input) {
        Result result = new Result();
        for (int i = 0; i < answer.length(); i++) {
            setResult(answer, input, i, result);
        }

        return result;
    }

    // todo : 인자가 많음 고민 필요...
    private void setResult(String answer, String input, int index, Result result) {
        if (answer.charAt(index) == input.charAt(index)) {
            result.setStrike(result.getStrike() + 1);
            return;
        }

        if (answer.contains(Character.toString(input.charAt(index)))) {
            result.setBall(result.getBall() + 1);
        }
    }
}
