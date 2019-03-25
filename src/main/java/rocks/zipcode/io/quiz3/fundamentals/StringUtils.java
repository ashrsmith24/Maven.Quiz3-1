package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String beginning = str.substring(0, indexToCapitalize);
        Character upperCase = Character.toUpperCase(str.charAt(indexToCapitalize));
        String ending = str.substring(indexToCapitalize + 1);
        return beginning + upperCase + ending;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Boolean result = false;
        for (int i = 0; i <= indexOfString; i++) {
            baseString.charAt(indexOfString);
            result = true;

        }
        return result;
    }
    public static String[] getAllSubStrings(String string) {
        Set<String> theList = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                String sub = string.substring(i, j);
                theList.add(sub);
            }
        }
    String[] all = new String[theList.size()];
    return theList.toArray(all);
    }

    public static Integer getNumberOfSubStrings(String input){

        return getAllSubStrings(input).length;
    }
}
