import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLoop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Bug");
        list.add("C++");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String value = it.next();
            if (value.equals("Bug")) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
