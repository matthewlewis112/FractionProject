// Sep 100415

public class StubMixedNumber
{
	public static void main(String [] args)
	{
		MixedNumber mn1, mn2, mnSum, mnDifference, mnProduct, mnQuotient;

		mn1 = new MixedNumber(1, 1, 2);
		mn2 = new MixedNumber(1, 1, 2);
		mnSum = new MixedNumber(mn1.add(mn2));
		mnDifference = new MixedNumber(mn1.subtract(mn2));
		mnProduct = new MixedNumber(mn1.multiply(mn2));
		mnQuotient = new MixedNumber(mn1.divide(mn2));
		System.out.println("Stubbing...");
		System.out.println("The first mixed number is " + mn1);
		System.out.println("The second mixed number is " + mn2);

		if(mn1.compareTo(mn2) < 0)
			System.out.println(mn1 + " is less than " + mn2);
		else if(mn1.compareTo(mn2) > 0)
			System.out.println(mn1 + " is greater than " + mn2);
		else
			System.out.println(mn1 + " is equal to " + mn2);

    System.out.println("The sum of the mixed numbers is " + mnSum);
    System.out.println("The difference of the mixed numbers is " + mnDifference);
    System.out.println("The product of the mixed numbers is " + mnProduct);
    System.out.println("The quotient of the mixed numbers is " + mnQuotient);
    System.out.println("...end stub\n");

		mn1 = new MixedNumber(1, 3, 4);
		mn2 = new MixedNumber(2, 3, 8);
		mnSum = new MixedNumber(mn1.add(mn2));
		mnDifference = new MixedNumber(mn1.subtract(mn2));
		mnProduct = new MixedNumber(mn1.multiply(mn2));
		mnQuotient = new MixedNumber(mn1.divide(mn2));
		System.out.println("Stubbing...");
		System.out.println("The first mixed number is " + mn1);
		System.out.println("The second mixed number is " + mn2);

		if(mn1.compareTo(mn2) < 0)
			System.out.println(mn1 + " is less than " + mn2);
		else if(mn1.compareTo(mn2) > 0)
			System.out.println(mn1 + " is greater than " + mn2);
		else
			System.out.println(mn1 + " is equal to " + mn2);

    System.out.println("The sum of the mixed numbers is " + mnSum);
    System.out.println("The difference of the mixed numbers is " + mnDifference);
    System.out.println("The product of the mixed numbers is " + mnProduct);
    System.out.println("The quotient of the mixed numbers is " + mnQuotient);
    System.out.println("...end stub\n");

		mn1 = new MixedNumber(2, 3, 8);
		mn2 = new MixedNumber(1, 3, 4);
		mnSum = new MixedNumber(mn1.add(mn2));
		mnDifference = new MixedNumber(mn1.subtract(mn2));
		mnProduct = new MixedNumber(mn1.multiply(mn2));
		mnQuotient = new MixedNumber(mn1.divide(mn2));
		System.out.println("Stubbing...");
		System.out.println("The first mixed number is " + mn1);
		System.out.println("The second mixed number is " + mn2);

		if(mn1.compareTo(mn2) < 0)
			System.out.println(mn1 + " is less than " + mn2);
		else if(mn1.compareTo(mn2) > 0)
			System.out.println(mn1 + " is greater than " + mn2);
		else
			System.out.println(mn1 + " is equal to " + mn2);

    System.out.println("The sum of the mixed numbers is " + mnSum);
    System.out.println("The difference of the mixed numbers is " + mnDifference);
    System.out.println("The product of the mixed numbers is " + mnProduct);
    System.out.println("The quotient of the mixed numbers is " + mnQuotient);
    System.out.println("...end stub\n");
	}
}
