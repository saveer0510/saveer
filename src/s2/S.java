package s2;
class c{
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
}

public class S {
	public static void main(String [] args) {
		c o =new c();
		o.add(5, 2);
		o.add(5, 9, 3);
	}

}
