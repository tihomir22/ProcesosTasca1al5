
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cua q = new Cua();
		Productor p = new Productor(q,1000);
		Consumidor c = new Consumidor(q, 1250);
		
		p.start();
		c.start();

	}

}
