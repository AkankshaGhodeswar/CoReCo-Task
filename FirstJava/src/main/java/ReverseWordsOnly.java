public class ReverseWordsOnly {
    
    public static String reverseWordsOnly(String str) {
        String[] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Original string: " + str);
        System.out.println("Reversed words only: " + reverseWordsOnly(str));
    }
}

