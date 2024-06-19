package RandomThing;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        long startTime = System.nanoTime();
        Sum(n);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Toplama islemi icin gecen sure " + duration + " nanosaniyedir.");
    }

    public static void Sum(int n) {

        int sum = 0;
        int count = 0;
        System.out.print("Toplamlar: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {

                    sum += i * j * k;
                    count++;
                    System.out.print(sum + " ");
                }
            }
        }
        System.out.println("\nToplam " + count + " kez toplama hesaplandi. Yani islem " + count + " kez gerceklesti.");

    }

}
