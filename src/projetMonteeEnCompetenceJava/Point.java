package projetMonteeEnCompetenceJava;
import java.util.Scanner;

public class Point {
	
	private double x;
	private double y;
	
	//Point(double x, double y){
	//	this.x = x;
	//this.y = y;
	//}
	
	Point(Scanner scanner) throws EndEnteredByUserException{
		setCoordinatesIfUserEntersValidCoordinates(scanner);
	}
	
	public static enum coordinates{
		xAxis,
		yAxis
	};
	
	private void setCoordinatesIfUserEntersValidCoordinates(Scanner scanner) throws EndEnteredByUserException{
		String xFromUser = getCoordinatesFromUser(coordinates.xAxis, scanner);
		String yFromUser = getCoordinatesFromUser(coordinates.yAxis, scanner);
		if( !xFromUser.equals("END") && !yFromUser.equals("END")){
				this.x = Double.parseDouble(xFromUser);
				this.y = Double.parseDouble(yFromUser);
		}
		else{
			throw new EndEnteredByUserException();
		}
	}
	
	
	private String getCoordinatesFromUser(coordinates coordinate, Scanner scanner){
		printAskingForCoordinate(coordinate);
		
		String valueEnteredByUser = scanner.nextLine();
		
		return valueEnteredByUser;
	}
	
	private void printAskingForCoordinate(coordinates coordinate){
		if(coordinate == coordinate.xAxis){
			System.out.println("Please enter a X axis coordinate or enter END");
		}
		else{
			System.out.println("Please enter a Y axis coordinate or enter END");
		}
	}
	
	//private void setCoordinate(coordinates coordinate, Double value){
	//	if(coordinate == coordinate.xAxis){
		//	this.x = value;
	//	}
		//else{
			//this.y = value;
	//	}
	//}
	
	public double getCoordinate(coordinates coordinate){
		if(coordinate == coordinate.xAxis){
			return x;
		}
		else{
			return y;
		}
	}
	
	
}
