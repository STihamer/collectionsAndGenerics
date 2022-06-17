import java.util.ArrayList;
import java.util.List;

public class GenericsExercises {
    /*Write a generic method to exchange the positions of two different elements in an array.*/
    public static <E> void exchangeThePosition(E[] newArray) {
        E helper;
        helper = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = helper;
    }

    //Write a generic method to count the number of prime numbers from a list

    public static boolean isPrime(double num) {
        if (num <= 1) {
            return false;
        }
        for (double i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static <E> void checkPrime(List<E> arrayList) {
        int checkPrimeNumbers = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (!(arrayList.get(i) instanceof Integer)) {
                System.out.println("You should provide integer list");
                return;
            } else {
                int counter = 0;
                for (int j = 1; j <= (Integer) arrayList.get(i); j++) {
                    if (i % j == 0) {
                        counter++;
                    }
                }
                if (counter <= 2) {
                    checkPrimeNumbers++;
                }
            }
        }
        System.out.println(checkPrimeNumbers);
    }


    public static void main(String[] args) {


        Integer[] newArray = {1, 2, 3, 4, 6, 8};


        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        exchangeThePosition(newArray);


        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        String[] stringArray = {"One", "Two", "Three", "Four"};
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        exchangeThePosition(stringArray);

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        List<Number> numberListToCheckPrime = new ArrayList<>();
        numberListToCheckPrime.add(1);
        numberListToCheckPrime.add(2);
        numberListToCheckPrime.add(5);
        numberListToCheckPrime.add(7);
        numberListToCheckPrime.add(9);


        checkPrime(numberListToCheckPrime);
    }

}
