package Classe;

public class Piloto extends Pessoa {
    private String breve;
    private String matricula;
    private Aeronave[] aviao = new Aeronave[50]; 
    private int qtdDeAvioesEspecifica = 0;

    public Piloto() {
    }

    public Piloto(String nome, String cpf, String breve, String matricula) {
        super(nome, cpf);
        this.breve = breve;
        this.matricula = matricula;
    }

    // criar novo piloto e passar um aviao pra ele usar
    public Piloto(String nome, String cpf, String breve, String matricula, Aeronave aviao) {
        super(nome, cpf);
        this.breve = breve;
        this.matricula = matricula;
        
    }


    public Piloto(String nome, String cpf, String breve, String matricula, String m, String c) {
        super(nome, cpf);
        this.breve = breve;
        this.matricula = matricula;
        this.aviao[] = new Aeronave(m, c);
    }

    public Piloto getPiloto() {
        return this;
    }

    public String getBreve() {
        return breve;
    }

    public void setBreve(String breve) {
        this.breve = breve;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAviao(Aeronave a1, int index) {
    }

    public void setAumentarQtdAviao() {
    }

    public boolean checarSeTemAviao() {
        return false;
    }

    public int getQtdDeAvioesEspecifica() {
        return 0;
    }

    public Aeronave getAviao(int indexAviao) {
        return null;
    }

   
}