package test2.spring3;

public class BeansImpl implements Beans{
	
	private String name;
	private String greeting;
	
	public BeansImpl(String name){
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void sayHello() {
		System.out.println(greeting + name + "!");
	}

}
