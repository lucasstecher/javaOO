public class Calcado {
    private String nome;
    private double tamanho;
    private String cor;
    //Publico para os filhos.
    protected String material;

    public Calcado(String nome, double tamanho, String cor, String material) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
