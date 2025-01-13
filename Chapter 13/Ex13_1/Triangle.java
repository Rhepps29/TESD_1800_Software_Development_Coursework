public class Triangle extends GeometricObject{
	private double s1;
	private double s2;
	private double s3;
	public Triangle(){
	}
	public Triangle(double s1, double s2, double s3){
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public Triangle(double s1, double s2, double s3, String color, boolean filled){
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		setColor(color);
		setFilled(filled);
	}
	public double getSide1(){
		return s1;
	}
	public void setSide1(double s1){
		this.s1 = s1;
	}
	public double getSide2(){
		return s2;
	}
	public void setSide2(double s2){
		this.s2 = s2;
	}
	public double getSide3(){
		return s3;
	}
	public void setSide3(double s3){
		this.s3 = s3;
	}
	public double getPerimeter(){
		return s1+s2+s3;
	}
	public double getArea(){
		double p = this.getPerimeter()*1.0/2;
		return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
	}
}