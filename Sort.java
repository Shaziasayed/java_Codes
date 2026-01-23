import java.util.ArrayList;

public class Sort {

    // Function to check if element exists
    static boolean contains(ArrayList<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                return true;
            }
        }
        return false;
    }

    // Bubble Sort
    static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(1);
        list1.add(3);
        list1.add(7);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5);
        list2.add(8);
        list2.add(1);
        list2.add(9);

        ArrayList<Integer> merged = new ArrayList<>();

        // Merge list1
        for (int i = 0; i < list1.size(); i++) {
            if (!contains(merged, list1.get(i))) {
                merged.add(list1.get(i));
            }
        }

        // Merge list2
        for (int i = 0; i < list2.size(); i++) {
            if (!contains(merged, list2.get(i))) {
                merged.add(list2.get(i));
            }
        }

        // Sort
        sort(merged);

        System.out.println(merged);
    }
}
