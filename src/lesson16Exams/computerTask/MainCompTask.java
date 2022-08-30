package lesson16Exams.computerTask;

public class MainCompTask {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Ram ram = new Ram(1112233,"DDR4",3200,16);
		Computer macBookAir = new Computer(112233,"Apple","MacBook Air",ram);
		Computer macBookPro = (Computer)macBookAir.clone();
		macBookPro.setModel("MacBook Pro");
		
		System.out.println(macBookAir);
		System.out.println(macBookPro);
		
		macBookPro=null;
		macBookPro=null;
		
		System.gc();

	}

}
