class studentDeatails {

    String Name;
    int RollNo;
    int Age;
    String Department;
    int Grade;

    public void show() {

        System.out.println("Name : " + this.Name);
        System.out.println("RollNo : " + this.RollNo);
        System.out.println("Age : " + this.Age);
        System.out.println("Department : " + this.Department);
        System.out.println("Grade : " + this.Grade);
    }

    public void Behaviour() {

        if (this.Grade > 7) {
            System.out.println(this.Name + " is bright Student ");
        } else {
            System.out.println(this.Name + " is good  Student ");
        }

    }

}

public class CAndOExample1 {

    public static void main(String[] args) {

        studentDeatails sd1 = new studentDeatails();
        sd1.Name = "pinkky";
        sd1.RollNo = 21;
        sd1.Age = 19;
        sd1.Department = "CSE";
        sd1.Grade = 6;

        sd1.show();
        sd1.Behaviour();

    }

}
