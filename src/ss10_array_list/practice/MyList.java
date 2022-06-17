package ss10_array_list.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
//    public static void main(String[] args) {
//        ArrayList<String> hayqya= new ArrayList<String>();
//        hayqya.add("tri");
//        hayqya.add("thanh");
//        hayqya.add("tam");
//        hayqya.add("kạldjak");
//hayqya.add(2,"hanh");
//hayqya.add("kjkad");
//hayqya.add("kjkad");
//hayqya.add("kjkad");
//hayqya.add("kjkad");
//hayqya.add("kjkad");
//hayqya.add("kjkad");
//        System.out.println(hayqya.size());
//        System.out.println(hayqya.ensureCapacity());
////        for (String s : hayqya         ) {
////            System.out.println(s);
////        }
////        System.out.println(hayqya);
////        System.out.println(hayqya.contains("tri"));
//        System.out.println(hayqya);
////        String bc =Arrays.toString(hayqya.toArray());
//
//        System.out.println(hayqya.lastIndexOf("tri"));
//    }




    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);

//        System.out.println(Arrays.toString(listInteger));
        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
//        System.out.println("element 2: "+listInteger.get(10));
//        System.out.println("element 2: "+listInteger.get(10));

////        listInteger.get(6);
////        System.out.println("element 6: "+listInteger.get(6));
//        System.out.println(listInteger);
////        listInteger.get(-1);
////        System.out.println("element -1: " + listInteger.get(-1));
//       listInteger.ensureCapa();
        System.out.println(listInteger);
    }
}
