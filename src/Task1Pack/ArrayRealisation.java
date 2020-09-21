package Task1Pack;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayRealisation<T> {

    private Object[] newArrayList = new Object[0]; //массив с данными

    public int size() {
        return newArrayList.length;
    }

    public void add(T element) { //добавление по индексу
        Object[] result = (T[]) new Object[newArrayList.length + 1];
        for (int i = 0; i < newArrayList.length; i++) {
            result[i] = newArrayList[i];
        }
        for (int i = newArrayList.length + 1; i < result.length; i++) {
            result[i] = newArrayList[i - 1];
        }
        result[newArrayList.length] = element;
        newArrayList = result;
    }

    public void remove(int index) { //удаление по индексу
        Object[] result = (T[]) new Object[newArrayList.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = newArrayList[i];
        }
        for (int i = index; i < result.length; i++) {
            result[i] = newArrayList[i + 1];
        }
        this.newArrayList = result;
    }

    public void remove(T element) { //удаление последнего элемента массива
        remove(newArrayList.length - 1);
    }

    public T get(int index) { //получение элемента по индексу
        try {
            return (T) newArrayList[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет такого индекса");
        }
        return null;
    }

    public void clear() { //очистка коллекци
        //Arrays.fill(data, null); //замена всех элементов на null
        newArrayList = null; //остается один null
    }

    public void print() { //печать коллекции
        System.out.println(Arrays.toString(newArrayList));
    }
}
