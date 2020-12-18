import codewars.five.PaginationHelper;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PaginationHelpTest {
    @Test
    public void test(){
        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        Assert.assertEquals(2,helper.pageCount());
        Assert.assertEquals(6,helper.itemCount());
        Assert.assertEquals(4,helper.pageItemCount(0));
        Assert.assertEquals(2,helper.pageItemCount(1));
        Assert.assertEquals(-1,helper.pageItemCount(2));
        Assert.assertEquals(1,helper.pageIndex(5));
        Assert.assertEquals(0,helper.pageIndex(2));
        Assert.assertEquals(-1,helper.pageIndex(20));
        Assert.assertEquals(-1,helper.pageIndex(-10));
        Assert.assertEquals(0,helper.pageIndex(0));
    }
}
