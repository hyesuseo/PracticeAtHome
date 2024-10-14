package inherit_;
class Animal{
	String name; 
	Animal (String name){
		this.name = name;
	}
	public void makeSound() {
			System.out.println("some sound");
			
	}
	
}

class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	
	public void makeSound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	Cat (String name){
		super(name);
	}
	public void makeSound() {
		System.out.println("냥냥");
	}
}
public class inheritance {

	public static void main(String[] args) {
		Animal Dog = new Dog ("buddy");
		Animal Cat = new Cat ("navi");
		
		System.out.println(Dog.name);
		System.out.println(Cat.name);
		Dog.makeSound();
		Cat.makeSound();

	}

}
