
public class Cua {

	private int valor;
	private boolean isRead;
	private boolean isWriten;

	//CONSTRUCTOR
	public Cua() {

		valor = -1;
		//inicialitzades variables booleanes
		isRead = true;
		isWriten = false;
		
		// TODO Auto-generated constructor stub
	}

	
	/*  CONSUMIR() retorna:
		-1 -> Valor ja ha sigut llegit, indica que cal esperar
		valor -> Valor no llegit, indica que cal llegir
	*/
	public int consumir() {
		
		int valorRetornat;
		if (isRead) 
			valorRetornat = -1;
		else {
			isRead = true;
			valorRetornat = this.valor;
			isWriten = false; // Permetem l'escriptura
		}
		return valorRetornat;
	}

	
	/*  PRODUIR(INT):
		Si Valor ja ha sigut llegit, modifica el valor
		Si valor NO ha sigut llegit, no fa res
	*/

	public void produir(int x) {
		
		if(!isWriten) {	
						System.out.println("PROD. Generat el valor: "+ x);
						this.valor = x;
						isWriten = true;
						isRead = false;
		}
		else {
			System.out.println("PROD. Dada no llegida, ESPERA");
			isWriten = true;
			}

	}

}
