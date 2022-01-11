package day24_CustomMethods_Return;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> num =new ArrayList<>();
        num.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));

        String s= "";
        for (int i = 0; i < num.size(); i++) {
            if(i==2 || i== 5 || i==9){
                continue;
            }
            if(num.get(i)==2 || num.get(i) %3==0){
                s+="1";
            }else{
                s+="0";
            }
        }
        System.out.println(s);
    }
}
