import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CountNicePairsInArray {

	public static void main(String[] args) throws IOException {
		
		int[] nums = new int[] {13, 10, 35, 24, 76};
		int[] arr = new int[nums.length];
		
		int pairs = 0;
		
		for(int i=0; i<nums.length; i++) {
			arr[i] = nums[i] - reverseNumber(nums[i]);
		}
		
		Map<Integer, Integer> dic = new HashMap<>();
		int MOD = (int) 1e9 + 7;
		
		for(int num : arr) {
			pairs = (pairs + dic.getOrDefault(num, 0)) % MOD;
			dic.put(num, dic.getOrDefault(num, 0) + 1);
		}
		
		System.out.println(pairs);
		
	}
	
	private static Integer reverseNumber(int number) {
		int reverse = 0;
		
		while(number != 0) {
			int rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number/10;
		}
		
		return reverse;
	}

}
