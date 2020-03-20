
public class Cat extends Pet {
	String sound = "meow";
	
	public Cat(String petName) {
		super(petName);
	}
	public String speak() {
		return sound;
	}
}
