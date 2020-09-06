package duotai_4;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();

		a.Call();
		Dog d = (Dog) a;
		d.eatBone();
		a.Run();

	}

}
