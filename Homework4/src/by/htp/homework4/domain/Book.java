package by.htp.homework4.domain;

public class Book extends Library{
	{
		title=null;
		author=null;
		year=0;
		price=0;
	}	
	
	public Book(){
	}
	public Book(String title, String author, int year, double price){
		super(title, author, year, price);
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
		
	public void show (int i){
		i++;
		System.out.println("����� �" + i);
		System.out.println("��������:"+this.title);
		System.out.println("�����: "+this.author);
		System.out.println("��� �������:"+this.year);
		System.out.println("�����:"+this.price);	
		System.out.println("");	
		}
	
}
