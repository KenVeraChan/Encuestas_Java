
/* PROBLEMA */
/* El alumno realizará el test una primera vez: Si saca más del 80% se le dará la enhora buena y fin */
/* Si es inferior al 50% tendrá que hacer el test dos veces más, alcanzando una totalidad de 3 intentos */
/* Si al realizar los 3 intentos, sale mas del 80%, se le dará la enhorabuena, sino se le pedirá que se lo */
/* comente a su profesor*/

package encuesta;
import java.util.Scanner;   //se hace la importación de la clase SCANNER para leer por teclado 

public class Encuesta_centro_de_estudios {

	public static void main(String[] args) {
		
		Scanner resultado = new Scanner(System.in);  //preparación para leer por teclado
		int  contador_intentos_formulario=0;
		int i=1;      // Numero de la pregunta
	
		boolean salida=false;
		double numero_introducido=0.0;
		double resultado_media=0.0;    //para la media de las pruebas obtenidas
		for(int k=0;k<20;k++)
		{
			System.out.println("");
		}
		
		/* Realización de la encuesta*/
		System.out.println("                  ----- Bienvenido a la encuesta -----");
		System.out.println(" ----- A continucación tendrá que realizar el formulario que se le propone -----");
		System.out.println(" --- Para responder a las preguntas: SI(1) y NO(0), no se permite otro número ---");
		/* Se crea la interfaz de la encuesta */
		

		
		while(salida==false)
		{	
			System.out.println("");
			System.out.println("1) ¿Te gustan las computadoras?");
			System.out.println("2) ¿Disfrutas con la resolución de problemas?");
			System.out.println("3) ¿Quieres trabajar en equipo?");
			System.out.println("4) ¿Te agrada aprender por descubrimiento o prefieres que te indiquen las cosas paso a paso?");
			System.out.println("5) ¿Eres creativo?");
			System.out.println("6) ¿Eres resolutivo?");
			System.out.println("7) ¿Te rindes al primer intento?");
			System.out.println("8) ¿Estas dispuesto a tener que actualizar tu conocimiento a lo largo de tu vida?");
			System.out.println("");
			
				for(i=1;i<9;i++)
				{
					do {   //Entra en un bucle para comprobar que no mete otro numero salvo 0 o 1
					System.out.print(i+") ");
					numero_introducido=resultado.nextInt();
					}while(numero_introducido<0 || numero_introducido>1);
					resultado_media=resultado_media+ numero_introducido;  // el usuario puede introducir el dato de tipo integer
				}
				resultado_media=(resultado_media/8)*100;
				System.out.println("");
				System.out.println("Resultado obtenido: "  +String.format("%.2f", resultado_media)+"%");
					if(resultado_media>=80 && contador_intentos_formulario<1)
					{
						System.out.println("Enhorabuena por el resultado en el primer intento!");

						contador_intentos_formulario=contador_intentos_formulario+1;
						System.out.println("Intento: "+contador_intentos_formulario);
						salida=true;
					}
					//Tratamiento del contador de intentos comenzando desde el número 0: primer intento, 1: segundo intento, 2: tercer intento.
					else if(resultado_media<50 && contador_intentos_formulario>=1 && contador_intentos_formulario<2)
					{								
							System.out.println("Tendrá que volver a hacer el test!");

							resultado_media=0.0; //Reiniciando el contador de medias
							contador_intentos_formulario=contador_intentos_formulario+1;
							System.out.println("Intento: "+contador_intentos_formulario);
					}
							
					else if(resultado_media<50 && contador_intentos_formulario>=2)
					{
						System.out.println("Tendrá que hablar con su profesor al tener una calificación menor al 50%!");
						contador_intentos_formulario=contador_intentos_formulario+1;
						System.out.println("Intento: "+contador_intentos_formulario);
						salida=true;
					}
					//Este caso es en el que el primer intento sea: 50<media<80
					else if(resultado_media<80 &&  contador_intentos_formulario<1)
					{
							System.out.println("Tendrá que volver a hacer el test, al no obtener como mínimo 80% en el primer intento!");

							resultado_media=0.0; //Reiniciando el contador de medias
							contador_intentos_formulario=contador_intentos_formulario+1;
							System.out.println("Intento: "+contador_intentos_formulario);
					}
		
					else if(resultado_media>=50 &&  contador_intentos_formulario>=1 && contador_intentos_formulario<=2)
					{
						System.out.println("Enhorabuena por el resultado!"); 
						contador_intentos_formulario=contador_intentos_formulario+1;
						System.out.println("Intento: "+contador_intentos_formulario); 
						salida=true;
					}		
		 }		
		resultado.close();  // al final de la ejecución del programa se cierra el resultado
		}
}
