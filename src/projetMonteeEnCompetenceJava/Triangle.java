package projetMonteeEnCompetenceJava;
import java.util.ArrayList;

class Triangle extends Shape {
	
	Triangle(ArrayList<Point> points){
		super(points);
	}

	protected double area() {
		return Math.sqrt(halfPerimeter() * ( halfPerimeter() - sideAlength() ) * (halfPerimeter() - sideBlength()) * (halfPerimeter() - sideClength()));
	}
	
	private double halfPerimeter(){
		return this.perimeter()/2;
	}
	
	private double sideAlength(){
		return distance(points.get(0), points.get(1));
	}
	
	private double sideBlength(){
		return distance(points.get(1), points.get(2));
	}
	
	private double sideClength(){
		return distance(points.get(2), points.get(0));
	}

}
