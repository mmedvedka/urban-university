
public class Tools{
    public static <T extends Number> boolean CheckTheSameValuesAndOrders (T[] array_1, T[] array_2){
        if (array_1.length != array_2.length){
            return false;
        }

        for (int i = 0; i < array_1.length; i++){
           if (Double.compare(array_1[i].doubleValue(), array_2[i].doubleValue()) != 0){
              return false;
           }
        }
        return true;
    }

    public static <T> void ExchangePositions (T[] array, int posFrom, int posTo){
        if (posFrom >= array.length || posTo >= array.length || posFrom == posTo){
            return;
        }
        T tempFrom = array[posFrom];
        T tempTo = array[posTo];
        array[posFrom] = tempTo;
        array[posTo] = tempFrom;
    }
}