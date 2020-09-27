package Task6Part2Pack;

import Task6Part1Pack.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> elements;
    private float totalWeight;

    public Box() {
        elements = new ArrayList<>();
    }

    public Box<T> add(T fruit) {
        elements.add(fruit);
        this.totalWeight += fruit.getWeight();
        return this;
    }

    public void remove(T fruit) {
        elements.remove(fruit);
        this.totalWeight -= fruit.getWeight();
    }

    float getWeight() {
        return this.totalWeight;
    }

    public void compare(Box box) {
        boolean compareResult;
        compareResult = this.getWeight() == box.getWeight();
        if (compareResult) {
            System.out.println("Коробки равны");
        } else {
            System.out.println("Коробки отличаются");
        }
    }

    public void mergeToBox(Box<T> box) {
        while (this.elements.size() != 0) {
            box.add(this.elements.get(0));
            remove(this.elements.get(0));
        }
    }
}

