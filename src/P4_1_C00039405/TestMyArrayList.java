package P4_1_C00039405;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Y. Daniel Liang
 */
public class TestMyArrayList {

    public TestMyArrayList() {
        // Create a list
        MyList<String> list = new MyArrayList<>();

        // Add elements to the list
        list.add("America"); // Add it to the list
        System.out.println("(1) " + list);

        list.add(0, "Canada"); // Add it to the beginning of the list
        System.out.println("(2) " + list);

        list.add("Russia"); // Add it to the end of the list
        System.out.println("(3) " + list);

        list.add("France"); // Add it to the end of the list
        System.out.println("(4) " + list);

        list.add(2, "Germany"); // Add it to the list at index 2
        System.out.println("(5) " + list);

        list.add(5, "Norway"); // Add it to the list at index 5
        System.out.println("(6) " + list);

        // Remove elements from the list
        list.remove("Canada"); // Same as list.remove(0) in this case
        System.out.println("(7) " + list);

        list.remove(2); // Remove the element at index 2
        System.out.println("(8) " + list);

        list.remove(list.size() - 1); // Remove the last element
        System.out.print("(9) " + list + "\n(10) ");

        List<String> otherList = new ArrayList<>();
        System.out.print("" + list.addAll(otherList) + "\n     ");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
        for (String s : list) {
            System.out.print(s.toUpperCase() + " ");
        }

    }
}
