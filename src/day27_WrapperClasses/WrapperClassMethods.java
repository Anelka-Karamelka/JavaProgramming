package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123"; //characters are digits,and we can convert to Int primitive

        int num= Integer.parseInt(str);//int // 
        System.out.println(num+1); //124
        System.out.println(str+1); //1231
        
        String str2= "10.5";
        double num2 = Double.parseDouble(str2);

        System.out.println(num2);
        
        int max= Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max1= Long.MAX_VALUE;
        long min1=Long.MIN_VALUE;

        System.out.println("min1 = " + min1);
        System.out.println("max1 = " + max1);

        String s1="true";
        boolean r1=Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("================");

        String s2 = "123";
       Integer x=  Integer.valueOf(s2);//Integer
        int y=Integer.valueOf(s2);

        System.out.println(x);
        System.out.println(y);

        String s3="1.5";
        Double z=Double.valueOf(s3);//double
        System.out.println(z);

        System.out.println("================");

        

        char ch1='A';
        
        //isDigit
        boolean r2= Character.isDigit(ch1);
        
        //isLetter
        boolean r3=Character.isLetter(ch1);
       
        //isSpecialCharacter
        boolean r4=!Character.isLetterOrDigit(ch1);
        
        //upperCase
        boolean r5=Character.isUpperCase(ch1);
        
        //lowerCAse
        boolean r6=Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("===============");
        
        int sum=0;

        for (char each : str.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum);
    }
}
