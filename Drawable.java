package Review9;

public interface Drawable {

    public static final String TOOL = "Pencil";

    void draw();    // By default, this method is public abstract.

    default void print(){
        System.out.println("We are drawing object using "+TOOL);
    }
    static void erase(){
        System.out.println("We can erase all drawings are ");
    }

}
abstract class Shape{
    String color;
    double width, length;

    Shape (String color, double length, double width){
        this.color=color;
        this.length=length;
        this.width=width;
    }
   public abstract double calculateArea();
}


class Rectangle extends Shape implements Drawable {

    Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    public double calculateArea(){
        return 0;
    }
    public void draw() {
        System.out.println("I'm drawing rectangle");
    }
}

class Square implements Drawable {
    public void draw(){
        System.out.println("I'm drawing square ");
    }
}


