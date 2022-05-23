public class App {
    public static void main(String[] args) throws Exception {
    	Lista list = new Lista();
		list.insereUltimo(1);
		list.insereUltimo(2);
		list.insereUltimo(3);
		
		list.mostrar();
		System.out.println();
		System.out.println("-----");
		
		list.removeUltimo();
		list.mostrar();
		System.out.println();
		System.out.println("-----");
		
		list.insereUltimo(3);
		list.insereUltimo(4);
		list.insereUltimo(5);
		list.insereUltimo(6);
		
		list.mostrar();
		System.out.println();
		System.out.println("-----");
		
		list.remove(list.buscar(4));
		list.mostrar();
		System.out.println();
		System.out.println("-----");
		
		list.insereDepois(list.buscar(3), 0);
		list.mostrar();
		System.out.println();
		System.out.println("-----");
		
		System.out.println("END GAME");

    }
}
