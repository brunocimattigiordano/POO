/**
 * 
 */
package exemplo1poo;

/**
 * @author FATEC
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Exemplo1 objet=new Exemplo1();
		objet.mostra();*/
		int anoatual=2020;
		if(anoatual<0)
			anoatual*=(-1);
		Aluno jay=new Aluno("Jacob","ADS", 2010);
		jay.calcTempoFac(anoatual);
		
		Aluno barb=new Aluno("Barbra", "ADS", 2018);
		barb.calcTempoFac(anoatual);
		
	}

}
