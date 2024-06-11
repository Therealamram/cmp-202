public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int rotations = 2;
        
        int[] result = rotleft(array, rotations);
        
        // Print the updated array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] rotleft(int[] a, int d) { 
        int n = a.length;
        // Calculate the effective number of rotations
        int effectiveRotations = d % n;
        
        // Create a new array to hold the rotated elements
        int[] rotatedArray = new int[n];
        
        // Perform left rotations
        for (int i = 0; i < n; i++) {
            // Calculate the new index after rotation
            int newIndex = (i - effectiveRotations + n) % n;
            rotatedArray[newIndex] = a[i];
        }
        
        return rotatedArray;
    }
}
