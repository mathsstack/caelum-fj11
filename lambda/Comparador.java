import java.util.*;

public class Comparador implements Comparator<String> {

	public int compare(String s1, String s2){

		return Integer.compare(s1.length(), s2.length());

	}
}
