package Programs;

public class MyInteger {
	private long i;// Size is 64 bit
	StringBuilder sb = null;// Size is 32 bit as it is a reference and also
							// incase there was an object created using new
							// operator in that case also the class MyInterger's
							// object size would be 32(reference size)+ 64(long
							// size) only

	MyInteger(long x) {
		i = x;
		sb = new StringBuilder();
	}

	public long getValue() {
		return i;
	}

	public void increament() {
		i++;

	}

}
