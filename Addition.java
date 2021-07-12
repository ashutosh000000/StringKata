public class Addition {

    public int add(String number){
        int num=0;
        if(number.equals("")) {
            return 0;
        }
         num = findingComma(number);
        if(num!=0){
            return num;
        }
        return Integer.parseInt(number);
    }

    public int findingComma(String number){
        String firstnumber,secondnumber;
        if(number.contains(",")) {
            firstnumber = number.substring(0, number.indexOf(','));
            secondnumber = number.substring(number.indexOf(',') + 1);
            if (secondnumber.equals("")) {
                return Integer.parseInt(firstnumber);
            } else {
                return (Integer.parseInt(firstnumber) + Integer.parseInt(secondnumber));
            }
        }
        return 0;
    }

    public static void main(String arg[]){
        Addition addition = new Addition();
        int sum = addition.add("2,3");
        System.out.println(sum);
    }
}
