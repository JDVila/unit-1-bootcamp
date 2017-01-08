import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {
    static ArrayList<Cat> catList =new ArrayList<>();
    static ArrayList<Integer> intList = new ArrayList<>();
    static HashMap<String, Integer> podHashMap = new HashMap<>();

    public static void main(String args[]) {
        catList.add(new Cat("Tom"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Sam"));
        catList.add(new Cat("Dave"));
        catList.add(new Cat("Ignacio"));
        for (int i = 0; i < catList.size(); i++) {
            System.out.println(catList.get(i).getName());
        }
        intList.add(5);
        intList.add(2);
        intList.add(8);
        intList.add(3);
        intList.add(5);
        intList.add(2);
        intList.add(7);
        intList.add(9);
        intList.add(2);
        intList.add(1);
        intList.add(5);
        mostFrequentElement(intList);
        podHashMap.put("Eddie", 31);
        podHashMap.put("Derek", 21);
        podHashMap.put("Akasha", 18);
        podHashMap.put("Lily", 25);
        podHashMap.put("Cue", 23);
        podHashMap.put("Jose", 36);
        for (String s : podHashMap.keySet()) {
            System.out.println(s + "'s age: " + podHashMap.get(s));
        }
        System.out.println(canRentACar(podHashMap));
        System.out.println(wordsWithoutList(new String[] {"aaa", "b", "bbb", "c", "ee", "dddd"}, 3));
    }
    public static void mostFrequentElement(ArrayList<Integer> listOfInts) {
        ArrayList<Integer> intSet = new ArrayList<>();
        ArrayList<Integer> intVals = new ArrayList<>();
        int biggest = 0;
        for (int i = 0; i < listOfInts.size(); i++) {
            if (intSet.contains(listOfInts.get(i))) {
                continue;
            } else {
                intSet.add(listOfInts.get(i));
                intVals.add(0);
            }
        }
        for (int i = 0; i < intSet.size(); i++) {
            for (int j = 0; j < listOfInts.size(); j++) {
                if (intSet.get(i).equals(listOfInts.get(j))) {
                    intVals.set(i, intVals.get(i) + 1);
                }
            }
        }
        for (int i = 1; i < intVals.size(); i++) {
            if (biggest < intVals.get(i)) {
                biggest = intVals.get(i);
            }
        }
        System.out.println("Most Frequent Element: " + intSet.get(intVals.indexOf(biggest)) + "\nNumber of Occurrences: " + biggest);
    }
    public static boolean canRentACar(HashMap<String, Integer> renter) {
        for (String s : renter.keySet()) {
            if (renter.get(s) >= 25) {
                return true;
            }
        }
        return false;
    }
    public static ArrayList<String> wordsWithoutList(String[] arr, int charLength){
        ArrayList<String> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == charLength) {
                continue;
            } else {
                newArr.add(arr[i]);
            }
        }
        return newArr;
    }
}
