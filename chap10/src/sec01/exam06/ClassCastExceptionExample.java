package sec01.exam06;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat); //ClassCastException
		
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog){
			Dog dog = (Dog) animal;
		}
		
	}

}
