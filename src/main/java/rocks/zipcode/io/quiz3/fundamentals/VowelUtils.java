package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {

        Boolean answer =false;
        //String vowels="aeiou";
        for (int i = 0; i <word.length() ; i++) {
            if(word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")){
                answer = true;
            }
        }
        return answer;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        String wordToLowerCase= word.toLowerCase();
        String vowels ="aeiou";
        for (int index = 0; index <wordToLowerCase.length() ; index++) {
            if(vowels.contains(String.valueOf(wordToLowerCase.charAt(index)))){
                return index;
            }
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        Boolean answer = false;
        String vowels ="aeiou";
        if(vowels.indexOf(Character.toLowerCase(word.charAt(0)))!=-1){
            answer = true;
        }
        return answer;
    }

    public static Boolean isVowel(Character character) {
        String characterString = character.toString();
        Boolean answer = false;
        for (int i = 0; i < characterString.length(); i++) {
            if(characterString.contains("a") ||
                    characterString.contains("A") ||
                    characterString.contains("e") ||
                    characterString.contains("E") ||
                    characterString.contains("i") ||
                    characterString.contains("I")) {

                answer = true;
            }
        }

        return answer;
    }
}
