public class arrayreview{
	public arrayreview(){
		System.out.println("TASK 1:");
		int list[] = new int[40];
		int sum = 0;
		int max = 0;
		int min = 100;

		for(int i = 0; i < 40; i++){
			list[i] = (int)(Math.random()*100)+1;
			sum += i;
			if (list[i] > max) {
				max = list[i];
        	}
        	if (list[i] < min) {
				min = list[i];
        	}
			if(i == 19){
				System.out.println(list[i] + " ");
			}
			else{
			System.out.print(list[i] + " ");
			}
		}
		System.out.println();

		System.out.println("THE SUM: " + sum);
		System.out.println("THE MAX: " + max);
		System.out.println("THE MIN: " + min);


		System.out.println();


		System.out.println("TASK 2:");
		int a[][] = new int [10][10];
		int maximum = 10;
		int minimum = 50;

		int sumRow = 0;
		int sumCol = 0;

		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				a[i][j] = (int)(Math.random()*41)+10;

				if (a[i][j] > maximum) {
					max = a[i][j];
				}
				if (a[i][j] < minimum) {
					min = a[i][j];
        		}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		for(int i = 0; i < 10; i++){
			sumRow = 0;
			sumCol = 0;
		    for(int j = 0; j < 10; j++){
		    	sumRow = sumRow + a[i][j];
		    	sumCol = sumCol + a[j][i];
		    }
		    System.out.println("Sum of row " + (i+1) + ": " + sumRow);
		    System.out.println("Sum of col " + (i+1) + ": " + sumCol);
		}

		System.out.println();

		System.out.println("The min: " + maximum);
		System.out.println("The max: " + minimum);
	}

	public static void main(String[]args){
			arrayreview test = new arrayreview();
	}
}