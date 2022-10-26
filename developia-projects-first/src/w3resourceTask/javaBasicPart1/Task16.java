package w3resourceTask.javaBasicPart1;

public class Task16 {

	public static void main(String[] args) {
		for ( int i=1; i<=5;i++) {
			for ( int j=1; j<=9;j++) {
				if(i==1) {
					if ( j==2 || j==8) {
					System.out.print("+");}
					else if(j>2 && j<8) {
						System.out.print("\"");
					}
					else {
						System.out.print(" ");
					}					
				}
				
				else if (i==5) {
					if ( j==2 || j==8) {
					System.out.print("+");}
					else if(j>2 && j<8) {
						System.out.print("-");
					}
					else {
						System.out.print(" ");
					}
					
				}
				else if(i==2) {
					if ( j==1 ) {
					System.out.print("[");
					}
					else if ( j==9 ) {
					System.out.print("]");
					}
					else if ( j==4 || j==6 ) {
					System.out.print("o");
					}	
					else if ( j==2 || j==8) {
						System.out.print("|");}
					else {
						System.out.print(" ");
					}
				}
				else if (i==3) {
					if(j==5) {
						System.out.print("^");
					}
					else if ( j==2 || j==8) {
						System.out.print("|");}
					else {
						System.out.print(" ");
					}
				}
				else if(i==4) {
					if ( j==4 || j==6 ) {
					System.out.print("'");
					}
					else if ( j==5 ) {
					System.out.print("-");
					}
					else if ( j==2 || j==8) {
						System.out.print("|");}
					else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}		

	}
}
