package exemplo1poo;

public class Aluno {
	private String ra;
	private String nome;
	private String curso;
	private int anoIngress;
	
	Aluno(String nome, String curso, int anoIngress) {
		this.setNome(nome);
		this.setCurso(curso);
		this.setAnoIngress(anoIngress);
	}
	
	//metodos uteis
	public void cadastrar()
	{}
	public void calcTempoFac(int anoatual) 
	{
		if(anoatual-this.anoIngress>0)
		{
			System.out.println("O aluno "+nome+" estuda há "+(anoatual-this.anoIngress)+" anos");
			if(anoatual-this.anoIngress>5)
				System.out.println("Fazer novo vestibular");
		}
		else {
			System.out.println("O ano de ingresso não pode ser maior do que o ano atual");
		}
	}
	
	//getters & setters
	public int getAnoIngress() {
		return anoIngress;
	}
	public void setAnoIngress(int anoIngress) {
		this.anoIngress = anoIngress;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
}
