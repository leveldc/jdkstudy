package test.com.newblue;

import com.newblue.JunitTest;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by levi on 2014/11/16.
 */
public class TestJunitTest {
    @Test
    public void test_function_add_1_plus_1_equals_2_return_true(){
        JunitTest jt = new JunitTest();
        Assert.assertEquals(3, jt.add(2, 1));
    }
}
