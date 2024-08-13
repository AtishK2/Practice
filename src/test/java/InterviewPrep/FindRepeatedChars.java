package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatedChars {

    public static void main(String[] args) {
        FindRepeatedChars instance = new FindRepeatedChars();
        String contentString = "This is a java statement";
        instance.findRepeatedCharacters(contentString);
    }

    private void findRepeatedCharacters(String contentString) {
        char[] charArray = contentString.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for(Character character: charArray){
            if(charMap.containsKey(character)){
                charMap.put(character, charMap.get(character)+1);
            } else {
                charMap.put(character, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: charMap.entrySet()){
            System.out.println("Character '" + entry.getKey() +"' occurs "+entry.getValue()+" times");
        }
    }

}
