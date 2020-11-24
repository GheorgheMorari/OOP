//Morari Gheorghe LAB7
import java.util.*;
abstract class Figure{
    abstract float getArea();
    abstract float getPerimeter();
}

class Square extends Figure{
    float side = 0;
    Square(float side){
        this.side = side;
    }
    float getArea(){
        return side * side;
    }
    float getPerimeter(){
        return 4 * side;
    }
}
class Rectangle extends Figure{
    float sideA = 0;
    float sideB = 0;
    Rectangle(float sideA, float sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    float getArea(){
        return sideA * sideB;
    }
    float getPerimeter(){
        return 2 * sideA + 2 * sideB;
    }
}
class Triangle extends Figure{
    float side = 0;
    Triangle(float side){
        this.side = side;
    }
    float getArea(){
        return (float)0.4330127 * side * side; //sqrt(3)/4 ~ 0.4330127
    }
    float getPerimeter(){
        return 3 * side;
    }
}

class FigureController{
    static Figure getBiggestAreaFigure(List<Figure> obj_list){
        float max = obj_list.get(0).getArea();
        int index = 0;
        int len = obj_list.size();
        for (int i = 1; i < len; i++){
            float current_size = obj_list.get(i).getArea();
            if (current_size > max){
                max = current_size;
                index = i;
            };
        }
        return obj_list.get(index);
    }
    static Figure getBiggestPerimeterFigure(List<Figure> obj_list){
        float max = obj_list.get(0).getPerimeter();
        int index = 0;
        int len = obj_list.size();
        for (int i = 1; i < len; i++){
            float current_size = obj_list.get(i).getPerimeter();
            if (current_size > max){
                max = current_size;
                index = i;
            };
        }
        return obj_list.get(index);
    }
}


public class Main
{
	public static void main(String[] args) {
	    
	    Figure circle = new Figure(){
	        float r = 1;

	        @Override
            float getArea(){
                return (float)3.14159265 * r * r; //pi*r^2
            }
            @Override
            float getPerimeter(){
                return (float)6.2831853 * r;    //2*pi*r
            }
	    };
	    
	    Square square = new Square((float)1.5);
	    Rectangle rectangle = new Rectangle(1,2);
	    Triangle triangle = new Triangle((float)2.5);
	    

        
		List<Figure> obj_list = new ArrayList<Figure>();
		
		obj_list.add(circle);
		obj_list.add(square);
		obj_list.add(rectangle);
		obj_list.add(triangle);
		
		Figure biggestArea = FigureController.getBiggestAreaFigure(obj_list);
		Figure biggestPerimeter = FigureController.getBiggestPerimeterFigure(obj_list);
		System.out.println("Biggest Area Figure: " + biggestArea + " Area: " + biggestArea.getArea());
		System.out.println("Biggest Perimeter Figure: " + biggestPerimeter + " Perimeter: " + biggestPerimeter.getPerimeter());

		System.out.println("\nCircle area and perimeter: " + circle.getArea() + " " + circle.getPerimeter());
		
	}
}
