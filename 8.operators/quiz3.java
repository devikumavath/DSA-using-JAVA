public class quiz3 {

    public static void main(String[] args) {
        int x , y , z;

        x=y=z=2;

        x+=y;  // x = x+y -- 4
        y-=z;   // y = y-z --0
        z/=(x+y);  // z = z/(x+y) -- 2(wrong)  --0

        System.out.println(x + " " + y + " " + z);
    }
    
}
