package by.htp.homework3.domain;

public class ArrayEd {
	private int index=0;
	private int size=1;
	private int[] myArray;
	
	
	public void addElement(int element){
		if (index==0){
		myArray = new int[size];
		}
		myArray[index]=element;
		index++;
		if (index>=size){
			size++;
			int[] myArrayCopy = new int[size];
			for (int i=0; i<myArray.length; i++){
				myArrayCopy[i]=myArray[i];
				}
			myArray=myArrayCopy;
		}
	}
	
	public int show (int index){
		return myArray[index];
	}
	
	
	public int size(){
		return this.size;
	}
	
	public int showMax(){
		int max=myArray[0];
		for (int i=1; i<myArray.length;i++){
		if (myArray[i]>max){
			max=myArray[i];
		}
		}
		return max;
	}
	
	public int showMin(){
		int min=myArray[0];
		for (int i=1; i<myArray.length-1;i++){
		if (myArray[i]<min){
			min=myArray[i];
		}
		}
		return min;
	}
	public void sortUp(){
		
		for(int k=1; k<myArray.length-1;k++ ){
			for (int l=k;l>0 && myArray[l]<myArray[l-1];l--){
				myArray[myArray.length-1]=myArray[l];
				myArray[l]=myArray[l-1];
				myArray[l-1]=myArray[myArray.length-1];
				
			}
			
		}
	}
	
	public void sortDown(){
		for(int i=myArray.length-2; i>=0;i-- ){
			for (int j=i;j<myArray.length-2 && myArray[j]<myArray[j+1];j++){
				myArray[myArray.length-1]=myArray[j];
				myArray[j]=myArray[j+1];
				myArray[j+1]=myArray[myArray.length-1];
				
			}
			
		}
	}
	public void showAll(){
		System.out.println("Текущие значения массива:");
		for (int i=0; i<myArray.length-1; i++){
			System.out.print(myArray[i]+" ");
		}
		System.out.println("");
	}
	
}

