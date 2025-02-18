package MODULE1;

public class Cars {
	public static void main(String[]args) {
		PRODUCT p1=new PRODUCT();
			p1.pcode="CAR123";
			p1.pname="benz";
			p1.price=10000;
			System.out.println("diplaying p1:");
			p1.display();
			PRODUCT p2=new PRODUCT("JAGUAR","CAR426",25000);
			System.out.println("displaying p2:");
			p2.display();
			PRODUCT p3=new PRODUCT("MARUTHI","CAR800",50000);
			System.out.println("displaying p3:");
			p3.display();
			PRODUCT P=p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
			System.out.println("\n displaying product with lowest price:");
			P.display();
			}
	}
			
	
			
	


