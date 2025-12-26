public class ArrangeBuildings{
	public static void main(String[] args) {
		int n=5;
		int ewiths=1;
		int ewithb=1;

		for(int i=2;i<=n;i++){
			int newiths=ewithb+ewiths;
			int newithb=ewiths;

			ewiths=newiths;
			ewithb=newithb;
		}
		int total=ewithb+ewiths;
		total*=total;
		System.out.println(total);
	}
}