package projetMonteeEnCompetenceJava;

import javax.swing.JOptionPane;

public class programmeFormes {

	public static void main(String[] args) {
		try{
		Shape shape1 = ShapeFactory.createShape();
		
		String[] computableShapeParameters = {"Perimeter","Area"};
		Integer defaultChoiceID = 0;
		JOptionPane jOptionPane = new JOptionPane();
		String parameterToPrint = (String)jOptionPane.showInputDialog(null, 
			      "What would you like to know about this shape ?",
			      "Geometry calculus",
			      JOptionPane.QUESTION_MESSAGE,
			      null,
			      computableShapeParameters,
			      computableShapeParameters[defaultChoiceID]);
		
		if(parameterToPrint.equals(computableShapeParameters[0])){
			shape1.printPerimeter();
		}
		if(parameterToPrint.equals(computableShapeParameters[1])){
			shape1.printArea();
		}
		
		}
		catch(UnhandledNumberOfPointsException exception)
		{
			System.out.println(exception.getMessage());
		}
		
	}

}
