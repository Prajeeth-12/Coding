public class maxsubarraysum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,-90,1,100};
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        System.out.println("Maximum Subarray Sum: " + maxSoFar);
    }
}
