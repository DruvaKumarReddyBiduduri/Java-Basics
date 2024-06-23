package collections;

import java.util.*;

public class ArrayListPrograms {

    public static void run(){

        Integer[] arr={1,2,3,4};
        String[] s={"Venu","Balu","Anil","Ganesh","Abhinav"};


        List<String> a=new ArrayList<>();
        List<Integer> i=new ArrayList<>();

        i.add(3);
        i.add(5);
        i.add(1);

        i.remove(1);
        i=i.reversed();



        Collections.addAll(a,s);
        System.out.println(i);

//        System.out.println(a);
//        Collections.sort(a);
//        System.out.println(a);
//
//        for (String string : a) {
//            System.out.println(string);
//        }
//
//        ListIterator<String> ite=a.listIterator(a.size());
//
//        while (ite.hasPrevious()){
//            System.out.println(ite.previous());
//        }
    }
}
