package prob6;

public class RectTriangle extends Shape {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return super.getWidth()*super.getHeight()*1/2;
	}

	@Override
	public double getPerimeter() {
		
		return super.getWidth()+super.getHeight()+Math.sqrt(super.getWidth()*super.getWidth()+super.getHeight()*super.getHeight());
	}
	public RectTriangle(double w,double h){
		super.setWidth(w);
		super.setHeight(h);
	}


}
