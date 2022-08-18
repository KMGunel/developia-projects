package lesson13.enumEx;

public enum ESize {
XS(38),
S(39),
M(40),
L(42),
XL(44),
XXL(46);
	
private final int numSize;

private ESize(int numSize) {
	this.numSize = numSize;
}

public int getNumSize() {
	return numSize;
}
	
}
