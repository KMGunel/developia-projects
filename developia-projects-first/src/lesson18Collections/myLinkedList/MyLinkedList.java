package lesson18Collections.myLinkedList;

public class MyLinkedList {

	Deyer first;
	
	public void add(Integer element) {
		if(first==null) {
			first=new Deyer();
			first.i=element;
			first.next=new Deyer();
		}
		else {
			Deyer d=first;
			while (d.i != null){
				 d=d.next;
			} 
			d.i=element;
			d.next=new Deyer();
		}	
		
	}
	
	@Override
	public String toString() {
		String s= "";
		Deyer d = first;
		while(d.i != null) {
			s+=d.i + ", ";
			d=d.next;
		}		
		return s;
	}
}
