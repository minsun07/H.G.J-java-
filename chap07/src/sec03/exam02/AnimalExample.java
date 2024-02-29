package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
	
		Animal animal = null;
		animal = new Dog(); //타입 변환
		animal.sound();
		animal = new Cat();
		animal.sound();

		animalSound(new Dog());
		animalSound(new Cat());
		
		//animal.breathe();
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
