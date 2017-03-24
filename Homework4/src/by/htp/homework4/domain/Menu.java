package by.htp.homework4.domain;

public class Menu {

	
	 public void menu(){
		 String data=null;
			InOutData inData = new InOutData();
			ArrayEdit myArray= new ArrayEdit();
			Book book =new Book();
			
			System.out.println("sortup - отсортировать по возрастанию");
			System.out.println("sortdown - отсортировать по убыванию");
			System.out.println("add - добавить книу в библиотеку");
			System.out.println("del- удалить книгу из библиотеки");
			System.out.println("showall - вывести массив на экран");
			System.out.println("find- найти книгу в библиотеке");
			while (true){	
				data=inData.inData();	
				switch (inData.testData(data)){
				case 0:{
						switch (data){
						case "help":{
							System.out.println("sortup - отсортировать по возрастанию");
							System.out.println("sortdown - отсортировать по убыванию");
							System.out.println("add - добавить книу в библиотеку");
							System.out.println("del- удалить книгу из библиотеки");
							System.out.println("showall - вывести массив на экран");
							System.out.println("find- найти книгу в библиотеке");
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
						case "add":{
							System.out.println("add - добавить книу в библиотеку");
							System.out.println("Введите название книги");
							book.setTitle(inData.inData());	
							System.out.println("Введите автора книги");
							book.setAuthor(inData.inData());		
							System.out.println("Введите год издания книги");
							book.setYear(Integer.parseInt(inData.inData()));	
							System.out.println("Введите цену книги");
							book.setPrice(Double.parseDouble(inData.inData()));						
							myArray.addElement(book);
												
						break;}
						
						case "showall":{
							myArray.showAll();
						break;}
						case "del":{
							System.out.println("Введите название книги, которую хотите удалить");
							myArray.del(inData.inData());
						break;}
						case "find":{
							System.out.println("Введите автора книги");
							myArray.find(inData.inData());
						break;}
						default:{System.out.println("Вы ввели неизвестную команду, попробуте еще раз");
						break;}
						}
				break;}
				
				case 2:{
					System.out.println("Вы ввели дробное число, попробуте еще раз");
				break;}
				}
			}
		 
		 
		 
		 
		 
	 }
}
