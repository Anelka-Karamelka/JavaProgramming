package practice_01_12_2022.statics;

public class StaticBlockObject {

    public static void main(String[] args) {

      StaticBlock sb=new StaticBlock();
        System.out.println(sb.num);

        StaticBlock sb2=new StaticBlock(40);
        System.out.println(sb2.num);
    }

}
