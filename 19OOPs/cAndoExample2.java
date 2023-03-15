class Pen {

    String colour;
    int tip;

    void setColour(String newColour){
        this.colour = newColour;

    }

    void settip(int newTip){
        this.tip = newTip;
    }
}

public class cAndoExample2 {

    public static void main(String[] args) {

        Pen p1 = new Pen();
        

        p1.setColour("black");
        System.out.println(p1.colour);
        p1.settip(3);
        System.out.println(p1.tip);

        

        
        
    }
    
}
