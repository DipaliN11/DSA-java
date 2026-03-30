package AccessofData;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Kunal");
        // need to do a few things
        // 1. access the data members
        // 2. modify the data members

//        ArrayList<Integer> list = new ArrayList<>(23);
//        list.DEFAULT_CAPACITY;

        obj.getNum();
       
        int n = obj.num;
        System.out.println(obj.name);
        System.out.println(n);
        A obj1 = new SubClass(20,"Dipali",22);
        //String d = obj1.name;
        //System.out.println(obj1.age);
        obj1.getNum();
        int n1 =obj1.num;
    }
}