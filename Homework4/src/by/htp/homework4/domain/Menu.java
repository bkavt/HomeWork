package by.htp.homework4.domain;

public class Menu {

	
	 public void menu(){
		 String data=null;
			InOutData inData = new InOutData();
			Library myLibrary= new Library();
			
			
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
							myLibrary.sortUp();
							myLibrary.showAll();
						break;}
						case "sortdown":{
							myLibrary.sortDown();
							myLibrary.showAll();
							System.out.println("sortdown - ������������� �� ��������");
						break;}
						case "add":{
							Book book =new Book();
							System.out.println("add - �������� ���� � ����������");
							System.out.println("������� �������� �����");
							book.setTitle(inData.inData());	
							System.out.println("������� ������ �����");
							book.setAuthor(inData.inData());		
							System.out.println("������� ��� ������� �����");
							book.setYear(Integer.parseInt(inData.inData()));	
							System.out.println("������� ���� �����");
							book.setPrice(Double.parseDouble(inData.inData()));						
							myLibrary.addElement(book);
												
						break;}
						
						case "showall":{
							myLibrary.showAll();
						break;}
						case "del":{
							System.out.println("������� �������� �����, ������� ������ �������");
							myLibrary.del(inData.inData());
						break;}
						case "find":{
							System.out.println("������� ������ �����");
							myLibrary.find(inData.inData());
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
