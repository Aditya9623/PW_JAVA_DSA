// Given string and two characters ch1,ch2 as input, replace all occurences of ch1 with ch2 and ch2 with ch1 in the input string.
// Input 1: apples
// a
// p
// Output 1: paales

public class SwapCharacters {
    public static void main(String[] args) {
        
        String input = "abcabc";
        char ch1 = 'a';
        char ch2 = 'b';

        String result = swapCharacters(input, ch1, ch2);
        System.out.println("Modified String: " + result);
    }

    public static String swapCharacters(String str, char ch1, char ch2) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ch1) {
                charArray[i] = ch2;
            } else if (charArray[i] == ch2) {
                charArray[i] = ch1;
            }
        }
        return new String(charArray);
        
    }
}
