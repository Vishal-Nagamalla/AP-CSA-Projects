class Review {
  public static void main(String[] args) {

    //1
    System.out.println("Review Question 1:");

    double avg = 0;
	  double sum = 0;
	  double total = 0;

	  for(int i = 0; i < 1000; i++){
		  if(i%5 == 3){
			  avg++;
			  sum += i;
			  total = sum/avg;
		  }
	  }

	  System.out.println(total);
	  System.out.println("");

    //2
    System.out.println("Review Question 2:");
	  int x = 5;

	  for (int i = 0; i <= x; i++){
		  for (int j = 1; j <= x-i; j++){
			  System.out.print("*");
		  }
		  System.out.println("");
	  }


    //3
    System.out.println("Review Question 3:");
	  for (int i = 4; i >= 1; i--){
		  for (int j = 5; j >= i + 1; j--){
			  System.out.print(j);
		  }
		  if(i%2 == 1){
			  System.out.println("*");
		  }
		  else{
			  System.out.println("");
		  }
	  }

    System.out.println("");


    //4
    System.out.println("Review Question 4:");
    for(int i = 0; i < 15; i++){
      int random = (int)(Math.random()*11) + 10;
      for(int j = 0; j < random; j++){
        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("");


    //5
    System.out.println("Review Question 5:");
	  for (int i = 1; i <= 5; i++){
		  for (int j = 1; j <= i; j++){
			  System.out.print("");
      }
      for (int j = 0; j < i; j++) {
        System.out.print((int) Math.pow(2, j));
        System.out.print(" ");
      }
      for (int j = i - 2; j >= 0; j--) {
        System.out.print((int) Math.pow(2, j));
        System.out.print(" ");
      }
      System.out.println();
	  }
	  System.out.println("");


	  //6
	  System.out.println("Review Question 6:");
	  int a = -1;
	  int b = 0;

	  for(int i = 0; i < 10; i++){
		  if(i % 2 == 0){
			  a++;
		  }
		  else{
			  b++;
		  }
		  for(int c = 0; c < b; c++){
			  System.out.print("*");
		  }

	  System.out.println(b);
	  }
  }
}