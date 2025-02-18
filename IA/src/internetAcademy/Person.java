package internetAcademy;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
		System.out.println("オギャー" + "、" + this.age + "歳の誕生です。");
	}
	
	public void sayHello() {
		System.out.println("こんにちは" + this.name + "です。" + this.age + "歳です。");
	}

}
