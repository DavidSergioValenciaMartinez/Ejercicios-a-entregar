import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[10];
      int pos = 0; 
        int neg = 0;
      int i;
      double sumaPos = 0;
        double sumaNeg=0;
    System.out.println("Lectura de los elementos del array: ");
    for(i = 0; i < numeros.length; i++){
      System.out.println("numeros [" + i + "]= ");
      numeros[i]=sc.nextInt();
  }
    for(i = 0; i < numeros.length; i++){
      if (numeros[i] > 0){
        sumaPos += numeros [i];
      pos ++;
      
}else if (numeros [i] < 0){
      sumaNeg += numeros[i];
      neg++;
}

    if (pos !=0){
      System.out.println("Media de los valores positivos es: " + sumaPos / pos);
   } else {   
  System.out.println("No existen numeros positivos ");
  }
      
      if (neg !=0){
        System.out.println("Media de los valores negativos es: " + sumaNeg / neg);
        } else {
        System.out.println("No existen numeros negativos ");
        } 
   
  }
  }
  } 