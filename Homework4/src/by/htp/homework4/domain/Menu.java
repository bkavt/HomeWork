package by.htp.homework4.domain;

public class Menu {

	
	 public void menu(){
		 String data=null;
			InOutData inData = new InOutData();
			ArrayEdit myArray= new ArrayEdit();
			Book book =new Book();
			
			System.out.println("sortup - ������������� �� �����������");
			System.out.println("sortdown - ������������� �� ��������");
			System.out.println("add - �������� ���� � ����������");
			System.out.println("del- ������� ����� �� ����������");
			System.out.println("showall - ������� ������ �� �����");
			System.out.println("find- ����� ����� � ����������");
			while (true){	
				data=inData.inData();	
				switch (inData.testData(data)){
				case 0:{
						switch (data){
						case "help":{
							System.out.println("sortup - ������������� �� �����������");
							System.out.println("sortdown - ������������� �� ��������");
							System.out.println("add - �������� ���� � ����������");
							System.out.println("del- ������� ����� �� ����������");
							System.out.println("showall - ������� ������ �� �����");
							System.out.println("find- ����� ����� � ����������");
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
						case "add":{
							System.out.println("add - �������� ���� � ����������");
							System.out.println("������� �������� �����");
							book.setTitle(inData.inData());	
							System.out.println("������� ������ �����");
							book.setAuthor(inData.inData());		
							System.out.println("������� ��� ������� �����");
							book.setYear(Integer.parseInt(inData.inData()));	
							System.out.println("������� ���� �����");
							book.setPrice(Double.parseDouble(inData.inData()));						
							myArray.addElement(book);
												
						break;}
						
						case "showall":{
							myArray.showAll();
						break;}
						case "del":{
							System.out.println("������� �������� �����, ������� ������ �������");
							myArray.del(inData.inData());
						break;}
						case "find":{
							System.out.println("������� ������ �����");
							myArray.find(inData.inData());
						break;}
						default:{System.out.println("�� ����� ����������� �������, ��������� ��� ���");
						break;}
						}
				break;}
				
				case 2:{
					System.out.println("�� ����� ������� �����, ��������� ��� ���");
				break;}
				}
			}
		 
		 
		 
		 
		 
	 }
}
