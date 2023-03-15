
class pen {

    private String color;
    private int tip;

    // setters
    void setcolor(String newcolor) {
        this.color = newcolor;
    }

    void settip(int newtip) {
        this.tip = newtip;
    }

    // getters
    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

}

public class setterAndgetter {
    public static void main(String[] args) {

        pen p1 = new pen();

        p1.setcolor("blue");
        p1.settip(2);

        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());

    }

}
