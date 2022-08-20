package w3resourceTask.javaBasicPart1;

public class Test8 {

	public static void main(String[] args) {
		for(int i = 1; i<=25;i++) {
			if(i==4) {
				System.out.print("J");
			}
			else if(i==9 || i==22) {
				System.out.print("a");
			}
			else if(i==12|| i==18) {
				System.out.print("v");
			}
			else {
				System.out.print(" ");
			}			
		}
		
		System.out.println();		
		for(int i = 1; i<=25;i++) {
			if(i==4) {
				System.out.print("J");
			}
			else if(i==8 || i==10 || i==21 || i==23) {
				System.out.print("a");
			}
			else if(i==13|| i==17) {
				System.out.print("v");
			}
			else {
				System.out.print(" ");
			}			
		}
		
		System.out.println();
		for(int i = 1; i<=25;i++) {
			if(i==4 || i==1) {
				System.out.print("J");
			}
			else if(i==7 || i==8 || i==9 || i==10 || i==11 || i==20 || i==21 || i==22 || i==23 || i==24) {
				System.out.print("a");
			}
			else if(i==14|| i==16) {
				System.out.print("V");
			}
			else {
				System.out.print(" ");
			}			
		}
		
		System.out.println();
		for(int i = 1; i<=25;i++) {
			if(i==2 || i==3) {
				System.out.print("J");
			}
			else if(i==6 || i==12 || i==19 || i==25) {
				System.out.print("a");
			}
			else if(i==15) {
				System.out.print("V");
			}
			else {
				System.out.print(" ");
			}			
		}	

	}
}
