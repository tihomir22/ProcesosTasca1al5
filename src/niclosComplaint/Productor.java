
public class Productor  extends Thread{

	//Atributs
	private Cua cua;
	private long tempsProd;

	
	//CONSTRUCTOR, passem com argument el buffer compartit i el temps entre accions
	public Productor(Cua q, long tempsProd) {
		// TODO Auto-generated constructor stub
		this.cua = q;
		this.tempsProd = tempsProd;
	}

	
	//Codi execucio del FIL
	public void run() {
		int x;
		for(int i=1; i<=10; i++) {
			x = i;//(int) (Math.random() * 10);
			
			cua.produir(x);
			try {
				Thread.sleep(tempsProd);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
}
