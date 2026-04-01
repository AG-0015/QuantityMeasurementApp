class Client {
    String name;
    int risk;
    double balance;

    Client(String n, int r, double b) {
        name = n;
        risk = r;
        balance = b;
    }
}

public class Problem2 {
    static void bubbleSort(Client arr[]) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j].risk > arr[j + 1].risk) {
                    Client t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    static void insertionSort(Client arr[]) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 &&
                    (arr[j].risk < key.risk ||
                            (arr[j].risk == key.risk &&
                                    arr[j].balance < key.balance))) {

                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Client c[] = {
                new Client("A", 20, 1000),
                new Client("B", 50, 2000),
                new Client("C", 80, 1500)
        };

        bubbleSort(c);
        insertionSort(c);

        for (Client x : c)
            System.out.println(x.name + " " + x.risk);
    }
}