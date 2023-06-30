package entities;

public class Produto {
    private int id;
    private String nome;
    private double valorUn;

    public Produto(int id, String nome, double valorUn){
        this.id = id;
        this.nome = nome;
        this.valorUn = valorUn;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValorUn() {
        return valorUn;
    }
    public void setValorUn(double valorUn) {
        this.valorUn = valorUn;
    }

    @Override
    public String toString() {
        return this.getId() + " - " + this.getNome() + " - R$" + this.getValorUn();
    }
}
