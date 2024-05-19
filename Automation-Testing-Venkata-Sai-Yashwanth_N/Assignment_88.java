package Assignment;
public class Assignment_88 {
	public static void main(String[] args) {
	byte b = 74;
	short s = (short)b;
	int n = (int)s;
	long l = (long)n;
	float f = (float)l;
	double d = (double)f;
	System.out.println(d);
	double d1 = (double)d;
	float f1 = (float)d1;
	long l1 = (long)f1;
	int n1 = (int)l1;
	short s1 = (short)n1;
	byte b1 = (byte)s1;
	System.out.println(b1);
	}
}
