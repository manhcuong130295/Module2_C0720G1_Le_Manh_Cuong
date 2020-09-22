package _10_danh_sach.bai_tap.trien_khai_phuong_thuc_arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    public int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) throws IllegalAccessException {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) throws IllegalAccessException {
        if (index > elements.length) {
            throw new IllegalArgumentException("index:" + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public void ensureCapacity(int minCapacity) throws IllegalAccessException {
        if (minCapacity >= 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalAccessException("minCapacity:" + minCapacity);
        }
    }
    public E get(int index) {
        return (E) elements[index];
    }
    public int indexOf(E element) {
        int index= -1;
        for (int i=0;i<size;i++) {
            if(this.elements.equals(element)){
                return i;
            }
        }
        return index;
    }
    public boolean contains(E element) {
        return this.indexOf(element)>=0;
    }
}