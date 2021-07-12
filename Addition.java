public class Addition {

    public int addString(String number){
        if(number.equals(""));
        return 0;
    }


    public static void main(String arg[]){
        Addition add = new Addition();
        int sum = add.addString("");
        System.out.println(sum);
    }
}
