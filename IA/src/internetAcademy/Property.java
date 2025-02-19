package internetAcademy;

public class Property {

    public static void main(String[] args) {

        Person[] people = {
                new Person("タロウ", "男性", 8),
                new Person("ユウコ", "女性", 30),
                new Person("ダイチ", "男性", 55)
        };

        for (Person person : people) {
            person.sayHello();
            person.sayAge();
        }
    }
}