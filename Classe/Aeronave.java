package Classe;

public class Aeronave {
    private String Modelo;
    private String Categoria;
    private Piloto[] oPiloto = new Piloto[50];

    public Aeronave (){}

    public Aeronave (String m, String c) {
        this.Modelo = m;
        this.Categoria = c;
    }

    public Aeronave (String m, String c, Piloto oPiloto) {
        this.Modelo = m;
        this.Categoria = c;
    }
    
    public Aeronave (Piloto[] oPiloto) {
        this.oPiloto = oPiloto;
    
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }
}