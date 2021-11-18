
public class ArrayPrint {
public static void main(String[] args) {
	//WHILE LOOP
	   int[] nums = {1, 2, 3, 4};
	   
       int index = 0;
       while (index < nums.length) {
           int num = nums[index];
           System.out.println(num);
           index++;
           
}
     //DO WHILE
       int i=0;
       do{
            System.out.println(nums[i]);
            i++;
       }while(i<nums.length);
       System.out.print("{");
       //FOR EACH LOOP
       for(int num: nums) {
      	 System.out.print(num);
      	 if(num < nums.length) {
          	 System.out.print(",");

      	 }
      	 
       }
       System.out.print("}");
}
    
}
