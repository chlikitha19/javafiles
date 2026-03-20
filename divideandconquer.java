public class divideandconquer{


int findMax(int[] arr, int low, int high) {

    // Base case: only one element
    if (low == high) {
        return arr[low];
    }

    int mid = (low + high) / 2;

    int leftMax = findMax(arr, low, mid);
    int rightMax = findMax(arr, mid + 1, high);

    return Math.max(leftMax, rightMax);
}
public static void main(String[] args) {
    divideandconquer dc = new divideandconquer();
    int[] arr = {3, 5, 7, 2, 8, 1};
    int max = dc.findMax(arr, 0, arr.length - 1);
    System.out.println("Maximum element in the array: " + max);
}
}