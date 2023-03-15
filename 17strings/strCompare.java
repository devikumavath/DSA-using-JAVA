public class strCompare {

    public static void main(String[] args) {

        String s1 = "devi"; // s1 , s2 point to same string in memory
        String s2 = "devi";
        String s3 = new String("devi"); // create new string in memory

        // compare == check are strings same at object level
        if (s1 == s2) { // equal
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        if (s1 == s3) { // not equal due to interning
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        // .equals() --> check the value of string are same or not
        if (s1.equals(s3)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are  not equal");
        }
    }

}
