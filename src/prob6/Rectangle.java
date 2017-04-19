package prob6;

public class Rectangle extends Shape implements Resizable {

	@Override
	public double getArea() {
		
		return super.getHeight() * super.getWidth();
	}

	@Override
	public double getPerimeter() {
		return (super.getHeight() + super.getWidth())*2;
	}
	
	public Rectangle(double w,double h){
		super.setWidth(w);
		super.setHeight(h);
	}

	@Override
	public void resize(double s) {
		super.setWidth(super.getWidth()*s);
		super.setHeight(super.getHeight()*s);
		
	}

}
