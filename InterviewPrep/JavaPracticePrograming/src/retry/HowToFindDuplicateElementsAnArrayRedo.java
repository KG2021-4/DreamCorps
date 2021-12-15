package retry;

public class HowToFindDuplicateElementsAnArrayRedo {

	public static void main(String[] args) {
		//
		String [] string = {"Khalid","Guled","Khalid", "Hungry", "Guled"};
		boolean flag =true;
		for(int i=0; i <= string.length; i++) {
			for(int j= i+1;j<string.length;j++) {
				if(string[i].equals(string[j])){
					System.out.println(string[i] + " Is a duplicate");
					flag=false;
				}
			}
			
		}
		if(flag==true) {
			System.out.println("There are no Duplicates");
		}
	}

}
