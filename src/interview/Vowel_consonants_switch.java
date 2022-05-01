package interview;

public class Vowel_consonants_switch {
	public static void main(String[] args) {
		
	
	char alphabet = 'a';
	switch (alphabet) {
	
	case 'a' :
	case 'e' :
	case 'i' :
	case 'o' :
	case 'u' :
		
		System.out.println(alphabet + " is vowel.");
		break;
		
		default:
			System.out.println(alphabet + " is consonants. ");
		
	}
	}
}
