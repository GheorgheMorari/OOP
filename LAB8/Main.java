//Morari Gheorghe LAB8

import java.util.*;
interface GeometricBody{
    abstract float getSurface();
    abstract float getVolume();
}

class Cube implements GeometricBody{
    float side = 0;
    Cube(float side){
        this.side = side;
    }
    public float getSurface(){
        return side * side * 6;
    }
    public float getVolume(){
        return side* side * side;
    }
}
class Paralelipiped implements GeometricBody{
    float sideA = 0;
    float sideB = 0;
    float sideC = 0;
    Paralelipiped(float sideA, float sideB, float sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public float getSurface(){
        return 2* sideA * sideB + 2 * sideB * sideC + 2 * sideA * sideC;
    }
    public float getVolume(){
        return  sideA * sideB * sideC;
    }
}
class Sphere implements GeometricBody{
    float r = 0;
    Sphere(float r){
        this.r = r;
    }
    public float getSurface(){
        return 4 * (float)3.14159265 * r * r; //4 *pi*r^2
    }
    public float getVolume(){
        return (float)4.1887902 * r * r * r; //4/3 * pi * r^3
    }
}

class GeometricBodyController{
    static GeometricBody getBiggestSurfaceGeometricBody(List<GeometricBody> obj_list){
        float max = obj_list.get(0).getSurface();
        int index = 0;
        int len = obj_list.size();
        for (int i = 1; i < len; i++){
            float current_size = obj_list.get(i).getSurface();
            if (current_size > max){
                max = current_size;
                index = i;
            };
        }
        return obj_list.get(index);
    }
    static GeometricBody getBiggestVolumeGeometricBody(List<GeometricBody> obj_list){
        float max = obj_list.get(0).getVolume();
        int index = 0;
        int len = obj_list.size();
        for (int i = 1; i < len; i++){
            float current_size = obj_list.get(i).getVolume();
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
	    
	    Cube cube = new Cube((float)1.5);
	    Paralelipiped paralelipiped = new Paralelipiped(1,2,3);
	    Sphere sphere = new Sphere((float)1.13);
	    

        
		List<GeometricBody> obj_list = new ArrayList<GeometricBody>();
		
		obj_list.add(cube);
		obj_list.add(paralelipiped);
		obj_list.add(sphere);

		GeometricBody biggestSurface = GeometricBodyController.getBiggestSurfaceGeometricBody(obj_list);
		GeometricBody biggestVolume = GeometricBodyController.getBiggestVolumeGeometricBody(obj_list);
		System.out.println("Biggest Surface GeometricBody: " + biggestSurface + " Surface: " + biggestSurface.getSurface());
		System.out.println("Biggest Volume GeometricBody: " + biggestVolume + " Volume: " + biggestVolume.getVolume());

	}
}

