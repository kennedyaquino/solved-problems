import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountNicePairsInArray {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> nums = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		int pairs = 0;
		
		for(int i=0; i<nums.size(); i++) {
			for(int j=0; j<nums.size(); j++) {
				
				
				if(i != j) {
					int a = nums.get(i) + reverseNumber(nums.get(j));
					int b = nums.get(j) + reverseNumber(nums.get(i));
					
					
					if(a == b) {
						pairs += 1;
						
					}
				}
			}
		}
		
		System.out.println(pairs/2);
		
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
