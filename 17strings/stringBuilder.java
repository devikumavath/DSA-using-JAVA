public class stringBuilder {

    public static void main(String[] args) {

        // strings are INMUTABLE --- it means once the string is create you cannot make
        // changes in it and if you do so it will create
        // new string and point it that

        // interning stack reference value

        // st and st1 have same value so will point to same obj in the memory
        String st = "devi";
        String st1 = "devi";
        System.out.println(System.identityHashCode(st));
        System.out.println(System.identityHashCode(st1));

        // if text is modifed from devi to devi kumavath , it will copy text to new
        // memory and then point to that
        String text = "devi";
        System.out.println(text);
        System.out.println(System.identityHashCode(text));

        text = "devi kumavath";
        System.out.println(text);
        System.out.println(System.identityHashCode(text));

        // stringbuilder -- MUTABLE
        StringBuilder sb = new StringBuilder("");

        // changes will occur in the memory
        System.out.println(sb.append("devi"));
        System.out.println(System.identityHashCode(sb)); // same memory

        System.out.println(sb.append("devi kumavath"));
        System.out.println(System.identityHashCode(sb)); // memory

        // with string O(26 * n^2)
        // with stringbuilder O(26)
        StringBuilder sb1 = new StringBuilder("");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            sb1.append(ch);
        }

        System.out.println(sb1);
        System.out.println(sb1.length());

    }

}
