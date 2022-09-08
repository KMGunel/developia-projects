package lesson18Collections.Task1;

public class MyArrayList<T> {

Object[] myArray;
int index=0;
int grow;

public MyArrayList(int primeSize,int grow) {
	myArray = new Object[primeSize];
	this.grow=grow;
}

public void addElement(T element) {
	myArray[index++]=element;
	if(index==myArray.length) {
		growUp();
	}
}
public void growUp() {
	System.out.println("I'm growing");
	Object[] newArr= new Object[myArray.length+grow];
	int i=0;
	for(Object m:myArray) {
		newArr[i++] =m;
	}
	myArray=newArr;	
}

public int size() {
	return index;
}

public void delete(int index) {
	if(index>=this.index || index<0) {
		throw new MassivinElementiIstisna("Wrong index!");
	}
	
	for (int i = index; i < myArray.length-1; i++) {
		myArray[i]=myArray[i+1];
	}
	this.index--;
}

public Boolean contain(T element) {
	for (Object o : myArray) {
		if(element.equals(o)) {
			return true;
		}
		
	}return false;	
}

public Boolean isEmpty() {
	if(index==0) {
		return true;
	}
	return false;
}


@Override
	public String toString() {
	String s = "";
	for (int i = 0; i < index; i++) {
		
		if(i==index-1) {
			s+=myArray[i];
			break;
		}
	
			s+=myArray[i] + ", ";
		
	}
		return "[" + s + "]";
	}
}
