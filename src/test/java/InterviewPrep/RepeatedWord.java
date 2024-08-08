package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWord {

    public static void findRepeatedWord(String inputString) {
//        split the entire string in word list on basis of spaces in between
        String[] words = inputString.split("\\s+");
//        Create a Hashmap to keep all the words and occurrences
        Map<String, Integer> wordMap = new HashMap<>();
//        Iterate over words array
        for (String word : words) {
            word = word.toLowerCase();
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        String maxWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Word '" + maxWord + "' is occurring " + maxCount + " times");
//        approach to find all words along with occurrences
//        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
//            System.out.println("Word '" + entry.getKey() + "' is occurring " + entry.getValue() + " times");
//        }

    }


    public static void main(String[] args) {
        String message = "Hi There, this is Atish Kadu. This was Atish profile. My name is Atish Ashok Kadu";
        findRepeatedWord(message);

    }
}
