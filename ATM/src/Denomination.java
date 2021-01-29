import java.util.ArrayList;
import java.util.Collections;


public class Denomination {
	ArrayList<Integer> al;

	public Denomination(ArrayList<Integer> al) {
		super();
		this.al = al;
		Collections.sort(al,Collections.reverseOrder());
	}

	public ArrayList<Integer> getAl() {
		return al;
	}

	public void setAl(ArrayList<Integer> al) {
		this.al = al;
	}

	@Override
	public String toString() {
		return "Denomination [al=" + al + "]";
	}
	

}
