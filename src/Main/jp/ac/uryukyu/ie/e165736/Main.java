package jp.ac.uryukyu.ie.e165736;


public class Main {
    public static void main(String[] args){
        try {
            String str = "3.14";
            double value = Double.parseDouble(str);
            System.out.println(str.length());
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException has occurred.");
            e.printStackTrace();

        }
    }
}
