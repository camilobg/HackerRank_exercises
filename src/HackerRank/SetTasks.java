package HackerRank;

import java.util.*;

public class SetTasks {

    public static Set<Integer> getSetFromString(String str) {
        // write your code here
        Set<Integer> mySet=new HashSet<>();
        for(String q:str.split(" "))mySet.add(Integer.parseInt(q));
        return mySet;

    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // write your code here
        SortedSet set1 = new TreeSet<>();
        set1.addAll(set);
        set.retainAll(set1.headSet(11));
        System.out.println("Set retenido: "+set);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str="1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";
        Set set1=getSetFromString(str);
        System.out.println("Set que se entrega: "+set1);
        removeAllNumbersGreaterThan10(set1);
        System.out.println("Set modificado: "+set1);

    }
}
