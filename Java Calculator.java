public class Main{
	public static void main(String[] args) {
		
		
		double aa = 0;
		
		
		System.out.println("CALCULATION:");
		System.out.println(" ");
		
		System.out.println("Enter digit A, enter, and then enter digit B.");
		double a = Double.parseDouble(System.console().readLine());
		double b = Double.parseDouble(System.console().readLine());
		System.out.println("Thanks.");
		
		System.out.println("Now enter the order of operation.");
		System.out.println("1 = addition [+]");
		System.out.println("2 = subtraction [-]");
		System.out.println("3 = multiplication [*]");
		System.out.println("4 = division [/]");
		int x = Integer.parseInt(System.console().readLine());
		System.out.println("Received.");
		
		if (x == 1){
		    aa = (a+b);
		System.out.println(" ");
		System.out.println(a+" + "+b+" = "+aa);
		}
		
		if (x == 2){
		System.out.println(" ");    aa = (a-b);
		System.out.println(a+" - "+b+" = "+aa);
		}	
		
			if (x == 3){
		    aa = (a*b);
		System.out.println(" ");
		System.out.println(a+" * "+b+" = "+aa);
		}
		
			if (x == 4){
		    aa = (a/b);
		System.out.println(" ");
		System.out.println(a+" / "+b+" = "+aa);
		}
		
		System.out.println(" ");
		System.out.println("Thank you for using Java Calculator. Have a nice day.");
		
		
		
	
	}
}
