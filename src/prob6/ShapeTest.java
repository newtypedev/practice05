package prob6;

import java.util.ArrayList;
import java.util.List;



public class ShapeTest {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(5,6);
		RectTriangle rectTri = new RectTriangle(6,2);
		
		List<Shape> list = new ArrayList<>();
		list.add(rect);
		list.add(rectTri);
		int i=0;
		Shape s ;
		while(true){
			
			if(i==list.size())
				break;
				
				
			s = list.get(i);
			System.out.println("Area"+s.getArea());
			System.out.println("Perimeter"+s.getPerimeter());
			

			if(s instanceof Resizable){
				Resizable resizable = (Resizable)s;
				resizable.resize(0.5);
				System.out.println("new Area"+s.getArea());
				System.out.println("new Perimeter"+s.getPerimeter());
			}
			i++;
		}
		

		
	}

}
