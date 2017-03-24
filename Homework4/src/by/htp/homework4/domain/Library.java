package by.htp.homework4.domain;

public class Library implements ArrayEdit {
	

	public String  title;
	public String  author;
	public int year;
	public double price;
	
	public Library(){}
	public Library(String title, String author, int year, double price) {
		super();
		this.price = price;
		this.title = title;
		this.year=year;
		this.author=author;
	}
	
	private  int index=0;
	private  int size=1;
	private Book[] myLibrary;
	
	
	
	public void addElement(Book book){
		if (index==0){
		myLibrary = new Book[size];
		}
		myLibrary[index]=book;
		index++;
		if (index>=size){
			size++;
			Book[] myArrayCopy = new Book[size];
			for (int i=0; i<myLibrary.length; i++){
				myArrayCopy[i]=myLibrary[i];
				}
			myLibrary=myArrayCopy;
			}
	}
	
			
	public void sortUp(){
		
		for(int k=1; k<myLibrary.length-1;k++ ){
			for (int l=k;l>0 && myLibrary[l].getYear()<myLibrary[l-1].getYear();l--){
				myLibrary[myLibrary.length-1]=myLibrary[l];
				myLibrary[l]=myLibrary[l-1];
				myLibrary[l-1]=myLibrary[myLibrary.length-1];
				
			}
			
		}
	}
	
	public void sortDown(){
		for(int i=myLibrary.length-2; i>=0;i-- ){
			for (int j=i;j<myLibrary.length-2 && myLibrary[j].getYear()<myLibrary[j+1].getYear();j++){
				myLibrary[myLibrary.length-1]=myLibrary[j];
				myLibrary[j]=myLibrary[j+1];
				myLibrary[j+1]=myLibrary[myLibrary.length-1];
				
			}
			
		}
	}
	
	public void showAll(){
		System.out.println("Текущие значения массива:");
		for (int i=0; i<myLibrary.length-1; i++){
			myLibrary[i].show(i);
			}
		if (myLibrary.length==1){
		System.out.println("Библиотека пуста");
		}
		
	}
	public void  find(String str){
		int index=0;
		for (int i=0; i<myLibrary.length-1; i++){
			if (str.contains(myLibrary[i].getAuthor())){
			myLibrary[i].show(i);
			index++;
			}
		}
		if (index==0){
		System.out.println("Автор: "+str+" - не найден");
		}
	}
	
	public void del(String str){
		int flag=0;
		for (int i=0; i<myLibrary.length-2; i++){
			 if (str.contains(myLibrary[i].getTitle())){
				 for (int j=i; j<myLibrary.length-2; j++){
					 myLibrary[j]=myLibrary[j+1]; 
				 }
				 flag++;
			 }
		}
		if (flag>=1){
		Book[] myArrayCopy = new Book[myLibrary.length-flag];
				for (int i=0; i<myLibrary.length-flag; i++){
					myArrayCopy[i]=myLibrary[i];
					}
				myLibrary=myArrayCopy;
				index-=flag;
				size-=flag;
		System.out.println("Удалено "+flag+ " книг");		
		}
		else{
			System.out.println("Книга с названием " + str+" - не найдена");
			}
		
	}
	
	
	
	
}
