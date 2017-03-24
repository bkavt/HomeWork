package by.htp.homework3.domain;
import java.util.Scanner;

public class InOutData {
		
	public int testData(String inData){			//ќпределение типа введеных данных, возвращает: 1-integer, 2-double, 0-string;
		if(inData.matches("\\d+")||inData.matches("\\-\\d+")){
		/*System.out.println("It is integer");
		int number = Integer.valueOf(inData);*/
		return 1;
		}
		else if(inData.matches("\\d+\\.\\d+")||inData.matches("\\-\\d+\\.\\d+")){
		/*System.out.println("It is double");
		double number = Double.valueOf(inData);*/
		return 2;
		}
		else{
		//System.out.println("It is string");
		return 0;}
	}
	
	public String inData(){						//¬вод данных с клавиатуры
		Scanner scanner = new Scanner(System.in);
		String inData=null;
		inData=scanner.next();
		return inData;	
	} 
	
	
	
	
	
	
	
	
	
}
