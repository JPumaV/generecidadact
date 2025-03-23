public class Principal {
    public static void main(String[] args) {
        Bolsa<Chocolatina> bolsaCho = new Bolsa<>(3);
        bolsaCho.add(new Chocolatina("Iberica"));
        bolsaCho.add(new Chocolatina("Milka"));
        bolsaCho.add(new Chocolatina("Ferrero"));

        System.out.println("Contenido de la bolsa de Chocolatinas:");
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }

        Bolsa<Golosina> bolsaGol = new Bolsa<>(2);
        bolsaGol.add(new Golosina("Caramelo", 10.5));
        bolsaGol.add(new Golosina("Gomita", 5.2));

        System.out.println("\nContenido de la bolsa de Golosinas:");
        for (Golosina golosina : bolsaGol) {
            System.out.println(golosina.getNombre() + " - " + golosina.getPeso() + "g");
        }
    }
}