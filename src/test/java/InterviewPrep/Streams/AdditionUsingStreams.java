package InterviewPrep.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AdditionUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1, 6, 7, 9, 4, 5, 65, 45, 23, 98, 42);

        Optional<Integer> sum = numbersList.stream().reduce((a, b) -> a + b);
        System.out.println("sum = " + sum.get());
    }
}
