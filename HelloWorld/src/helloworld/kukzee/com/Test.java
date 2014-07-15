package helloworld.kukzee.com;

public class Test {
	enum Suit { SPADE, DIAMOND, CLUB, HEART };
	public static void main(String[] args) {
		
		
		Suit A;
		A = Suit.valueOf("club");
		System.out.println(A+"A");
	}
}