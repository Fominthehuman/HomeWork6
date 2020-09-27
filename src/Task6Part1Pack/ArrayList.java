package Task6Part1Pack;

import java.util.Arrays;

public class ArrayList<T> implements MyCollection<T> {
    private final int startSize = 0;
    private int size;
    private Object[] array;

    public ArrayList() {
        size = 0;
        array = new Object[startSize];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void add(T item) {
        Object[] result = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        for (int i = array.length + 1; i < result.length; i++) {
            result[i] = array[i - 1];
        }
        result[array.length] = item;
        array = result;
    }

    @Override
    public void remove(int index) {
        Object[] result = new Object[array.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = array[i + 1];
        }
        this.array = result;
    }

    @Override
    public void remove(T item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) remove(i);
        }
    }

    @Override
    public T get(int index) {
        try {
            return (T) array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет такого индекса");
        }
        return null;
    }

    @Override
    public void clear() {
        array = null;
    }

    public void print() { //печать коллекции
        System.out.println(Arrays.toString(array));
    }
}
