package duotai_4;

public class feiji_test {

	public static void main(String[] args) {
		
		Feiji f = new Keji();
		Keji k = (Keji)f;
		k.zaike();
		
		f = new Zhandouji();
		Zhandouji z = (Zhandouji)f;
		
		z.zhandou();

	}

}
