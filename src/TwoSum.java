public class TwoSum {

	public static void main(String[] args) {
		int[] nums = new int[] {3, 2, 3};
		int target = 6;
		int[] arr = new int[2];
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j< nums.length; j++) {
				if(i != j) {
					int result = nums[i] + nums[j];
					
					if(result == target) {
						arr[0] = i;
						arr[1] = j;
					}
				}
			}
		}
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	
	}
	
	

}
