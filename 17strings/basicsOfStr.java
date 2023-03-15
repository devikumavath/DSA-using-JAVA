import java.util.Scanner;

public class basicsOfStr {

    public static void main(String[] args) {
        // strings are inmutable
        // string class

        // char array
        char ch[] = { 'a', 'b', 'c' };
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);

        // char
        char ch1 = 'x';
        System.out.println(ch1);

        // string - method 1
        String str = "abcd";
        System.out.println(str);

        // new string - method 2
        String str1 = new String("xyz");
        System.out.println(str1);

        // string input
        Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next(); //or

        String name = sc.next(); // take only single word until space/nextline encounter
        System.out.println("name :" + name);

        // String fullname = sc.nextLine(); // take full lines with space
        // System.out.println("fullname :" + fullname);

        // length function

        System.out.println(name.length());

        // concatenation
        String fristName = "devi ";
        String lastName = "kumavath";
        String fullName = fristName + lastName;

        System.out.println(fullName);

        // charAt function
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.charAt(4));

        System.out.println(fullName.charAt(fullName.length() - 1));

        // charAt iteration
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }

        sc.close();

    }

}
