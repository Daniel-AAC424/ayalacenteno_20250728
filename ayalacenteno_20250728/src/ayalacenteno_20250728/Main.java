/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ayalacenteno_20250728;

/**
 *
 * @author UFG
 */
public class Main {
    
    /*VariablesGlobales*/
    public static String nombres = "Daniel Alejandro";
    public static String apellidos = "Ayala Centeno";
    public static int anio_nacimiento = 2006;
    public static int mes_nacimiento = 2;
    public static float estatura = 1.65f;//Estatura en metros
    public static float peso = 180.50f; //Peso en libras
    public static char genero = 'M';
    public static String estado_familiar = "Trabajando TT";
    public static double salario_mensual = 365.43d;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       double imc = 0.0d; 
       float tasa_kilogramo = 0.453592f;//1 libra = 0.453592 kg
       int dias_laborales = 22;//22horas laboralesal mes
       int horas_laborales = 8;//8 horas laborales al dia
       
       //Convertir el peso de libras a kilogramos
       float peso_kilogramos = Main.peso*tasa_kilogramo;
       //Elevando el valor de la estatura al cuadrado
       float estatura_al_cuadrado = Main.estatura*Main.estatura;
      
       //calcular el indice de masa corporal
       imc = peso_kilogramos/estatura_al_cuadrado;
        
       //calculando el salario diario
       double salario_diario = Main.salario_mensual/dias_laborales;
       
       //calculando el salario porhora
       double salario_por_hora = salario_diario/horas_laborales;
       
       /***********************************************/
       
      //Salida de datos
      
      System.out.println("Hola "+Main.nombres+" "+Main.apellidos);
      System.out.println("Su peso en libras es "+Main.peso +" pero en Kg es "+peso_kilogramos);
      System.out.println("Su indice de masa corporal es "+imc);
      System.out.println("Su salario mensual es "+Main.salario_mensual);
      System.out.println("Su salario diario es "+salario_diario);
      System.out.println("Su salario por hora es "+salario_por_hora);
      
    }
    
}
