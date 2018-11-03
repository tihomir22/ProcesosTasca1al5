
public class Consumidor extends Thread{

	//Atributs
	private Cua cua;
	private long tempsCons;
	
	
	//CONSTRUCTOR, passem com argument el buffer compartit i el temps entre accions
	public Consumidor(Cua q, long tempsCons) {
		// TODO Auto-generated constructor stub
		this.cua = q;
		this.tempsCons = tempsCons;
	}

	
	//Codi execucio del FIL
	public void run() {
		int x;
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1; i<=10; i++) {
			
			x = cua.consumir();
			if (x == -1) 
				System.out.println("\t\t\t\tCONS. Dada llegida, ESPERA");
			else 
				System.out.println("\t\t\t\tCONS. Consumint el valor: "+ x);
			
			try {
				Thread.sleep(tempsCons);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
}
