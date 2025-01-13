public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	private double side;
	public Octagon(){}
	public Octagon(double side){
		this.side = side;
	}
	public Octagon(double side, String color, boolean filled){
		this.side = side;
		setColor(color);
		setFilled(filled);
	}
	public double getSide(){
		return side;
	}
	public void setSide(double side){
		this.side = side;
	}
	public double getPerimeter(){
		return side*8;
	}
	public double getArea(){
		return (2+(4.0/Math.sqrt(2)))*side*side;
	}
	@Override
	public int compareTo(Octagon o){
		if (getArea() > o.getArea()){
			return 1;
		}else if (getArea() < o.getArea()){
			return -1;
		}else{
			return 0;
		}
	}
	@Override
	public Object clone(){
		try{
			return super.clone();
		}
		catch (CloneNotSupportedException ex){
			return null;
		}
	}
}