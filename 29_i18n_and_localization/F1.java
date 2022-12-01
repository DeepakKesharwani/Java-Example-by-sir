import java.util.*;
import java.text.*;

class F1 {
	public static void main(String[] args) {
		Date dt = new Date();

		DateFormat[] dfs = new DateFormat[6];

		dfs[0] = DateFormat.getInstance();
		dfs[1] = DateFormat.getDateInstance();
		dfs[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfs[3] = DateFormat.getDateInstance(DateFormat.LONG);
		dfs[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfs[5] = DateFormat.getDateInstance(DateFormat.FULL);
		for(DateFormat df : dfs)
			System.out.println(df.format(dt));
	}
}
