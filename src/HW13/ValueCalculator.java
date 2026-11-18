package HW13;

public class ValueCalculator {
    float [] arr = new float[1000000];
    int size = 1000000;
    int half = size / 2;

    public void doCalc() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        float [] a1 = new float[half];
        float [] a2 = new float[half];

        System.arraycopy(arr, 0, a1, 0, half);
        System.arraycopy(arr, half, a2, 0, half);

        Thread newthread1 = new Thread(() -> {
            for (int i = 0; i < half; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5)
                        * Math.cos(0.2f + i / 5)
                        * Math.cos(0.4f + i / 2));
            }
        });
        Thread newthread2 = new Thread(() -> {
            for (int i = 0; i < half; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5)
                        * Math.cos(0.2f + i / 5)
                        * Math.cos(0.4f + i / 2));
            }
        });
        newthread1.start();
        newthread2.start();

        try {
            newthread1.join();
            newthread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr, 0, half);
        System.arraycopy(a2, 0, arr, half, half);

        long end = System.currentTimeMillis();
        System.out.println("Час виконання: " + (end - start) + " мс");
    }
}
