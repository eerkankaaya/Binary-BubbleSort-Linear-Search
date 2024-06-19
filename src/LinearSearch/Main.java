package LinearSearch;

public class Main {

    public static void main(String[] args) {
        int[] data = {1, 11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132, 143, 154};
        int target = 154;
        long startTime = System.nanoTime();
        int result = LinearSearch(data, target);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        if (result != -1) {
            System.out.println("Sayiyi seride bulunan  " + data.length + " eleman arasindan buldun. Sayi serinin " + (result + 1) + ". elemani" + " ve indisi " + result);

        } else {
            System.out.println("Sayi bu seride yok.." + "Deneme sayisi " + (data.length));
        }
        System.out.println("Bu islem icin gecen sure " + duration + " nanosaniyedir.");
    }

    public static int LinearSearch(int[] data, int target) {

        int count = 1;
        for (int i = 0; i < data.length; i++) {
            if (target == data[i]) {
                System.out.println("islem " + count + " kez gerceklesti.");
                return i;
            }

            count++;
        }
        System.out.println("islem " + (count - 1) + " kez gerceklesti.");
        return -1;
    }

}
