import java.util.*;

public class Main {
    public static Set<?> GetKeySet(HashMap map){
        return map.keySet();
    }

    public static List<Map.Entry<Integer, String>> GetMoreThreeCharsArray(Map map){
        List<Map.Entry<Integer, String>> result = new ArrayList<>();
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry: set){
            if (entry.getValue().toString().length() > 3){
                result.add(entry);
            }
        }
        return result;
    }

    public static void main(String[] args) {
    /**TODO
         1.Создайте HashMap c ключами Integer, значениями – String.
            Напишите метод, который возвращает набор ключей, содержащихся в этой карте.
         2.Создайте HashMap c ключами Integer, значениями – String.
            Напишите метод, который возвращает ассоциативный массив, состоящий из элементов исходного map, при условии, что туда войдут элементы с длиной строки более 3.
     */

        {
            String[] colorNames = {"red", "blue", "green", "white", "black", "yellow", "gray"};
            HashMap<Integer, String> mapColors = new HashMap<>();
            int i = 1;
            for (String color : colorNames) {
                mapColors.put(i, color);
                i++;
            }
            System.out.println("1.");
            System.out.println(GetKeySet(mapColors));
        }
        {
            String[] colorNames = {"Red", "Green", "Black"};
            HashMap<Integer, String> mapColors = new HashMap<>();
            int i = 1;
            for (String color : colorNames) {
                mapColors.put(i, color);
                i++;
            }
            System.out.println("2.");
            System.out.println(GetMoreThreeCharsArray(mapColors));
        }
    }
}