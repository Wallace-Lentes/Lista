public class App {
    public static void main(String[] args) throws Exception {

        Lista l = new Lista();
        l.insereUltimo(10);
        l.insereDepois(15);
        l.insereUltimo(20);
        l.insereUltimo(30);

        l.inserePrimeiro(50);

        l.insereDepois(22);

        l.insereUltimo(5);

        l.removerPimeiro(22);

        l.removeUltimo(0);

        l.mostrar();

    }
}
