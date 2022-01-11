package day28_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {


    public static void main(String[] args) {

String []c={"boston", "houson", "Austin", "Linkoln", "Tulsa"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(c));
        int a=list.size();

        for(String str:list){
        String rev="";

            for (int i = str.length()-1; i >=0 ; i--) {
                rev+=str.charAt(i);
            }
            list.set(--a,rev);
        }

        System.out.println(list);   //j   5 e i
    }
}
