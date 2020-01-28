package calculater;

import java.util.ArrayList;
import java.util.List;

public class AdditionV {
	public AdditionV() {
		// TODO Auto-generated constructor stub
	}
	public static int validateS(String input_String) throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		if (input_String == (null) || input_String == "") {
			return 0;
		} else {
			String[] numberString = input_String.split("[\\s\r\n,|.;]");
			int a = 0;
			for (String s : numberString) {
				if (s.equals(""))
					continue;
				a = Integer.parseInt(s);
				if (a < 0) {
					list.add(a);
				}
			}
			if (list.isEmpty()) {
				return 1;
			} else {
				throw new Exception("negative value not allow" + list);
			}
		}
	}
	public static int addV(String input_String) throws Exception {
		String[] numberString = input_String.split("[\\s\r\n,|.;]");
		int sum = 0, a = 0;
		for (String s : numberString) {
			System.out.println(s);
			a = Integer.parseInt(s);
			sum = sum + a;
		}
		return sum;
	}
	public static void main(String[] args) {

	}
}


