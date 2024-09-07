package InterviewPrep.Streams;

import java.util.Arrays;
import java.util.List;

public class AverageNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        double asDouble = numbers.stream().mapToInt(x -> x).average().getAsDouble();
        System.out.println("average = " + asDouble);
    }
}
