package duotai_4;

public class Keji extends Feiji{

public String  fly() {
	System.out.println("keiji");
		return "123";
	}
public static void main(String[] args) {
	Feiji f = new Keji();
	Keji k = (Keji)f;
	k.fly();
}
}
