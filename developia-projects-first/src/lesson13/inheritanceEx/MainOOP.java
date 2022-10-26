package lesson13.inheritanceEx;

public class MainOOP {
	public static void main(String[] args) {
	
		BMW myBMW1 = new BMW();
		myBMW1.color="black";
		myBMW1.model="Alpina";
		myBMW1.maxSpeed=290;
		myBMW1.weigth=2655;
		
		System.out.println(myBMW1.color);
		System.out.println(myBMW1.model);
		System.out.println(myBMW1.weigth);
		System.out.println(myBMW1.maxSpeed);
		
		BMW myBMW2 = new BMW(250,"blue","X7",2500);
		
		System.out.println(myBMW2.color);
		System.out.println(myBMW2.model);
		System.out.println(myBMW2.weigth);
		System.out.println(myBMW2.maxSpeed);
		
		Nissan myNissan = new Nissan();
		myNissan.color="black";
		myNissan.model="Juke";
		myNissan.maxSpeed=257;
		myNissan.weigth=1806;
		
		System.out.println(myNissan.weigth);
		
		Infinity myInfinity = new Infinity();
		myInfinity.color="red";
		myInfinity.model="Q50S";
		myInfinity.maxSpeed=250;
		myInfinity.weigth=1830;
		
		System.out.println(myInfinity.model);
		
		Mercedes myMercedes = new Mercedes();
		myMercedes.color="white";
		myMercedes.model="BenzG63";
		myMercedes.maxSpeed=190;
		myMercedes.weigth=3675;
		
		System.out.println(myMercedes.model);
		System.out.println(myMercedes.maxSpeed);
		System.out.println(myMercedes.weigth);
	}
}
