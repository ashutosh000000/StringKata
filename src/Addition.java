import java.util.Scanner;
public class Addition{

    private static Scanner scan = new Scanner(System.in);

    public int add(String number){

        if(number.equals("")) {
            return 0;
        }
        try {
           int num = findingComma(number, ",");
            if(num!=0){
                return num;
            }
            return Integer.parseInt(number);
        }catch(NegativesNotAllowed|NumberFormatException ex){}
        return 0;
    }

    public int add(String number1, String number2)
    {
        number1=number1.replaceAll("/","");

        if(number1.equals(";")||number1.equals("-")||number1.equals("+")||number1.equals(":")){
            try{
                return findingComma(number2, number1);
            }catch(NegativesNotAllowed ex){}
        }
        try {
          int num = findingComma(number2, ",");
            return (Integer.parseInt(number1) + num);
        }catch(NegativesNotAllowed|NumberFormatException ex){}
        return 0;

    }

    public int findingComma(String number, String delimeter) throws NegativesNotAllowed {
        String firstnumber,secondnumber;
        if(number.contains(delimeter)) {
            firstnumber = number.substring(0, number.indexOf(delimeter));
            secondnumber = number.substring(number.indexOf(delimeter) + 1);
            if (secondnumber.equals("")) {
                if(Integer.parseInt(firstnumber)<0){
                    throw new NegativesNotAllowed("negatives not allowed "+firstnumber);
                }
                return Integer.parseInt(firstnumber);
            } else {
                generatedException(firstnumber, secondnumber);
                return (Integer.parseInt(firstnumber) + Integer.parseInt(secondnumber));
            }
        }
        return 0;
    }
    public void generatedException(String firstnumber, String secondnumber) throws NegativesNotAllowed{
      if(Integer.parseInt(firstnumber)<0&&Integer.parseInt(secondnumber)>0){
                    throw new NegativesNotAllowed("negatives not allowed "+firstnumber);
                }else if(Integer.parseInt(secondnumber)<0&&Integer.parseInt(firstnumber)>0){
                    throw new NegativesNotAllowed("negatives not allowed "+secondnumber);
                }
                else if((Integer.parseInt(firstnumber)<0&&Integer.parseInt(secondnumber)<0)){
                    throw new NegativesNotAllowed("negatives not allowed "+firstnumber+" "+secondnumber);
                }
    }

    public static void main(String arg[]){
        int action;
        Addition addition = new Addition();
        System.out.println("enter the string :");
//        String userinput = scan.nextLine();
        String userinput2 = scan.nextLine();
        int sum = addition.add(userinput2);
        System.out.println(sum);
    }
}
