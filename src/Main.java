import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        boolean continuar = true;
        do {
            System.out.println("Conversor de Monedas");
            System.out.println("Ingrese la cantidad que desee convertir: ");
            double montoAConvertir = lec.nextDouble();
            System.out.println("Muy bien, ahora, a que moneda desea convertirlo?");
            System.out.println(" 1. Peso a dolar. 2. dolar a peso");
            System.out.println(" 3. Peso a Euro. 4. Euro a peso");

            try{
                int elegir = lec.nextInt();
                Moneda moneda = new Moneda(montoAConvertir, "mexico");

                switch (elegir){

                    case 1:
                        System.out.println("La conversion resultado es de: " + moneda.ConvertirMonedaADolar());

                        break;

                    case 2:
                        System.out.println("La conversion resultado es de: " + moneda.ConvertirDolarAMoneda());
                        break;

                    case 3:
                        System.out.println("La conversion resultado es de: " + moneda.ConvertirMonedaAEuro());
                        break;

                    case 4:
                        System.out.println("La conversion resultado es de: " + moneda.ConvertirEuroAMoneda());
                        break;

                    default:
                        System.out.println("este numero no es valido");
                }
            } catch (InputMismatchException ex){
                ex.getMessage();
            }

            System.out.println("desea continuar revisando conversiones? 0 si, 1 no");
            int Proseguir = lec.nextInt();
            if (Proseguir != 0){
                continuar = false;
            } 



        }while (continuar == true);
    }
}