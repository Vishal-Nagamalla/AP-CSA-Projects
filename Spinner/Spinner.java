class Spinner{
	public static void main(String[] args){
		Spinner run = new Spinner();
	}

	public Spinner(){
		int random = spin();
		int lowest;
		boolean evenorodd;

		System.out.println("2 section spin number is....");
		int s1 = spin(2);
		System.out.println(s1);

		System.out.println();

		if(evenorodd(s1) == true){
			System.out.println("5 spin numbers: ");
			int s5_1 = spin();
			System.out.print(spin() + " ");
			int s5_2 = spin();
			System.out.print(spin() + " ");

			System.out.println();

			System.out.println("4 spin number: ");
			int s4 = spin(4);
			System.out.print(spin(4));

			System.out.println();

			int bignum = 0;

			if(lowest(s5_1, s5_2) == s5_1)
				bignum = s5_2;

			else
				bignum = s5_1;

			int product = product(lowest(s5_1, s5_2), s4);

			if (check(product,(int)Math.pow(bignum, 2)) == true)
				winorlose(true);

			else
		   		winorlose(false);

		}

		else{
			System.out.println("5 spin numbers: ");
			int s5_1 = spin();
			System.out.print(spin() + " ");

			int s5_2 = spin();
			System.out.print(spin() + " ");

			int s5_3 = spin();
			System.out.print(spin() + " ");

			System.out.println();

			System.out.println("10 spin number: ");
			int s10 = spin(10);
			System.out.print(spin(10));

			System.out.println();

			int notlowest = (s5_1 * s5_2 * s5_3)/lowest(s5_1, s5_2, s5_3);
			int lowx10 = lowest(s5_1, s5_2, s5_3) * s10;

			if(notlowest >= lowx10)
				winorlose(true);

			else
				winorlose(false);
		}
	}

	public int spin(){
		return (int)(Math.random()*5) + 1;
	}

	public int spin(int d){
		return (int)(Math.random()*d) + 1;
	}

	public int product(int x, int y){
		return (x * y);
	}

	public boolean evenorodd(int z){
		if(z % 2 == 0)
			return true;

		return false;
	}

	public int lowest(int a, int b){
		if(a < b)
			return a;

		else
			return b;
	}

	public int lowest(int a, int b, int c){
		if(a<b){
			if(c<a)
				return c;

			else
				return a;
		}

		else{
			if(b<c)
				return b;

			else
				return c;
		}
	}

	public boolean check(int a, int b) {
	  if (a > b)
	    return true;

	  else
	  	return false;
	}

	public void winorlose(boolean winorlose) {
	  if (winorlose == true)
	    System.out.println("You win!");

	  else if (winorlose == false)
	    System.out.println("You lose!");
	}
}