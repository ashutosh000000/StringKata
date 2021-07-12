import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class AdditionTest {
    private Addition addition;

    @Before
    public void setup()
    {
    addition = new Addition();
    }

    @Test
    public void testFunction(){

//            Addition addition = new Addition();
            String no = "";
            int sum = addition.add(no);
            Assert.assertEquals(0, sum);
    }
    @Test
    public void passingNumber(){
//        Addition addition;
    String no = "2";
    int sum = addition.add(no);
    Assert.assertEquals(2, sum);
    }

    @Test
    public void firstNumberWithPlus(){
        String no = "2+";
        int sum = addition.add(no);
        Assert.assertEquals(2, sum);
    }
}
