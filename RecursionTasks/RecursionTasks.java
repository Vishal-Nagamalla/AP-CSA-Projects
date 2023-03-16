class RecursionTasks{
	public static void main(String[] args){
		RecursionTasks run = new RecursionTasks();
	}

	public RecursionTasks(){
		System.out.println("Task 1:");
		System.out.println("THE SUM OF # 1-10 IS: " + t1(10) + "\n");

		System.out.println("Task 2:");
		for(int i = 2; i <= 10; i++){
			System.out.println("THE FACTORIAL OF # 2-10 IS: " + t2(i));
		}
		System.out.println("Task 3:");
		t3check();

		System.out.println("Task 4:");
		t5check();
	}

	int r, t;

	public static int t1(int x){
		if (x <= 1)
			return x;
        return x + t1(x - 1);
	}

	public int t2(int x) {
	    if (x == 1)
	      return 1;
	    int sum = t2(x-1)*x;
	    return sum;
	}

	public boolean t3(int x, int y) {
	    if ((y == 1))
	      return true;
	    if (x % y == 0)
	      return false;

	    return t3(x, y - 1);
	}

	public void t3check(){
	    for (int i = 0; i < 30; i++) {
	      int x = (int)(Math.random() * 99) + 2;
	      if (t3(x, x / 2) == true)
	        System.out.println("The number " + x + " is prime.");
	      else
	        System.out.println("The number " + x + " is not prime.");
	    }
	}

	public int t5(int p, int q) {
	    if (p < q) {
	      t = q;
	      q = p;
	      p = t;
	    }
	    if (p % q == 0)
	      return q;

	    r = p % q;
	    return t5(q, r);
  	}

	public void t5check() {
		for (int i = 0; i < 15; i++) {
	    	int x = (int)(Math.random() * 999) + 2;
	    	int y = (int)(Math.random() * 999) + 2;
	    	System.out.println("THE GCD OF " + x + ", " + y + ": " + t5(x, y));
		}
  	}
}