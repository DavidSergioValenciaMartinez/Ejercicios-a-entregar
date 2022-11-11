import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int juan = 0;
    int mateo = 0;
    int pedro = 0;
    int R = 0;
    System.out.println("ingrese la edad de juan");
    juan = leer.nextInt();
    System.out.println("ingrese la edad de mateo");
    mateo = leer.nextInt();
    System.out.println("ingrese la edad de pedro");
    pedro = leer.nextInt();
    if(juan==mateo && mateo==pedro){
      System.out.println("los tres son contemporaneos");
    }else{
      if(juan==mateo){
        System.out.println("Juan y mateo son contemporaneos");
     }else{
          if(juan==pedro){
         System.out.println("juan y pedro son contemporaneos");  
     }else{
            if(mateo==pedro){
         System.out.println("mateo y pedro son contemporaneos");
             }else{
            System.out.println("no hay contemporaneos");
}
}
}
} 
}    
}