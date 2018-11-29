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

	public static ArrayList split(int num){
		ArrayList <Integer> splitList = new ArrayList<>();
		int hi = num;
		do{
			hi = num % 10;
			num /= 10;
			splitList.add(hi);

		}
		while(num > 0);

		ArrayList <Integer> list2 = new ArrayList <>();
		for(int a = splitList.size() - 1; a >= 0; a--){
			list2.add(splitList.remove(a));
		}
		return list2;
	} //split

	public static void main(String[]args){

		System.out.println("Bridget");
		System.out.println("Suchit");

		ArrayList<Integer> list1 = new ArrayList<>();

		for(int i = 0; i < 10; i++){
			list1.add(i);
		}

		System.out.println(listToInt(list1));

	System.out.println(split(12345));
	}

}