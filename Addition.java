import java.util.Scanner;

public class Addition {

    private static Scanner scan = new Scanner(System.in);

    public int add(String number){
        int num=0;
        if(number.equals("")) {
            return 0;
        }
//        if(number.contains("\n")&&number.contains(",")){
//            num = addingWithNewLine(number);
//        }else {
            num = findingComma(number);
//        }
        if(num!=0){
            return num;
        }
        return Integer.parseInt(number);
    }

    public int add(String number1, String number2)
    {
            int num = findingComma(number2);
            return (Integer.parseInt(number1)+num);
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
        int action;
        Addition addition = new Addition();
        System.out.println("enter the string :");
        String userinput = scan.nextLine();
        String userinput2 = scan.nextLine();
        int sum = addition.add(userinput, userinput2);
        System.out.println(sum);
    }
}
