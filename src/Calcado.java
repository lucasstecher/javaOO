public class Calcado {
    private String nome;
    private double tamanho;
    private String cor;

    public Calcado(String nome, double tamanho, String cor) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
