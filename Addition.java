public class Addition {

    public int add(String number){
        int num;
        if(number.contains("+")){
            number=number.substring(0, number.indexOf('+'));
        }

        if(number.equals("")) {
            return 0;
        }
        return Integer.parseInt(number);
    }


    public static void main(String arg[]){
        Addition addition = new Addition();
        int sum = addition.add("2+");
        System.out.println(sum);
    }
}
