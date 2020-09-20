package Task1Pack;

import java.util.Collection;

public abstract class TypeCollection <T>  {

    public abstract int size();

    public abstract void add(T element);

    public abstract void remove(int index);

    public abstract void remove(T element);

    public abstract T get(int index);

    public abstract void clear();

    public abstract void print();

}
