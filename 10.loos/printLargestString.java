public class printLargestString {
    public static void main(String[] args) {

        // lexicographic order
        String fruits[] = { "mango", "apple", "banana" };

        // compareTo function --> str1.compareTo(str2) (A and a differnt)

        // other function --> compareToIgnoreCase() (A and a same)
        // if 0:equal , if <0 -ve str1 < str2 , if >0 +ve str2 > str1

        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {

           if( largest.compareTo(fruits[i]) < 0 ) {
            largest = fruits[i];

           }

        }

        System.out.print(largest);
    }

}
