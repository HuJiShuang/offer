package interviewoffer;

import java.util.Scanner;

public class Demo5 {

    public String replace(StringBuffer str){
        String str1 = str.toString();
        String str2 = str1.replace(" ","%20");
        return str2;
    }
    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        Scanner scanner = new Scanner(System.in);
        String s = new String();
        if(scanner.hasNextLine())
           s = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(demo5.replace(stringBuffer));
    }
}
