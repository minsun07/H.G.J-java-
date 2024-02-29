package sec01.exam05;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		Animal animal = dog;
		Dog dog2 = (Dog)animal;
		
		Cat cat = new Cat();
		Animal animal2 = dog; //error 
		Cat cat2 = (Cat)animal2;
	}

}
