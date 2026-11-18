import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {
    public static void sort(ArrayList<Student> students, Comparator<Student> comparator) {
        for (int i = 0; i < students.size() - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < students.size(); j++) {
                if (comparator.compare(students.get(j), students.get(smallest)) < 0) {
                    smallest = j;
                }
            }

            Student temp = students.get(i);
            students.set(i, students.get(smallest));
            students.set(smallest, temp);
        }
    }
}
