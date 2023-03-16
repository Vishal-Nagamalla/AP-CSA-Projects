class MathCommands_Methods{
	public static void main(String[] args){
		MathCommands_Methods run = new MathCommands_Methods();
	}

	public MathCommands_Methods(){
		task1();
		task2();
		task3();
		task4();
		task5();
	}

	public void task1(){
		System.out.println("Task 1:");

		int rnd = (int)(Math.random()*8)+56;
		System.out.println(rnd + "\n");
	}

	public void task2(){
		System.out.println("Task 2:");

		int rnd = (int)(Math.random()*963)+45;
		int rndsquared = (int)(Math.pow(rnd, 2));
		System.out.println(rndsquared + "\n");
	}

	public void task3(){
		System.out.println("Task 3:");

		double rnd = (Math.random()*119)+632;
		double rndsquareroot = Math.sqrt(rnd);
		System.out.println(rndsquareroot + "\n");
	}

	public void task4(){
		System.out.println("Task 4:");

		int arr[] = new int[10];
		int sum = 0;

		for(int i = 0; i < 10; i++){
			int rnd = (int)(Math.random()*68)+6;
			arr[i] = rnd;
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		double avg = ((double)sum)/10;
		System.out.println("THE AVERAGE IS: " + avg + "\n");
	}

	public void task5(){
		System.out.println("Task 5:");

		int smallval = 103;

		for(int i = 0; i < 20; i++){
			int rnd = (int)(Math.random()*19)+85;
			System.out.print(rnd + " ");

			if(rnd < smallval){
				smallval = rnd;
			}
		}
		System.out.println();


		System.out.println("THE SMALLEST VALUE IS: " + smallval + "\n");
	}
}