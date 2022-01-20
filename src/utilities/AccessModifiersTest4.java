package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiersTest4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //System.out.println(AccessModifiersTest4.name1); // default is not visible outside a package
        System.out.println(AccessModifiersTest4.name2); // protected is visible outside package if it's sub class or inheritance



        AccessModifiersTest4.method2();
       // AccessModifiersTest4.method();
    }
}
