class ArrayPractice{
	public static void main(String[] args){
		ArrayPractice run = new ArrayPractice();
	}

	public ArrayPractice(){
		System.out.println("Task 1:");
		rndnumab(2); //1
		rndnumab(4); //2
		rndnumc(6); //3
		rndnumd(6); //4

		System.out.println("Task 3:");
		task3();
	}

	public void rndnumab(int dimension){
		int list[][] = new int [dimension][dimension];
		for(int i = 0; i < list.length; i++){
			for(int j = 0; j < list.length; j++){
				list[i][j] = (int)(Math.random()*2)+1;
				System.out.print(list[i][j]);
			}

			System.out.println();
		}

		System.out.println();
	}

	public void rndnumc(int dimension){
		int x[][] = new int [dimension][dimension];
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x.length; j++){
				x[i][j] = (int)(Math.random()*18)+1;
				System.out.print(x[i][j]);
			}

			System.out.println();
		}

		System.out.println();
	}

	public void rndnumd(int dimension){
		int y[][] = new int [dimension][dimension];
		for(int i = 0; i < y.length; i++){
			for(int j = 0; j < y.length; j++){
				y[i][j] = (int)(Math.random()*9)+1;
				System.out.print(y[i][j]);
			}

			System.out.println();
		}

		System.out.println();
	}

	public void task3(){
		int z[] = new int[30];
		for(int i = 0; i < z.length; i++){
			z[i] = (int)(Math.random()*50)+1;
			System.out.print(z[i] + " ");
		}
		System.out.println();

		for(int i = z.length; i > 0; i--){
			System.out.print(z[i] + " ");
		}
	}
}