
class Person {

    int age;

    public Person(int a) {
        age = a;
    }

    void increaseAge() {
        age += 1;
    }

}

class Main {

    public static void main(String[] args) {
        Person p1 = new Person(19);
        System.out.println(p1.age);
        p1.increaseAge();
        System.out.println(p1.age);
        p1.increaseAge();
        System.out.println(p1.age);
    }
}
