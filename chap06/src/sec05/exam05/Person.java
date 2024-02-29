package sec05.exam05;

public class Person {
	
	final String nation = "Korea";  //field
	final String ssn;  				//field
	String name;  					//field
	
	public Person(String ssn, String name) {  //method
		this.ssn = ssn;
		this.name = name;
	}

}
