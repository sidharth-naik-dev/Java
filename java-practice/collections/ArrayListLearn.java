package collections;

import java.util.ArrayList;

public class ArrayListLearn {
    static void main() {
        ArrayList <Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.removeIf(x->x==4);
        for (Integer integer : l1) {
            System.out.println(integer);
        }
    }
}
