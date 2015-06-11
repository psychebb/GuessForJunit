import java.util.*;

public class Guess {

    private int a = 0;
    private int b = 0;
    private HashMap<Integer, String> expectedMap = new HashMap<>();
    private HashMap<Integer, String> actualMap = new HashMap<>();

    public String guess(String expect, String actual) {
        format(expect, actual);

        if (expectedMap.equals(actualMap)) {
            return "4A0B";
        }
        List<Integer> correctIndex = new ArrayList<>();
        getNumberOfA(correctIndex);
        for (Integer integer : correctIndex) {
            expectedMap.remove(integer);
            actualMap.remove(integer);
        }
        getNumberOfB();
        return String.format("%dA%dB", a, b);
    }

    private void format(String expect, String actual) {
        List<String> expects = Arrays.asList(expect.split(""));
        List<String> actuals = Arrays.asList(actual.split(""));
        for (int i = 0; i < expects.size(); i++) {
            expectedMap.put(i, expects.get(i));
        }
        for (int i = 0; i < actuals.size(); i++) {
            actualMap.put(i, actuals.get(i));
        }
    }

    private void getNumberOfB() {
        for (Map.Entry<Integer, String> entry : actualMap.entrySet()) {
            if (expectedMap.containsValue(entry.getValue())) {
                b++;
            }
        }
    }

    private void getNumberOfA(List<Integer> correctIndex) {
        for (Map.Entry<Integer, String> entry : actualMap.entrySet()) {
            if (entry.getValue().equals(expectedMap.get(entry.getKey()))) {
                a++;
                correctIndex.add(entry.getKey());
            }
        }
    }
}
