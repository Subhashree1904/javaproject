package twentyfour;

public class Helper {
	public static String[] arraycon(String[] a) {
		return a;
	}
	public static String[] arraynew(String [] m) {
		return m;
	}
	public static String[] arraystwo (String[] a, String[] b){
		int length = a.length + b.length;
		String[] result = new String[length];
		int i = 0;
		for (String post : a) {
			result[i] = post;
			i++;
		}
		for (String post : b) {
			result[i] = post;
			i++;
		}
		return result;
		
	}
}

