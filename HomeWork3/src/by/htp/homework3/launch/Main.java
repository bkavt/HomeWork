package by.htp.homework3.launch;
import by.htp.homework3.domain.ArrayEd;
import by.htp.homework3.domain.InOutData;


public class Main {
	
	public static void main(String[] args) {
		String data=null;
		InOutData inData = new InOutData();
		ArrayEd myArray= new ArrayEd();
		
		System.out.println("Введите целое число или команду:");
		System.out.println("sortup - отсортировать по возрастанию");
		System.out.println("sortdown - отсортировать по убыванию");
		System.out.println("showmin - минимальный элемент");
		System.out.println("showmax - максимальный элемент");
		System.out.println("showall - вывести массив на экран");
		System.out.println("help - список команд");
		while (true){	
			data=inData.inData();	
			switch (inData.testData(data)){
			case 0:{
					switch (data){
					case "help":{
						System.out.println("sortup - отсортировать по возрастанию");
						System.out.println("sortdown - отсортировать по убыванию");
						System.out.println("showmin - минимальный элемент");
						System.out.println("showmax - максимальный элемент");
						System.out.println("showall - вывести массив на экран");
					break;}
										case "sortup":{
						System.out.println("sortup - отсортировать по возрастанию");
						myArray.sortUp();
						myArray.showAll();
					break;}
					case "sortdown":{
						myArray.sortDown();
						myArray.showAll();
						System.out.println("sortdown - отсортировать по убыванию");
					break;}
					case "showmin":{
						System.out.println("Минимальный элемент : "+myArray.showMin());
					break;}
					case "showmax":{
						System.out.println("Максимальный элемент : "+myArray.showMax());
					break;}
					case "showall":{
						myArray.showAll();
					break;}
					default:{System.out.println("Вы ввели неизвестную команду, попробуте еще раз");
					break;}
					}
			break;}
			case 1:{
				//System.out.println(data+" целое число");
				myArray.addElement(Integer.parseInt(data));
				myArray.showAll();
			break;}
			case 2:{
				System.out.println("Вы ввели дробное число, попробуте еще раз");
			break;}
			}
		}
			
			//System.out.println(inData.testData(inData.inData()));		
				
		
	}

}
