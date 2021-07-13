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
        String no = "2,";
        int sum = addition.add(no);
        Assert.assertEquals(2, sum);
    }


    @Test
    public void twoNumberAddition(){
        String no = "2,3";
        int sum = addition.add(no);
        Assert.assertEquals(5, sum);
    }

    @Test
    public void takingUserInput(){
        String no = "234,567";
        int sum = addition.add(no);
        Assert.assertEquals(801, sum);
    }

    @Test
    public void newLineBetweenNumbers(){
        String no = "1",no2 = "2,3";
        int sum = addition.add(no,no2);
        Assert.assertEquals(6, sum);
    }

    @Test
    public void differentDelemiter(){
        String no,no2;
        no="//;";
        no2 = "1;2";
        int sum = addition.add(no, no2);
        Assert.assertEquals(3, sum);
    }

//    @Test
//    public void starDelemiter(){
//        String no,no2;
//        no="//***";
//        no2="";
//    }

    @Test
    public void negtiveValue(){
        String no="-44,66";
        int sum = addition.add(no);
        Assert.assertEquals(0,sum);
    }
    @Test
    public void negativeValues(){
        String no,no2;
        no="//;";
        no2="-44;-66";
        int sum = addition.add(no, no2);
        Assert.assertEquals(0,sum);
    }

    @Test
    public void greaterValue(){
        String no;
        no="2,1001";
        int sum=addition.add(no);
        Assert.assertEquals(2,sum);
    }

    @Test
    public void greaterValues(){
        String no,no2;
        no="//;";
        no2="2;1001";
        int sum=addition.add(no,no2);
        Assert.assertEquals(2,sum);
    }

}
