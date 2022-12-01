public class switchstmt {
    public static void main(String[] args) {

        String color = "red";

        switch (color) {
            case "red":
                System.out.println("apple");
                break;

            case "yellow":
                System.out.println("banana");
                break;

            case "green":
                System.out.println("coconut");
                break;

            case "puple":
                System.out.println("berrys");
                break;

            default:

                System.out.println("fruit not avaible of this colour");
                break;
        }
    }

}
