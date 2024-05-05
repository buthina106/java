import java.util.Arrays;
import java.util.Random;

public class Binary {
    
    public static void main(String[] args) {
        int[] array = generateRandomArray(1000);
        Arrays.sort(array);
    
        long startTime = System.nanoTime();
        int min = array[0]; 
        int max = array[array.length - 1];
        long endTime = System.nanoTime();
        
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        long duration = (endTime - startTime);
        System.out.println("Binary search running time: " + duration + " nanoseconds");
    }
    
    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random(); // Initialize Random object
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000); 
        }
        return array;
    }
}
