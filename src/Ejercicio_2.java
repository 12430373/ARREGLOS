import java.util.Scanner;

public class Ejercicio_2 {
        String[] original;
        String[] inverso;
        Scanner scanner;
        //metodo cosnstructor
        public Ejercicio_2(){
            original= new String[5];
            inverso=new String[5];

            scanner =new Scanner(System.in);
        }
        //metodo ejectuar
        public void ejecutar(){
            ///llenamos el vector original con cadenas leidas del teclad
        for (int i =0;i< original.length;i++){
            System.out.println("original[" + i + "]:");
            String cadena= scanner.nextLine();
            original[i]=cadena;
        }
        int indiceOriginal=0;
        int indiceInverso=4;
        while(indiceOriginal<original.length){
            inverso[indiceInverso]=original[indiceOriginal];

            indiceOriginal++;
            indiceInverso--;
        }
        //mostramos el contenido de inverso
        for(int i=0;i< inverso.length;i++){
            System.out.println("inverso[" + i +"]: " +inverso[i]);
        }
        }
    }
