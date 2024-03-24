public class BinarySearch
{
    // Time complexity of Binary Search is O(log n)
    // Space complexity is O(1) it uses a constant amount of extra space.
    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm
    // provide time and space analysis
public static void main(String[] args)
{
    // Test case 1: Key exists in the array
    int[] array1 = {1, 3, 5, 7, 9};
    int key1 = 5;
    int low1 = 0;
    int high1 = array1.length - 1;
    int result1 = runBinarySearchIteratively(array1, key1, low1, high1);
    System.out.println("Test case 1: Index of key " + key1 + ": " + result1);



}


}
