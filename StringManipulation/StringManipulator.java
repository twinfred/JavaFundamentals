public class StringManipulator {
    public String trimAndConcat (String string1, String string2){
        string1 = string1.trim();
        string2 = string2.trim();
        return string1 + string2;
    }

    public Integer getIndexOrNull(String string1, char character){
        if(string1.indexOf(character) != -1){
            return string1.indexOf(character);
        }else{
            return null;
        }
    }

    public Integer getIndexOrNull(String string1, String string2){
        if(string1.indexOf(string2) != -1){
            return string1.indexOf(string2);
        }else{
            return null;
        }
    }

    public String concatSubstring(String string1, Integer idx1, Integer idx2, String string2){
        String newString1 = string1.substring(idx1, idx2);
        return newString1 + string2;
    }
}