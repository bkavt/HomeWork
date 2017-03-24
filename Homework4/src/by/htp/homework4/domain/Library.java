package by.htp.homework4.domain;

public abstract class Library {
	

	private String  title;
	private String  author;
	private int year;
	private double price;
	
	public Library(){}
	public Library(String title, String author, int year, double price) {
		this.price = price;
		this.title = title;
		this.year=year;
		this.author=author;
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
	
	public void show (){
		//System.out.println("����� �"+j);
		System.out.println("��������:"+this.title);
		System.out.println("�����: "+this.author);
		System.out.println("��� �������:"+this.year);
		System.out.println("�����:"+this.price);	
		System.out.println("");	
		}
	
	
}
