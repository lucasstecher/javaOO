public class TesteTenis {
    public static void main(String[] args) {
        Tenis adidas = new Tenis("Vulc", 40, "Branco", "Borracha");
        System.out.println("Nome: " + adidas.getNome());
        System.out.println("Cor: " + adidas.getCor());
        System.out.println("Tamanho: " + adidas.getTamanho());
        System.out.println("Material: " + adidas.getMaterial());
        System.out.println(adidas);
    }
}
