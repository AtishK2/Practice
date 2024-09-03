package InterviewPrep;

public class SampleTest {

        public static void main(String[] args) {
            String input = "I am a java guy";
            String output = reverseWords(input);
            System.out.println(output);
        }

        public static String reverseWords(String input) {
            // Split the input string into words
            String[] words = input.split(" ");

            // StringBuilder to hold the final output
            StringBuilder reversedString = new StringBuilder();

            // Loop through each word
            for (String word : words) {
                // Reverse the characters of each word and append to the result
                String reversedWord = new StringBuilder(word).reverse().toString();
                reversedString.append(reversedWord).append(" ");
            }

            // Trim the trailing space and return the result
            return reversedString.toString().trim();
        }
    }


//    public static void main(String[] args) {
//
//        String input= "I am a java guy";
////        output="yug avja a ma I"
//        reverseString(input);
//
//    }
//
//    private static void reverseString(String input) {
//        String[] words = input.split(" ");
//        StringBuilder result = new StringBuilder();
//        for(int i=input.length()-1; i>=0; i--){
//            result.append(input.charAt(i));
//        }
//        System.out.println("input = " + input);
//        System.out.println("output = " + result);
//
//        //I am a java guy
////        yug avaj a ma I
////        y ug a vaja maI
//    }

