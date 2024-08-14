import java.util.*;

public class KthSmallestUsingPQ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scn.nextInt();

        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the kth element you want to find:");
        int k = scn.nextInt();

        int ans = smallestelement(arr, n, k);
        System.out.println("The kth smallest element is: " + ans);
    }

    public static int smallestelement(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if (pq.peek() > arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
