// default and parameterized constructor 

class student {

    String stdname;
    int rollno;

    // java will create constructor automatically but there is no initiallation if user is not created
    // student() {

    // }



   // user defined constructor with parameters 
    student(String name) {
          this.stdname = name;
        System.out.println("constructor is called");

    }

}

public class defaultConstructors {
    public static void main(String[] args) {


        
        // student s1 = new student();
        // s1.stdname = "devi";
        // s1.rollno = 23;

        // System.out.println(s1.stdname);
        // System.out.println(s1.rollno);


      student s1 = new student("devi");
      System.out.println(s1.stdname);

     

    }

}
