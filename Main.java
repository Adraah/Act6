import java.util.Scanner;

class Calculo {
    public static int promedio(int[] array){
        int suma = 0;
        for(int i = 0; i<array.length; i++ ){
            suma = suma + array[i];
        }
        suma = suma / array.length;
        return suma;
    }

    public static String calificacion(int a){
        if(a<=50){
            return "F";
        } else if (a<=60) {
            return "E";
        } else if (a<=70) {
            return "D";
        } else if (a<=80) {
            return "C";
        } else if (a<=90) {
            return "B";
        } else {
            return "A";
        }
    }

    public static void impresion(String nombre, int[] array){
        System.out.println("Nombre del estudiante: "+nombre);
        for(int i = 0; i<array.length; i++ ){
            System.out.println("Calificacion "+ (i + 1) + " :"+ array[i]);
        }
        System.out.println("Promedio: "+ promedio(array));
        System.out.println("Calificacion: "+ calificacion(promedio(array)));
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese nombre:");
        String name = myObj.nextLine();
        int [] califaciones = new int[5];

        for(int i = 0; i<5; i++ ){
            System.out.println("Ingrese califacion "+ (i + 1) + " :");
            califaciones[i] = myObj.nextInt();
        }

        Calculo.impresion(name, califaciones);
    }
}