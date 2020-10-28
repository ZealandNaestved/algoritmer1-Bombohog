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
        if (result == -1) {System.out.print("Element is not present in array");}
        else {System.out.print("Element is present at index " + result);}

    }

    // TODO 2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH
    public static void linearSearchBoyNames() {

        int result = linearSearch(new Data().getRandomDrengeNavne(), "Viking");
        if (result == -1) {System.out.print("Element is not present in array");}
        else {System.out.print("Element is present at index " + result);}

    }

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000


    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne


    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH
    public static void binarySearchNumbers1000() {

        int result = binarySearch(new Data().getRandomNumbers1000(), 977);
        if (result == -1) {System.out.println("Element not present");}
        else {System.out.println("Element found at index " + result);}

    }

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH
    public static void binarySearchBoyNames() {

        int result = binarySearch(new Data().getRandomDrengeNavne(), "Viking");
        if (result == -1) {System.out.println("Element not present");}
        else {System.out.println("Element found at index " + result);}

    }


    // seach and sorting methods
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

    public static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    public static int binarySearch(String[] arr, String x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int res = x.compareTo(arr[m]);

            // Check if x is present at mid
            if (res == 0)
                return m;

            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        return -1;
    }

}
