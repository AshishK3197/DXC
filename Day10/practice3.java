abstract class Shape{
    abstract int Rectangle(int length,int breadth);
    abstract int Square(int side);
    abstract double Circle(float radius);
    abstract double Triangle(int base,int height);
}

class CalcArea extends Shape{
    int Rectangle(int length,int breadth){
        return length*breadth;
    }
    
    int Square (int side){
        return side*side;
        }

        double Triangle(int base,int height){
            float area = (float)1/2*base*height;
            return(area);
        }

        double Circle(float radius){
            double area = 3.14*radius*radius;
            return (area);
        }
}
class Calculating{
    public static void main(String[] args) {
        CalcArea air = new CalcArea();
        air.Circle(30);
        air.Triangle(10,10);
        air.Square(10);
        air.Rectangle(56,98);

        System.out.println("The area of the respective shapes are: " + " " + air.Circle(30) + " " + air.Triangle(10,10) + " " + air.Square(10) + " " + air.Rectangle(56,98));
    }
}