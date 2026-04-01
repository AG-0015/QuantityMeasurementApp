public class Problem5 {

    static int firstOccurrence(String arr[], String key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(key)) return i;
        return -1;
    }

    static int lastOccurrence(String arr[], String key) {
        for (int i = arr.length - 1; i >= 0; i--)
            if (arr[i].equals(key)) return i;
        return -1;
    }

    static int binarySearch(String arr[], String key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid].equals(key)) return mid;
            else if (arr[mid].compareTo(key) < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    static int countOccurrences(String arr[], String key) {
        int count = 0;
        for (String s : arr)
            if (s.equals(key)) count++;
        return count;
    }

    public static void main(String[] args) {
        String arr[] = {"accA", "accB", "accB", "accC"};

        System.out.println("First: " + firstOccurrence(arr, "accB"));
        System.out.println("Last: " + lastOccurrence(arr, "accB"));

        System.out.println("Binary: " + binarySearch(arr, "accB"));
        System.out.println("Count: " + countOccurrences(arr, "accB"));
    }
}