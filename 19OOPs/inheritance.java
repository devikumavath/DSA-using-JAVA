public class inheritance {

    public static void main(String[] args) {

        // 1
        dog d1 = new dog();
        d1.legs = 4;
        d1.skincolor = "brown";

        System.out.println(d1.legs);
        System.out.println(d1.skincolor);

        d1.eat();
        d1.sound();

        
    }

}

// 1 single || simple inheritance
class animal {

    int legs;
    String skincolor;

    public void eat() {
        System.out.println("eats");
    }

}

class dog extends animal {

    public void sound() {
        System.out.println("bow bow");
    }

}
