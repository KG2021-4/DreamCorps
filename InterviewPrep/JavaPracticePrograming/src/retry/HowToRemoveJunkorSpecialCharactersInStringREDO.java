package retry;

public class HowToRemoveJunkorSpecialCharactersInStringREDO {

	public static void main(String[] args) {
		String k ="abcd%%efg";
		String newk =k.replace('%', 'n');
		System.out.println(newk);
	
	}

}
