import java.util.Scanner;

public class Prog1_2 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner leerradio = new Scanner(System.in);
		int radio;
		System.out.println("Introduce el radio de la esfera");
		radio = leerradio.nextInt();
		double volumen;
		volumen = (4 * (Math.PI) * (Math.pow(radio, 3)) / 3);

	}
}