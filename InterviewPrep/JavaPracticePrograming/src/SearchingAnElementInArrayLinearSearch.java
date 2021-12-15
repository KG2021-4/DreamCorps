import java.util.Scanner;

public class SearchingAnElementInArrayLinearSearch {

	public static void main(String[] args) {
		//Compare each an every element with Array
		int[] numbers = {1,5,44,10,22};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number you wish to find");
		int num = sc.nextInt();
		boolean flag =false;
		//traverse through array
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==num) {
				System.out.println(num +" is found at index " + i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println(-1);
		}
		

	}

}
