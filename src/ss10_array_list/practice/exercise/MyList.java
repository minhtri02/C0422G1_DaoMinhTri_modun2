package ss10_array_list.practice.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    public static void main(String[] args) {
//        MyList<Integer> myList = new MyList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        myList.add(5);
//
////        myList.remove(2);
//        myList.add(2,3);
//
//        System.out.println(Arrays.toString(myList.elements));

//        System.out.println(myList.toArray());
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3);
        integers.add(3);
        integers.add(3);
        System.out.println(integers);
    }
    private int size ;
    static final int DEFAULT_CAPACITY =10;
    private Object[] elements;
    private int index;
    private E element;

    public MyList() {
        this.elements=new Object[DEFAULT_CAPACITY];
    }

    public MyList(int infinityCapacity){
        if (infinityCapacity > 0) {
            this.elements = new Object[infinityCapacity];
        } else if (infinityCapacity == 0) {

        } else {
            System.out.println("Mảng không thể là số âm!");
        }
    }

    public void add(int index, E element) {
        checkIndex(index);
        if (size == elements.length){
            ensureCapa();
        }
        for (int i = size; i >= index; i--) {
            elements[i+1] = elements[i];
        }
        elements[index] = element;
        size++;
    }
    public void add(E element){
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public E remove(int index) {
        checkIndex(index);

        E e = (E) elements[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            elements[j] = elements[j + 1];

        elements[size - 1] = null; // This element is now null

        // Decrement size
        size--;
        return e;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }

    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

}
