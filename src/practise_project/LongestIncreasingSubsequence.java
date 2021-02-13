
package practise_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt((100 - 1) + 1) + 1;
		}

		System.out.println(Arrays.toString(arr));

		lis(arr, arr.length);
	}

	public static int getCeil(int arr[], int T[], int l, int h, int key) {

		while (h - l > 1) {

			int m = l + (h - l) / 2;
			if (arr[T[m]] >= key)
				h = m;
			else
				l = m;
		}

		return h;
	}

	public static void lis(int arr[], int n) {

		int tTable[] = new int[n];
		int pTable[] = new int[n];
		int len = 1;

		Arrays.fill(tTable, 0);

		Arrays.fill(pTable, -1);

		for (int i = 1; i < n; i++) {
			if (arr[i] < arr[tTable[0]])

				tTable[0] = i;

			else if (arr[i] > arr[tTable[len - 1]]) {

				pTable[i] = tTable[len - 1];
				tTable[len++] = i;
			} else {

				int pos = getCeil(arr, tTable, -1, len - 1, arr[i]);

				pTable[i] = tTable[pos - 1];
				tTable[pos] = i;
			}
		}

		ArrayList<Integer> as = new ArrayList<Integer>();

		for (int i = tTable[len - 1]; i >= 0; i = pTable[i])
			as.add(arr[i]);

		Collections.reverse(as);
		System.out.println("Longest Increasing subsequence of given input: ");
		for (int i = 0; i < as.size(); i++) {
			System.out.print(as.get(i) + " ");
		}
		// Arrays.toString(as.toArray());
		// as.stream().forEach(System.out::print);
		System.out.println();

	}

}
