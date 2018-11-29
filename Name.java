import java.util.ArrayList;

public class Name{
	public static void main(String[]args){

	System.out.println("Bridget");
	System.out.println("Suchit");

	System.out.println(split(12345));
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
}