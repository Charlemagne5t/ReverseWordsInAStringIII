import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void reverseWordsTest1(){
        String s = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";
        String actual = new Solution().reverseWords(s);

        Assert.assertEquals(expected, actual);
    }

}
