package InterviewPrep;

public class ExtractNumber {

    public static int getNumberFromString(String content) {
        int temp, sum = 0, rem;
        String number = content.replaceAll("[~A-Za-z ]", "");

        int num = Integer.parseInt(number);
        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.print(temp + ", " + number.charAt(0) + "+" + number.charAt(1) + "+" + number.charAt(2) + "= ");
        return sum;
    }

    public static void main(String[] args) {
        String message = "Today is Monday and date is 224";
        int sum = getNumberFromString(message);
        System.out.println(sum);
    }
}
