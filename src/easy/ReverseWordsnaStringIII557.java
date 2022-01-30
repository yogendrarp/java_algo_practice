package easy;

public class ReverseWordsnaStringIII557 {

    public static String reverseWords(String s) {
        char[] text = s.toCharArray();
        int firstSpace = s.indexOf(' ', 0) - 1;
        int i = 0, j = firstSpace;
        boolean flag = true;
        while (j < s.length()) {
            while (i < j) {
                char ch = text[i];
                text[i] = text[j];
                text[j] = ch;
                i++;
                j--;
            }
            if (!flag) {
                break;
            }
            i = firstSpace + 2;
            firstSpace = s.indexOf(' ', i) - 1;
            j = firstSpace;
            if (firstSpace < 0) {
                j = s.length() - 1;
                flag = false;
            }
        }
        return String.copyValueOf(text);
    }

    public static void main(String[] args) {
        System.out.print(reverseWords("Let's take LeetCode contest"));
    }
}
