public class Addition {

    public int add(String number){
        if(number.equals("")) {
            return 0;
        }
        return Integer.parseInt(number);
    }


    public static void main(String arg[]){
        Addition addition = new Addition();
        int sum = addition.add("2");
        System.out.println(sum);
    }
}
