import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MST {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        List<String> list = process(array, array.length, 0, "");
        for (String str : list) {
            System.out.println(str);
        }
    }

    private static List<String> process(int[] array, int length, int firstIndex, String str) {
        if (length == firstIndex) {
            return new ArrayList<>(Arrays.asList(str));
        }

        List<String> stringList = new ArrayList<>();
        Character[][] number2CharMap = getNumber2CharMap();
        for (int i = 0; i < number2CharMap[array[firstIndex]].length; i++) {
            String tempStr = new String(str);
            tempStr = tempStr.concat(number2CharMap[array[firstIndex]][i].toString());
            stringList.addAll(process(array, length, firstIndex + 1, tempStr));
        }
        return stringList;
    }

    private static Character[][] getNumber2CharMap() {
        Character[][] number2CharMap = new Character[10][5];
        number2CharMap[1] = new Character[]{'\0'};
        number2CharMap[2] = new Character[]{'a', 'b', 'c'};
        number2CharMap[3] = new Character[]{'d', 'e', 'f'};
        number2CharMap[4] = new Character[]{'g', 'h', 'i'};
        number2CharMap[5] = new Character[]{'j', 'k', 'l'};
        number2CharMap[6] = new Character[]{'m', 'n', 'o'};
        number2CharMap[7] = new Character[]{'p', 'q', 'r', 's'};
        number2CharMap[8] = new Character[]{'t', 'u', 'v'};
        number2CharMap[9] = new Character[]{'w', 'x', 'y', 'z'};
        number2CharMap[0] = new Character[]{'\0'};
        return number2CharMap;
    }
}
