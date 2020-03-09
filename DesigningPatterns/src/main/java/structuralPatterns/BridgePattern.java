package structuralPatterns;

abstract class Shape {
    
    Color color;
    Shape(Color color)
    {
        this.color=color;
    }
    abstract public void colorIt();
}

interface Color {
	 
	 public void fillColor();
}

class Square extends Shape{
	 
	 Square(Color color) {
	  super(color);
	 }
	 
	 public void colorIt() {
	  System.out.print("Square filled with ");
	  color.fillColor();
	 }
	}

class Circle extends Shape{
	 
	 Circle(Color color) {
	  super(color);
	 }
	 
	 public void colorIt() {
	  System.out.print("Circle filled with ");
	  color.fillColor();
	 }
	}

class RedColor implements Color{
	 
	 public void fillColor() {
	  System.out.println("red color");
	 }
	}

class BlueColor implements Color{
	 
	 public void fillColor() {
	  System.out.println("blue color");
	 }
	}



class BridgePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Square(new RedColor());
		s1.colorIt();
		Shape s2=new Circle(new BlueColor());
		s2.colorIt();

	}

}
