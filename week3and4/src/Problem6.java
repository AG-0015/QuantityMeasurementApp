public class Problem6 {

    static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    static void floorCeil(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        int floor = -1, ceil = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                floor = ceil = arr[mid];
                break;
            }

            if (arr[mid] < x) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }

    public static void main(String[] args) {
        int arr[] = {10, 25, 50, 100};

        System.out.println("Linear: " + linearSearch(arr, 30));
        floorCeil(arr, 30);
    }
}