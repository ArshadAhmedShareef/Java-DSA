//Brute Force Time complexity-O(N^2),Space Complexity =O(1)
//Hash table Time complexity-O(N),Space Complexity =O(N)

public class main{
  public static void toSum(int[] args){
    int nums= {2,7,11,15};
    int target=9;
    toBruteForce(nums,target); //function call
    
  }
  public static int[] toBruteForce(int[] nums,int target){  //return type is array so int[] is there instead of void
    // Two for loop is used
   // target-nums[i]
    
        for( int i=0;i<nums.length;i++){
	        int diff =target-nums[i];
	        for( int j=i+1;j<nums.length;j++){
	           if( nums[j]==diff){
	               return new int[] {i,j};
	           }
	            
	        }
	    }
	    	
	throw new IllegalArgumentException("Element not found");
        
    
  }

}
