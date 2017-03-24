package by.htp.homework4.domain;

public class ArrayEdit {
	private int index=0;
	private int size=1;
	private Book[] myArray;
	
	
	
	public void addElement(Book book){
		if (index==0){
		myArray = new Book[size];
		}
		myArray[index]=book;
		index++;
		if (index>=size){
			size++;
			Book[] myArrayCopy = new Book[size];
			for (int i=0; i<myArray.length; i++){
				myArrayCopy[i]=myArray[i];
				}
			myArray=myArrayCopy;
			}
	}
	
	
	
	
	public int size(){
		return this.size;
	}
	
	public void sortUp(){
		
		for(int k=1; k<myArray.length-1;k++ ){
			for (int l=k;l>0 && myArray[l].getYear()<myArray[l-1].getYear();l--){
				myArray[myArray.length-1]=myArray[l];
				myArray[l]=myArray[l-1];
				myArray[l-1]=myArray[myArray.length-1];
				
			}
			
		}
	}
	
	public void sortDown(){
		for(int i=myArray.length-2; i>=0;i-- ){
			for (int j=i;j<myArray.length-2 && myArray[j].getYear()<myArray[j+1].getYear();j++){
				myArray[myArray.length-1]=myArray[j];
				myArray[j]=myArray[j+1];
				myArray[j+1]=myArray[myArray.length-1];
				
			}
			
		}
	}
	
	public void showAll(){
		System.out.println("Текущие значения массива:");
		for (int i=0; i<myArray.length-1; i++){
			int j=index+1;
			System.out.println("Книга №"+j);
			myArray[i].show();
		}
		
	}
	public int  find(String str){
		int index=0;
		for (int i=0; i<myArray.length-1; i++){
			if (myArray[i].getAuthor()==str){
			myArray[i].show();
			index=1;
			}
		}
		return index;
		
	}
	public void del(String str){
		int flag=0;
		for (int i=0; i<myArray.length-1; i++)
		 if (myArray[i].getTitle()==str){
			 for (int j=0; j<myArray.length-2; j++){
				 myArray[j]=myArray[j+1]; 
			 }
			 flag++;
		 }
		Book[] myArrayCopy = new Book[myArray.length-flag];
				for (int i=0; i<myArray.length-flag; i++){
					myArrayCopy[i]=myArray[i];
					}
				myArray=myArrayCopy;
	}
	
}
