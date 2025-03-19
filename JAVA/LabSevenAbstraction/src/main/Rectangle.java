package main;

public class Rectangle extends Shape{
    public double length;
    public double breadth;
    
    @Override
    public double area(){
        double _area_of_rectangle = this.length * this.breadth;
        return _area_of_rectangle;
    }
    
    @Override
    public double perimeter(){
        double _perimeter_of_rectangle = 2 * (this.length + this.breadth);
        return _perimeter_of_rectangle;
        
    }
    
}
