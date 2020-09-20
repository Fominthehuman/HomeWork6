package Task1Pack;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRealisation<T> extends TypeCollection {

    ArrayList[] arrayList = new ArrayList[0];
    //private Object[] arrayList = new Object[0];

    @Override
    public int size() {
        return arrayList.length;
    }

    @Override
    public void add(Object element) {

    }

   /* public void add(int index, Object element) { //добавление по индексу
        //Object[] result = new Object[arrayList.length + 1];
        ArrayList[] result = new ArrayList[arrayList.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = arrayList[i];
        }
        for (int i = index + 1; i < result.length; i++) {
            result[i] = arrayList[i - 1];
        }
        result[index] = element;
        arrayList = result;
    }*/

    @Override
    public void remove(int index) {
        Object[] result = new Object[arrayList.length];
        for (int i = 0; i < index; i++) {
            result[i] = arrayList[i];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = arrayList[i + 1];
        }
        this.arrayList = (ArrayList[]) result;
    }

    @Override
    public void remove(Object element) {

    }

    @Override
    public Object get(int index) {
        try {
            return arrayList[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет такого индекса");
        }
        return null;
    }

    @Override
    public void clear() {
        //Arrays.fill(data, null); //замена всех элементов на null
        arrayList = null; //остается один null
    }

    @Override
    public void print() { //печать коллекции
        System.out.println(Arrays.toString(arrayList));
    }
}
