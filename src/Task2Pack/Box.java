package Task2Pack;

import java.util.Collection;
import java.util.LinkedList;

public class Box {

    public static int getWeight(Collection name) {
        double boxSize = name.size();
        String boxName = String.valueOf(name);
        switch (boxName) {
            case "orangeBox":
                System.out.println("Вес " + boxSize);
                break;
            case "appleBox":
                System.out.println("Стоимость " + boxSize);
                break;
            default:
                System.out.println("");
        }
        return (name.size());
    }

    static Collection createOrangeBox() {
        Collection orangeBox = new LinkedList();
        orangeBox.add("orange");
        orangeBox.add("orange");
        orangeBox.add("orange");
        orangeBox.add("orange");
        orangeBox.add("orange");
        orangeBox.add("orange");
        orangeBox.add("orange");
        System.out.println(orangeBox.size());
        return orangeBox;
    }

    static Collection createAppleBox() {
        Collection appleBox = new LinkedList();
        appleBox.add("apple");
        appleBox.add("apple");
        appleBox.add("apple");
        appleBox.add("apple");
        appleBox.add("apple");
        return appleBox;
    }

}
