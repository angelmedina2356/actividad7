    package actividad7;
    import java.util.Scanner;

    //Declaracion de variables//
    public class act7 {
    int primos; 
    
    //Metodo para obtener numeros primos//
    public void leerNumers(){
    Scanner lector = new Scanner(System.in);
    System.out.println("Bienvenido al sistema de rangos de Numeros Primos y Succesión de Fibonacci");
    System.out.println("Escribe el numero limite");
    primos = lector.nextInt();
    System.out.println("Números Primos:");
    for (int i = 1; i < primos; i++) {
    int contador = 0;
    for (int j = 1; j <= i; j++) {
    if ( i % j == 0)
    contador++;}
    if (contador == 2)
    System.out.print(i + ", " );
    }  
}
     //Metodo para calculo de la sucesión de FIbonacci//
     public int parte2(){
     int num1 = 0;
     int num2 = 1;
     int save;                        
     System.out.println("");            
     System.out.println("Sucesión de Fibonacci: ");
     System.out.print(num1 + ", ");
     
     System.out.print(num2 + ", ");
     while(num2 + num1 <= primos){
     save = num1;
     num1 = num2;
     num2 = save + num1;
     System.out.print(num2 +", ");
     }
     System.out.println("");
     return 0;
  }
}

