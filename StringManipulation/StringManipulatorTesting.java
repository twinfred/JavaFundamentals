public class StringManipulatorTesting {
    public static void main(String[] args){
        // Import StringManipulator
        StringManipulator sm = new StringManipulator();
        // Testing trimAndConcat
        String str = sm.trimAndConcat("   Hello    ", "  World          ");
        System.out.println(str);
        // Testing getIndexOrNull with String and char
        char letter = 'o';
        Integer a = sm.getIndexOrNull("Coding", letter);
        Integer b = sm.getIndexOrNull("Hello World", letter);
        Integer c = sm.getIndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // Testing getIndexOrNull with two Strings
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = sm.getIndexOrNull(word, subString);
        Integer e = sm.getIndexOrNull(word, notSubString);
        System.out.println(d);
        System.out.println(e);
        // Testing concatSubsrting
        String concatWord = sm.concatSubstring("Hello", 1, 3, "world");
        System.out.println(concatWord);
    }
}