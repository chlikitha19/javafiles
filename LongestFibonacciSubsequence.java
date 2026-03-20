import java.util.*;

public class LongestFibonacciSubsequence {

    public static List<Integer> longestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> index = new HashMap<>();

        // Store element -> index
        for (int i = 0; i < n; i++) {
            index.put(arr[i], i);
        }

        int[][] dp = new int[n][n];
        int maxLen = 0, endI = 0, endJ = 0;

        // Initialize DP table
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], 2);
        }

        // DP computation
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j; i++) {
                int prev = arr[j] - arr[i];
                if (prev < arr[i] && index.containsKey(prev)) {
                    int k = index.get(prev);
                    dp[i][j] = dp[k][i] + 1;

                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endI = i;
                        endJ = j;
                    }
                }
            }
        }

        // Reconstruct subsequence
        List<Integer> result = new ArrayList<>();
        if (maxLen < 3) return result;

        result.add(arr[endJ]);
        result.add(arr[endI]);

        int length = maxLen;
        while (length > 2) {
            int next = result.get(result.size() - 1) - result.get(result.size() - 2);
            result.add(next);
            length--;
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> fibSubseq = longestFibSubseq(arr);

        System.out.println("Longest Fibonacci Subsequence: " + fibSubseq);
        System.out.println("Length: " + fibSubseq.size());

        sc.close();
    }
}