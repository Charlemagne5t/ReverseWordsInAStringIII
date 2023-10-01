import java.util.Arrays;

public class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' ' || i == chars.length- 1){
                if(i == chars.length- 1){
                    reverseWord(chars, start, end);
                    break;
                }else {
                    reverseWord(chars, start, end - 1);
                }
                start = i + 1;
                end = i + 1;
            }else {
                end++;
            }

        }

        return new String(chars);
    }
    private void reverseWord(char[] chars, int start, int end){
        for (int i =0; i <= (end - start) / 2; i++) {
            char temp = chars[start + i];
            chars[start + i] = chars[end - i];
            chars[end - i] = temp;
        }
    }
}
