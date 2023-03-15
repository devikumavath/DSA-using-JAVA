// copy and private constructor 

class child {
    String name;
    int age;
    String pwd;

    //copy constructor -- shallow
     child(child obj){
        this.name = obj.name;
        this.age = obj.age;
        this.pwd = obj.pwd;


    }

   

   

}


public class copyConstructor {

    public static void main(String[] args) {


        // child obj = new child();
        // obj.name = "devi";
        // obj.age = 18;
        // obj.pwd = "abc";

        // child obj2 = new child(obj);
        // obj2.pwd = "xyz";
       

        
    }
    
}
