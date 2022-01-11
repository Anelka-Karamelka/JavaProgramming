package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    class class1{ // only allow for inner class, it has to be nested class

    }

    public static int num=100;

    public static void method(){

    }

    static{

    }
}


class C{ // outer class

    static class A{//inner class

    }

    static class B{//inner class can be static, in order to be

    }
}
