package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(list); //1,2,3,4,5,6,7

        list.removeAll(Arrays.asList(3,5));
        System.out.println(list);//1,2,4,6,7
        System.out.println("=================");

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);//100,200,300,100,200,300

        System.out.println("========retain=============");
        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QU", "SDET", "Developer", "QA", "SDET", "Scrum MAster", "BA","BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);

        System.out.println("===========contain==============");
        ArrayList<Integer>num=new ArrayList<>();
        num.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1= num.contains(10);
        boolean r2= num.contains(2) && num.contains(5) && num.contains(10);
        boolean r3= num.containsAll(Arrays.asList(1,2,5,10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("=======converting array to arrayList============");

        String[]names={"Jish", "Jack", "Daniel", "Shay", "Breanna"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        /*ArrayList<String> namesList=new ArrayList<>();
        namesList.addAll(Arrays.asList(names));*/
        System.out.println(namesList);
        System.out.println("====================");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>( convertArrayToArrayList(arr2) );

        System.out.println("list3 = " + list3);

    }


    public static ArrayList<Integer>  convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }





}
