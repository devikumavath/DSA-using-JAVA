import java.util.LinkedList;

public class linkedList {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("devi");
        names.add("ranu");

        System.out.println(names);

        names.addFirst("A");
        System.out.println(names);

        names.addLast("z");
        System.out.println(names);

        names.add(2, "c");
        System.out.println(names);

        System.out.println(names.remove(1));

        LinkedList<String> no = new LinkedList<>();
        no.add("1");
        no.add("2");
        no.add("1");

        System.out.println(no);

        names.addAll(no);
        System.out.println(names);

        System.out.println(names.contains("2"));

        System.out.println(names.get(2));

        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        System.out.println(names.indexOf("2"));

        System.out.println(names.lastIndexOf("1"));

        System.out.println(names.size());

        for (String list : names) {
            System.out.println(list);
        }

    }

}
