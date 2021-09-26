package wipro;

public class training {

	public static void main(String[] args) {
		int[] nums = {10,3,6,1,2,7,9};
		int sum = 0;
	    boolean add = true;
	    for(int i = 0; i <= nums.length - 1; i++){
	        if(nums[i] != 6 && add == true)
	            sum += nums[i];
	        else if (nums[i] == 6){
	            for (int j = i; j <= nums.length -1; j++){
	                if (nums[j] == 7)
	                    add = false;
	            }
	            if (add)
	                sum += 6;
	        }
	        else if (nums[i] == 7)
	            add = true;
	     }
	    System.out.println(sum);
	}
}

