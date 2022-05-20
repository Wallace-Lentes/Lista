public class App {
    public static void main(String[] args) throws Exception {
        No no;

        Lista l = new Lista();
        l.insereUltimo(10);
        l.insereUltimo(20);
        l.insereUltimo(30);
        System.out.println("************");
        l.inserePrimeiro(50);
        l.insereDepois(22);
        l.insereUltimo(5);
        l.mostrar();
        System.out.println("****************");
        l.removerPimeiro(22);
        l.mostrar();
        l.removeUltimo(0);
        System.out.println("*****************");
        l.mostrar();

        no = l.buscar(5);
        if (no != null) {
            l.remover(no);
        }

    }
}
