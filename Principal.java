public class Principal {
    public static void main(String[] args) {
       
        Hijo hijo = new Hijo(10, 20);
        hijo.imprimirX();
        hijo.imprimirY();

	int base = 2;
	int exponente = 4;

	int res = Recursividad.potencia(base,exponente);

	System.out.println("El resultado es  " + res );
    }
    
    public class Padre {
    protected int x;

    public Padre(int x) {
        this.x = x;
    }

    public void imprimirX() {
        System.out.println("El valor de x en la clase Padre es " + x);
    }
}
}