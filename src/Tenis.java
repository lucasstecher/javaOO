public class Tenis extends Calcado{

    public Tenis(String nome, double tamanho, String cor, String material) {
        //super: significa que o 'atributo' pertence a classe mãe.
        //pode ser chamado tanto para atributos quanto para métodos
        super(nome, tamanho, cor, material);
    }
}
