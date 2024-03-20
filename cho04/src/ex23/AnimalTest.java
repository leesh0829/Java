package ex23;

public class AnimalTest {

public static void animalSound(Animal an)
{
	an.sound();
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.sound();
		c.sound();
		
		System.out.println("----------------------");
		
		Animal ani = new Dog();
		ani.sound();
		
		Animal ani2 = new Cat();
		ani2.sound();
		
		System.out.println("-------------");
		
		animalSound(d);
		animalSound(c);
	}

}
