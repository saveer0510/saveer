package s2;

interface Animal{
	void food();

}
class hen implements Animal {
	public void food() {
		System.out.print("hen eats  grains");
	}
	
}
public class A{
	public static void main(String [] args)
	{
		Animal a =new hen();
		a.food();
 }
	
}