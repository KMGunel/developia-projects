package lesson19.task1;

import java.util.Comparator;

public class ModelComparator implements Comparator<Computer>{

	@Override
	public int compare(Computer o1, Computer o2) {
		return o1.model.compareTo(o2.model);
	}

}
