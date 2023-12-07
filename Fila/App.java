package Fila;

public class App {
    public static void main(String[] args) {
        Fila f = new Fila();

        f.add(0);
        f.add(1); 
        f.add(2); 
        f.escreve();
        f.remove();
        System.out.println("Removido 1: ");
        f.escreve();
        f.remove();
        System.out.println("Removido 2: ");
        f.escreve();
        f.remove();
    }
}
