import org.junit.Test;
import org.junit.Assert;

public class AdditionTest {
    @Test
    public void testFunction(){

            Addition add = new Addition();
            String no = "";
            int sum = add.addString(no);
            Assert.assertEquals(0, sum);
    }
}
