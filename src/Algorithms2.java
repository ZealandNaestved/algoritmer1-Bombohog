import java.util.Arrays;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms2 {

    // TODO 1 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med LINEAR SEARCH
    public static void linearSearchNumbers1000() {

        int result = linearSearch(new Data().getRandomNumbers1000(), 977);
        if (result == -1) {System.out.println("Element is not present in array");}
        else {System.out.println("Element is present at index " + result);}

    }

    // TODO 2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH
    public static void linearSearchBoyNames() {

        int result = linearSearch(new Data().getRandomDrengeNavne(), "Viking");
        if (result == -1) {System.out.println("Element is not present in array");}
        else {System.out.println("Element is present at index " + result);}

    }

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000
    public static int[] sortRandomNumbers() {

        int[] numbers = new Data().getRandomNumbers1000();
        Arrays.sort(numbers);
        return numbers;

    }

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne
    public static String[] sortRandomBoyNames() {

        String[] names = new Data().getRandomDrengeNavne();
        Arrays.sort(names);
        return names;

    }

    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH
    public static void binarySearchNumbers1000() {

        int result = Arrays.binarySearch(sortRandomNumbers(), 977);
        if (result == -1) {System.out.println("Element not present");}
        else {System.out.println("Element found at index " + result);}

    }

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH
    public static void binarySearchBoyNames() {

        int result = Arrays.binarySearch(sortRandomBoyNames(), "Viking");
        if (result == -1) {System.out.println("Element not present");}
        else {System.out.println("Element found at index " + result);}

    }

    // search methods
    public static int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static int linearSearch(String arr[], String x) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i].equals(x))
                return i;
        }
        return -1;
    }

}
