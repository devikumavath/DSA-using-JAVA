// class creating
class Dog {

    String name;
    String color; // data members || properties
    int age;

    public void eat() { // memeber method || behaviours
        System.out.println(this.name + " loves to eat roti");
    }

    public void play() {
        System.out.println(this.name + "loves to play in park");
    }

}

public class classAndOjects {

    public static void main(String[] args) {

        // object creation
        Dog d1 = new Dog();

        d1.name = "max";
        d1.age = 7;
        d1.color = "golden";

        d1.eat(); // method calling
        d1.play();

    }
}
