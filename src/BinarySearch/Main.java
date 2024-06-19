package BinarySearch;

public class Main {

    public static void main(String[] args) {
        int[] data2 = {1, 11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132, 143, 154};
        int target2 = 2;
        long startTime = System.nanoTime();
        int result = BinarySearch(data2, target2);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("bu islem icin gecen sure " + duration + " nanosaniyedir.");
        if (result != -1) {
            System.out.println("Sayiyi seride bulunan  " + data2.length + " eleman arasindan buldun. Sayi serinin " + (result + 1) + ". elemani" + " ve indisi " + result);
            System.out.println("islem "+ (result+1)+" kez gerceklesti");
        } else {
            System.out.println("Sayi bu seride yok.." + "Deneme sayisi " + (data2.length));
        }
    }

    public static int BinarySearch(int[] data2, int target2) {
        int left = 0;
        int right = data2.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target2 == data2[mid]) {
                return mid;
            } else if (target2 < data2[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return -1;
    }

}
