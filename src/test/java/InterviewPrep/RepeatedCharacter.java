package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {

    public void findRepeatedCharacters(String content) {

        char[] characters = content.toCharArray();
        Map<Character, Integer> characterMap = new HashMap<>();

        for (char character : characters) {
            if (characterMap.containsKey(character)) {
                characterMap.put(character, characterMap.get(character) + 1);
            } else {
                characterMap.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> charElement : characterMap.entrySet()) {
            if (charElement.getValue() > 1) {
                System.out.println("Character " + charElement.getKey() + " is repeated " + charElement.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        RepeatedCharacter repeatedCharacter = new RepeatedCharacter();
        repeatedCharacter.findRepeatedCharacters("Programming");
    }
}
