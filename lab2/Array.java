import java.util.Random;

public class Array {
    
    public static void main(String[] args) {
        int[] array = generateRandomArray(1000);
        long startTime = System.nanoTime();
        int min = findMin(array);
        int max = findMax(array);
        long endTime = System.nanoTime();
        
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        long duration = (endTime - startTime);
        System.out.println("Search running time: " + duration + " nanoseconds");
    }
    
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000); 
        }
        return array;
    }
}
