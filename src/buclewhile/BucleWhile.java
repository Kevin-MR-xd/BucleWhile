package buclewhile;

/**
 *
 * @author El chistes (Kevin Moreno Rojas)
 * 
 * While --> Bucle de muestra con while
 */

public class BucleWhile {
     int contador = 0; // inicializa la condición
     public void buclesin (){
          while (contador < 6) // condición de prueba
        {
            contador++; // cuerpo del bucle
            System.out.println("contador: " + contador);
        }
        System.out.println("Terminado.Contador: " + contador);
    }
     public static void main(String[] args) {
       BucleWhile bucle = new BucleWhile ();
       bucle.buclesin();
     }
     }
       
    
