
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
		int  intentos_formulario=1;
		double elecciones [][]= new double[3][10];
		int fila=0;      // FILA DEL ARRAY
		double resultado_media_pruebas=0.0;    //para la media de las pruebas obtenidas

		//ARRAY DE DOS DIMENSIONES: 
		// FILA 1: PRIMER INTENTO CON SUS 8 PREGUNTAS
		// FILA 2: SEGUNDO INTENTO CON SUS 8 PREGUNTAS
		// FILA 3: TERCER INTENTO CON SUS 8 PREGUNTAS
		//Se ha creado el array de resultados con la última casilla disponible para el resultado de la media %
		//Si el número de preguntas pudiera crecer en el futuro, simplemente se alargara la longitud del vector
		
		int i=0; //Variable puntero de recorrido del Array por filas
		int j=0; // Variable puntero de recorrido del Array por columnas
		String calificaciones[]= new String[5];
		
		//Inicializamos la variable calificaciones de tipo Array
		for(i=0;i<5;i++)
		{
			calificaciones[i]="";
		}
		
		//Procedemos con el programa interno
		
		while(intentos_formulario<5)
		{
			switch(intentos_formulario)
			{
			case 1: 
				fila=0;
				/* Primer intento de la realización de la encuesta*/
				System.out.println("                  ----- Bienvenido a la encuesta -----");
				System.out.println(" ----- A continucación tendrá que realizar el formulario que se le propone -----");
				System.out.println(" --- Para responder a las preguntas: SI(1) y NO(0), no se permite otro número ---");
				/* Se crea la interfaz de la encuesta */
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
				
				do {
					System.out.print("1) ");
					elecciones[fila][0]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer
					
				}while(elecciones[fila][0]<0 || elecciones[fila][0]>1);
				
				do {
					System.out.print("2) ");
					elecciones[fila][1]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer
					
				}while(elecciones[fila][1]<0 || elecciones[fila][1]>1);
				
				do {
					System.out.print("3) ");
					elecciones[fila][2]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][2]<0 || elecciones[fila][2]>1);			
				
				do {
					System.out.print("4) ");
					elecciones[fila][3]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][3]<0 || elecciones[fila][3]>1);
				
				do {
					System.out.print("5) ");
					elecciones[fila][4]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][4]<0 || elecciones[fila][4]>1);
				
				do {
					System.out.print("6) ");
					elecciones[fila][5]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][5]<0 || elecciones[fila][5]>1);

				do {
					System.out.print("7) ");
					elecciones[fila][6]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][6]<0 || elecciones[fila][6]>1);
				
				do {
					System.out.print("8) ");
					elecciones[fila][7]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][7]<0 || elecciones[fila][7]>1);
				
				System.out.println("Sus resultados han sido los siguientes:");
				System.out.println("");

				for(i=0;i<1;i++)
				{
					for(j=0;j<8;j++){
						elecciones[i][8]=elecciones[i][8]+elecciones[i][j];
						
						if (j==7)
								{
								elecciones[i][8]=(elecciones[i][8]*100)/8;
								}
					}
					j=0;   //Reiniciamos la variable para que el recorrido se vuelva a realizar en el siguiente ciclo
				}
				
				//Se saca por pantalla los ciclos de los resultados obtenidos
				for(i=0;i<1;i++)
				{
				  j=0;  //reiniciamos la variable
					for(j=0;j<8;j++)
					{
						// Se va creando una posterior tabla para mostrar al final los resultados	
						calificaciones[i]=calificaciones[i]+" | "+elecciones[i][j];
					}
					System.out.println("Respuestas de la Primera Prueba:");
					calificaciones[i]=calificaciones[i]+ " |    " + elecciones[i][8]+"%";
					System.out.println(calificaciones[i]);
					System.out.println("");
				}				
			
				//Ahora se decide según el resutlado del "total_calificaciones" si terminar o repetir

				if(elecciones[0][8]<80)
				{
					intentos_formulario=intentos_formulario+1;		
				}
				else {
					resultado_media_pruebas=elecciones[0][8];
					intentos_formulario=4;
				}
				
				break;			
			case 2:
				fila=1;
				/* Segundo intento de la realización de la encuesta*/
				System.out.println("                        ----- Bienvenido de nuevo a la encuesta -----");
				System.out.println(" ----- A continucación tendrá una segunda oportunidad de realizar el formulario de nuevo -----");
				/* Se crea la interfaz de la encuesta */
				
				System.out.println("");
				System.out.println("");
				
				do {
					System.out.print("1) ");
					elecciones[fila][0]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer
					
				}while(elecciones[fila][0]<0 || elecciones[fila][0]>1);
				
				do {
					System.out.print("2) ");
					elecciones[fila][1]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer
					
				}while(elecciones[fila][1]<0 || elecciones[fila][1]>1);
				
				do {
					System.out.print("3) ");
					elecciones[fila][2]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][2]<0 || elecciones[fila][2]>1);			
				
				do {
					System.out.print("4) ");
					elecciones[fila][3]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][3]<0 || elecciones[fila][3]>1);
				
				do {
					System.out.print("5) ");
					elecciones[fila][4]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][4]<0 || elecciones[fila][4]>1);
				
				do {
					System.out.print("6) ");
					elecciones[fila][5]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][5]<0 || elecciones[fila][5]>1);

				do {
					System.out.print("7) ");
					elecciones[fila][6]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][6]<0 || elecciones[fila][6]>1);
				
				do {
					System.out.print("8) ");
					elecciones[fila][7]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][7]<0 || elecciones[fila][7]>1);
				
				System.out.println("");
				System.out.println("Sus resultados han sido los siguientes:");

				
				for(i=1;i<2;i++)
				{
				   j=0;   //Reiniciamos la variable para que el recorrido se vuelva a realizar en el siguiente ciclo
					for(j=0;j<8;j++){
						elecciones[i][8]=elecciones[i][8]+elecciones[i][j];
						
						if (j==7)
								{
								elecciones[i][8]=(elecciones[i][8]*100)/8;
								}
					}
}
				
				//Se saca por pantalla los ciclos de los resultados obtenidos
				System.out.println("");
				System.out.println("Respuestas de la Primera Prueba:");
				System.out.println(calificaciones[0]);
				for(i=1;i<2;i++)
				{	
				   j=0; // reiniciamos la variable
					for(j=0;j<8;j++)
					{
						// Se va creando una posterior tabla para mostrar al final los resultados	
						calificaciones[i]=calificaciones[i]+" | "+elecciones[i][j];
					}
					calificaciones[i]=calificaciones[i]+ " |    " + elecciones[i][8]+"%";
					System.out.println("Respuestas de la Segunda Prueba:");
					System.out.println(calificaciones[i]);
					System.out.println("");
				}				
			
				//Ahora se decide según el resutlado del "total_calificaciones" si terminar o repetir
				intentos_formulario=intentos_formulario+1;
				break;
			case 3:
				fila=2;
				/* Tercer intento de la realización de la encuesta*/
				System.out.println("                        ----- Bienvenido de nuevo a la encuesta -----");
				System.out.println(" ----- A continucación tendrá una última oportunidad de realizar el formulario de nuevo -----");
				/* Se crea la interfaz de la encuesta */
				
				System.out.println("");
				System.out.println("");
				
				do {
					System.out.print("1) ");
					elecciones[fila][0]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer
					
				}while(elecciones[fila][0]<0 || elecciones[fila][0]>1);
				
				do {
					System.out.print("2) ");
					elecciones[fila][1]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer
					
				}while(elecciones[fila][1]<0 || elecciones[fila][1]>1);
				
				do {
					System.out.print("3) ");
					elecciones[fila][2]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][2]<0 || elecciones[fila][2]>1);			
				
				do {
					System.out.print("4) ");
					elecciones[fila][3]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][3]<0 || elecciones[fila][3]>1);
				
				do {
					System.out.print("5) ");
					elecciones[fila][4]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][4]<0 || elecciones[fila][4]>1);
				
				do {
					System.out.print("6) ");
					elecciones[fila][5]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][5]<0 || elecciones[fila][5]>1);

				do {
					System.out.print("7) ");
					elecciones[fila][6]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][6]<0 || elecciones[fila][6]>1);
				
				do {
					System.out.print("8) ");
					elecciones[fila][7]= resultado.nextInt();  // el usuario puede introducir el dato de tipo integer

				}while(elecciones[fila][7]<0 || elecciones[fila][7]>1);
				
				System.out.println("");
				System.out.println("Sus resultados han sido los siguientes:");
				System.out.println("");

				for(i=2;i<3;i++)
				{
				   j=0;   //Reiniciamos la variable para que el recorrido se vuelva a realizar en el siguiente ciclo
					for(j=0;j<8;j++)
					{
						elecciones[i][8]=elecciones[i][8]+elecciones[i][j];
						
						if (j==7)
								{
								elecciones[i][8]=(elecciones[i][8]*100)/8;
								}
					}
				}
				
				//Se saca por pantalla los ciclos de los resultados obtenidos
				System.out.println("Respuestas de la Primera Prueba:");
				System.out.println(calificaciones[0]);
				System.out.println("Respuestas de la Segunda Prueba:");
				System.out.println(calificaciones[1]);
				for(i=2;i<3;i++)
				{	
				  j=0;
					for(j=0;j<8;j++)
					{
						// Se va creando una posterior tabla para mostrar al final los resultados	
						calificaciones[i]=calificaciones[i]+" | "+elecciones[i][j];
					}
					calificaciones[i]=calificaciones[i]+ " |    " + elecciones[i][8]+"%";
					System.out.println("Respuestas de la Tercera Prueba:");
					System.out.println(calificaciones[i]);
					System.out.println("");
				}				
			
				//Ahora se decide según el resutlado del "total_calificaciones" si terminar o repetir
				intentos_formulario=intentos_formulario+1;
				break;
			case 4:
				//Se crea un caso más para finalizar el programa en el caso de haber sacado mas de 80% en el primer intento
			
				if (elecciones[0][8]>=80)
				{
					System.out.println("Enhorabuena por el resultado en el primer intento");
				}
				
				else if(elecciones[0][8]<80)
				{
					int k=0;
					System.out.println("Ahora se comprobará la media de las tres pruebas");
					
					System.out.println("Primera prueba: " + elecciones[0][8]+"%");
					System.out.println("Segunda prueba: " + elecciones[1][8]+"%");
					System.out.println("Tercera prueba prueba: " + elecciones[2][8]+"%");
					for (k=0;k<3;k++)
						{
							resultado_media_pruebas=resultado_media_pruebas+elecciones[k][8];
						}
						resultado_media_pruebas=resultado_media_pruebas/3;
						
							if (resultado_media_pruebas<80.0)
							{
								System.out.println("Tras obtener un resultado de: " +String.format("%.3f", resultado_media_pruebas)+"%"+" se le pedirá que hable con su profesor. Fin del programa");
							}
							if (resultado_media_pruebas>80.0)
							{
								System.out.println("Tras obtener un resultado de: " +String.format("%.3f", resultado_media_pruebas)+"%"+"Se le da la enhorabuena por los resutlados. Fin del programa");	
							}
							// Se escribe: String.format("%.3f", args) para que cuando calcule la media solo de un par de decimales no mil que puede haber
				}
				intentos_formulario=intentos_formulario+1;
				break;
			default:
				//El programa finaliza
				break;
			}
		}
		
		
		resultado.close();  // al final de la ejecución del programa se cierra el resultado
		}

}
