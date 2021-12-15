
public class StringTargetQuestion {

	public static void main(String[] args) {
	 int [] flowerbed = {0,0,1,0,1};
	 System.out.println( checker(flowerbed,2));
	}
 public static boolean checker(int [] x, int n) {
	 int count =0;
	 boolean flag =false;
	 for(int i=0;i<x.length; i++) {
		 if( x [i] ==0 && (i==0 || x[i-1]==0) && (i == x.length-1 || x[i+1]==0) ){
			 x[i]=1;
			 count++;
			 
		
			
	 }
		 if(n<=count) {
			 flag=true;
		 }
	 
	
 }
	 return flag; 
}

}