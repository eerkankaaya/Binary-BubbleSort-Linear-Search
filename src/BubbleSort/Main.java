package BubbleSort;

public class Main {

    public static void main(String[] args) {

        int[] data3 = {121, 11, 22, 66, 33, 88, 55, 154, 77, 44, 99, 110, 1, 132, 143};
        //int[] data3 = {1, 11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132, 143, 154};
        //int[] data3 = {77, 11, 66, 33, 88, 55, 154, 121, 44, 99, 110, 22, 132, 143,1};
        long startTime = System.nanoTime();
        bubbleSort(data3);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("bu islem icin gecen sure " + duration + " nanosaniyedir.");
        for (int sorting : data3) {
            System.out.print(sorting + " ");
        }
        System.out.println();
        System.out.println((data3.length) + " Tane sayi siralandi.");

    }

    public static void bubbleSort(int[] data) {

        int count = 0;
        for (int i = data.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int dummy = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = dummy;

                }
                count++;
            }
        }
        System.out.println("islem "+ count+" kez gerceklesti");

    }
}
