package by.htp.homework3.launch;
import by.htp.homework3.domain.ArrayEd;
import by.htp.homework3.domain.InOutData;


public class Main {
	
	public static void main(String[] args) {
		String data=null;
		InOutData inData = new InOutData();
		ArrayEd myArray= new ArrayEd();
		
		System.out.println("������� ����� ����� ��� �������:");
		System.out.println("sortup - ������������� �� �����������");
		System.out.println("sortdown - ������������� �� ��������");
		System.out.println("showmin - ����������� �������");
		System.out.println("showmax - ������������ �������");
		System.out.println("showall - ������� ������ �� �����");
		System.out.println("help - ������ ������");
		while (true){	
			data=inData.inData();	
			switch (inData.testData(data)){
			case 0:{
					switch (data){
					case "help":{
						System.out.println("sortup - ������������� �� �����������");
						System.out.println("sortdown - ������������� �� ��������");
						System.out.println("showmin - ����������� �������");
						System.out.println("showmax - ������������ �������");
						System.out.println("showall - ������� ������ �� �����");
					break;}
										case "sortup":{
						System.out.println("sortup - ������������� �� �����������");
						myArray.sortUp();
						myArray.showAll();
					break;}
					case "sortdown":{
						myArray.sortDown();
						myArray.showAll();
						System.out.println("sortdown - ������������� �� ��������");
					break;}
					case "showmin":{
						System.out.println("����������� ������� : "+myArray.showMin());
					break;}
					case "showmax":{
						System.out.println("������������ ������� : "+myArray.showMax());
					break;}
					case "showall":{
						myArray.showAll();
					break;}
					default:{System.out.println("�� ����� ����������� �������, ��������� ��� ���");
					break;}
					}
			break;}
			case 1:{
				//System.out.println(data+" ����� �����");
				myArray.addElement(Integer.parseInt(data));
				myArray.showAll();
			break;}
			case 2:{
				System.out.println("�� ����� ������� �����, ��������� ��� ���");
			break;}
			}
		}
			
			//System.out.println(inData.testData(inData.inData()));		
				
		
	}

}
