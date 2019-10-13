package Practice;

abstract class testing{
    abstract  void swimming();
}

class practice1 extends testing{
    void swimming(){
        System.out.println("This is the inherited abstract class");
    }
    void display(){
        System.out.println("The patient likes swimming");
    }
}  

 
public class practice{
public static void main(String[] args) {
    practice1 p1 = new practice1();
    p1.display();

    System.out.println("the inherited class is working: ");
}
}
