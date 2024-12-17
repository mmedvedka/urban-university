import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Tools {
    public static boolean CheckPresentElement (ArrayList<String> list, String name){
        boolean result = false;
        if (list.indexOf(name) != -1) {
            return true;
        }
        return false;
    }

    public static LinkedList<?> GetReverseList (LinkedList<?> list){
        return list.reversed();
    }

    public static LinkedList<Integer> GetReverseListCustom (LinkedList<Integer> list){
        LinkedList<Integer> result = new LinkedList<>();
        Iterator<Integer> descIt = list.descendingIterator();
        while (descIt.hasNext()) {
            result.add(descIt.next());
        }
        return result;
    }
}
