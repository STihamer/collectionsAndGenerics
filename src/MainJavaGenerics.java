public class MainJavaGenerics {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Character[] charArray = {'1', 'b', 'g'};
        Double[] doubleArray = {10.00, 12.85, 45.45};
        printArrayInteger(intArray);
        printArrayAny(doubleArray);
    }

    static void printArrayInteger(Integer[] integerArray) {
        for (Integer element : integerArray) {
            System.out.println(element);
        }

    }

    static void printArrayCharacter(Character[] integerArray) {
        for (Character element : integerArray) {
            System.out.println(element);
        }

    }
    static void printArrayDouble(Double[] integerArray) {
        for (Double element : integerArray) {
            System.out.println(element);
        }

    }

    static <E> void printArrayAny(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
}
