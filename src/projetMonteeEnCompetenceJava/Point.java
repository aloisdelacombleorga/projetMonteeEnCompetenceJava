package projetMonteeEnCompetenceJava;
import java.util.Scanner;

public class Point {
	
	public double x;
	public double y;
	
	Point(){
		userSetsCoordinates(coordinates.xAxis);
		userSetsCoordinates(coordinates.yAxis);
	}
	
	private enum coordinates{
		xAxis,
		yAxis
	};
	
	private void userSetsCoordinates(coordinates coordinate){
		printAskingForCoordinate(coordinate);
		Scanner scanner = new Scanner(System.in);
		Double coordinateValue = Double.parseDouble(scanner.nextLine());
		setCoordinate(coordinate, coordinateValue);
	}
	
	private void printAskingForCoordinate(coordinates coordinate){
		if(coordinate == coordinate.xAxis){
			System.out.println("Please enter a X axis coordinate");
		}
		else{
			System.out.println("Please enter a Y axis coordinate");
		}
	}
	
	private void setCoordinate(coordinates coordinate, Double value){
		if(coordinate == coordinate.xAxis){
			this.x = value;
		}
		else{
			this.y = value;
		}
	}
	
	
}
