package internetAcademy;

public class Person {

	String name;
	String sex;
	int age;

	public Person(String name, String sex, int age) {

		this.name = name;
		this.sex = sex;
		this.age = age;

		System.out.println("オギャー" + "、" + this.age + "歳の誕生です。");
	}

	public void sayHello() {
		System.out.println("こんにちは" + this.name + "です。" + this.age + "歳です。" + this.sex + "です。");
	}

	public void sayAge() {

		if (age < 20) {
			System.out.println(this.name + "はこれから成長期です。");
		} else if (age >= 20 && age <= 50) {
			System.out.println(this.name + "は働き盛りです。");
		} else {
			System.out.println(this.name + "はもう引退です");
		}

	}

}
