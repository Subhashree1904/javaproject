package twentyfour;
import twentyfour.Helper;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		String [] c = {"abc","vcd","fgv","jhg","nkj","mnm"};
		String [] n = {"ses","gfd","kjh","kjk","lil","des"};
		String[] resultofarraycon = Helper.arraycon(c);
		String[] resultofarraynew = Helper.arraynew(n);
		String[] resultconcat = Helper.arraystwo(resultofarraycon, resultofarraynew);
		System.out.println(Arrays.toString(resultconcat));
	}
}
