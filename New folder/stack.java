import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        // stack -- last in frist out (LIFO)
        // example -- stack of books , plates

        Stack<String> animals = new Stack<>();

        // push(e) -- to add element
        animals.push("lion");
        animals.push("dog");
        animals.push("tiger");

        System.out.println(animals);

        // peek() -- 
        System.out.println(animals.peek());

        // pop() -- to delete element (will delete last added element)
        System.out.println(animals.pop());

        System.out.println(animals);


    }

}
