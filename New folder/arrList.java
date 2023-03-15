//arraylist --> element sotred in continous memory , dublicate element allowed 
//dynamic size--use arrays internally  

// list interface
import java.util.ArrayList;
import java.util.Iterator;

public class arrList {

    public static void main(String[] args) {
        // creating object of arraylist class
        ArrayList<Integer> num = new ArrayList<>();

        // add(e) method - to insert element inside the arraylist at the end
        num.add(10);
        num.add(20);
        num.add(0);
        num.add(40);
        num.add(50);

        System.out.println(num);

        // add(i , e) method - to insert element at specific index
        num.add(0, 0);

        System.out.println(num);
        ArrayList<Integer> newNum = new ArrayList<>();
        newNum.add(-1);
        newNum.add(-2);
        newNum.add(-3);

        System.out.println(newNum);

        // addAll(new arraylist name) -- insert new arraylist element in the old
        // arraylist element at the end
        num.addAll(newNum);

        System.out.println(num);

        // get(i) -- to get the element of specific index
        System.out.println(num.get(0));
        System.out.println(newNum.get(0));

        // remove(i) -- to delete element based on index
        num.remove(1);
        System.out.println(num);

        // remove(value) -- to delete element based on valueOf
        num.remove(Integer.valueOf(50));
        System.out.println(num);

        // clear() - used to removed all the element from the list
        // num.clear();
        // System.out.println(num);

        // set(i , e) -- to update the element of any specific index
        num.set(3, 100);
        System.out.println(num);

        // contains(e) -- to check wealther the element is present or not
        System.out.println(num.contains(3));
        System.out.println(num.contains(100));

        // itarate
        // for loop
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i) + " ");
        }

        // foreach loop
        for (Integer no : num) {
            System.out.println(no + " ");
        }

        // Iterator
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) {

            System.out.println(it.next());

        }

    }

}
