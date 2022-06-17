import java.util.*;
import java.util.stream.Collectors;

public class CollectionExercises {
    // Make a List, populate it with numbers from 1 to 10 and then iterate
    //
    //through them and print only even numbers;

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        for (Integer element : integerList) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }

        /*Make a Set, add to it the same string three times. Iterate through the set
        and print all the elements. What do you notice
        */

        Set<String> setList = new HashSet<>();
        setList.add("Same");
        setList.add("Same");
        setList.add("Same");

        for (String element : setList) {

            System.out.println(element);
        }

       /* Make a Map with String keys and Integer values. Iterate through it and
        print only the keys that have a value greater than 10.*/

        Map<String, Integer> newMap = new HashMap<>();

        newMap.put("One", 1);
        newMap.put("Seven", 7);
        newMap.put("Eleven", 11);
        newMap.put("Twelve", 12);
        newMap.put("Ten", 10);
        newMap.put("Twenty", 20);

        Iterator<Map.Entry<String, Integer>> itr = newMap.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> newEntry = itr.next();
            if (newEntry.getValue() > 10) {
                System.out.println(newEntry.getKey());
            }
        }

        newMap.entrySet().stream().filter(e -> e.getValue() > 10).forEach(e -> System.out.println(e.getKey()));


        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            if (entry.getValue() > 10) {
                System.out.println(entry.getKey());
            }
        }

     /*   Make a List, populate it with the following numbers: 7, 4, 5, 2, 1, 2, 4, 1.
        Eliminate all duplicates and print the list.
        Sort the numbers from high to low in the list and print it
        Create a Set of Strings from the sorted list and print it
        Create a Map having the resulted set as the keySet and the list as
        values for each key*/

        NavigableSet<Integer> integerTreeSetList1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //using Comparator to sort elements in descending order.
                return o2.compareTo(o1);
            }
        });
        integerTreeSetList1.add(7);
        integerTreeSetList1.add(4);
        integerTreeSetList1.add(5);
        integerTreeSetList1.add(2);
        integerTreeSetList1.add(1);
        integerTreeSetList1.add(2);
        integerTreeSetList1.add(4);
        integerTreeSetList1.add(1);

        System.out.println(integerTreeSetList1);


        Iterator<Integer> j = integerTreeSetList1.descendingIterator();
        while (j.hasNext()) {
            System.out.println(j.next());
        }


        Set newTreSet = integerTreeSetList1.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //using Comparator to sort elements in ascending order.
                return o1.compareTo(o2);
            }
        }).collect(Collectors.toSet());

        System.out.println(newTreSet);


        Set<String> setOfStrings = new HashSet<>();
        setOfStrings.add("7");
        setOfStrings.add("4");
        setOfStrings.add("5");
        setOfStrings.add("2");
        setOfStrings.add("1");
        setOfStrings.add("2");
        setOfStrings.add("4");
        setOfStrings.add("1");

        Iterator<String> str2 = setOfStrings.iterator();
        while (str2.hasNext()) {
            System.out.println(str2.next());
        }

        Map<String, Integer> intStringMap = new HashMap<>();

        intStringMap.put("7", 7);
        intStringMap.put("4", 4);
        intStringMap.put("5", 5);
        intStringMap.put("2", 2);
        intStringMap.put("1", 1);
        intStringMap.put("2", 2);
        intStringMap.put("4", 4);
        intStringMap.put("1", 1);

        System.out.println(intStringMap);
    }

}

