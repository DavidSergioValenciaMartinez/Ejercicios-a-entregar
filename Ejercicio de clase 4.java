import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    double Valor1;
      double Valor2;
    double valor3;
    int n=0;
    System.out.println("Introduce el primer valor");
    Valor1=leer.nextDouble();
    System.out.println("Intorduce el segundo valor");
    Valor2 =leer.nextDouble();
    System.out.println("¿Que operacion quieres hacer, 1suma, 2Resta,3Multiplicacion, 4Diviscion?");
    valor3=leer.nextInt();


    if(valor3==1) {
      sumar(Valor1,Valor2);
      }else if (valor3==2){
          restar(Valor1,Valor2);
      }else if (valor3==3){
          multiplicar(Valor1,Valor2);
      }else if (valor3==4){
          dividir(Valor1,Valor2);
}
          
}

    private static void sumar(double Valor1,double Valor2) {
      double respuesta=0;
      respuesta = Valor1+Valor2;
    System.out.println("Resultado ="+ respuesta);
  }
    private static void restar(double Valor1,double Valor2) {
      double respuesta=0;
      respuesta = Valor1-Valor2;
    System.out.println("Resultado ="+ respuesta);
}
    private static void multiplicar(double Valor1,double Valor2) {
      double respuesta=0;
      respuesta = Valor1*Valor2;
    System.out.println("Resultado ="+ respuesta);
}
    private static void dividir(double Valor1,double Valor2) {
      double respuesta=0;
      respuesta = Valor1/Valor2;
    System.out.println("Resultado ="+ respuesta);
}
}
