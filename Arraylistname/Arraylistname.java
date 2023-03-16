import java.util.ArrayList;

public class Arraylistname{
	public static void main(String[]args){
			Arraylistname run = new Arraylistname();
	}

	public Arraylistname(){
		//CREATING NAMES
		ArrayList<String> first_name = new ArrayList<String>();
		String first = "Vishal";
		for(int i = 0; i < first.length(); i++){
			first_name.add(first.charAt(i)+"");
		}

		ArrayList<String> last_name = new ArrayList<String>();
		String last = "Nagamalla";
		for(int i = 0; i < last.length(); i++){
			last_name.add(last.charAt(i)+"");
		}

		//CHANGING NAME
		for(int i = first_name.size() - 1; i >= 0; i--){
			if(i % 2 != 0)
				first_name.remove(i);
		}

		for(int i = last_name.size() - 1; i >= 0; i--){
			if(i % 2 != 0)
				last_name.remove(i);
		}

		//PRINTING
		for(int i = 0; i < first_name.size(); i++)
			System.out.print(first_name.get(i)+"");

		System.out.print(" ");

		for(int i = 0; i < last_name.size(); i++)
			System.out.print(last_name.get(i)+"");

		System.out.println();
	}
}