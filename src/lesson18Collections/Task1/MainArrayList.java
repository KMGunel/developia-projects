package lesson18Collections.Task1;

public class MainArrayList {

	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList<String>(3,2);
			
		
		list.addElement("black");
		list.addElement("orange");
		list.addElement("red");
		list.addElement("purple");
		
		System.out.println(list.size());
		System.out.println(list);
		try {
			list.delete(8);
		} catch (MassivinElementiIstisna e) {
			System.out.println(e.getMessage());
		}
		
		list.delete(3);
		System.out.println(list.size());		
		System.out.println(list);
		
		System.out.println(list.contain("red"));
		System.out.println(list.contain("white"));
		
		System.out.println(list.isEmpty());
		
		list.delete(0);
		list.delete(1);
		list.delete(0);
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
	}

	

}
