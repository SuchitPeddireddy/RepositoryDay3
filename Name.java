import java.util.ArrayList;

public class Name{

	public static int listToInt(ArrayList<Integer> list){
		int x = 0;

		for(int i = list.size()-1; i >= 0; i--){
			int place = 1;
			for(int j = list.size()-1; j > i; j--){

				place*=10;
			}
			x += (list.get(i)*place);
		}
		return x;
	}

	public static void main(String[]args){

		System.out.println("Bridget");
		System.out.println("Suchit");

		ArrayList<Integer> list1 = new ArrayList<>();

		for(int i = 0; i < 10; i++){
			list1.add(i);
		}

		System.out.println(listToInt(list1));

	}
}