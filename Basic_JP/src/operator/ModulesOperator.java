//- laila has 1000 rupees she want to distribute a books worth rupees 20 among 25 kids
//Q- wajp to find the number books each kids will get.
package operator;

public class ModulesOperator {

	public static void main(String[] args) {
		int amount=1000;
		int price=20;
		int kids=20;
		int books=amount/price;
		int eachkids=books/kids;
		System.out.println("the Amount Laila has: "+amount);
		System.out.println("the Price of each books: "+price);
		System.out.println("the number of kids: "+kids);
		System.out.println("the number of books purchased: "+kids);
		System.out.println("the number of books each kids get: "+eachkids);
		
		
	}

}
