package LeerSeparar;



import java.io.*;


public class LeerSepararImprimir {
	

		public static void main(String args[]){
			
			try{
				FileReader input = new FileReader(new File("/Users/cristianmartinez/Desktop/Archivos/miArchivo2.txt"));
				BufferedReader bufInput = new BufferedReader(input);
				String line;
				line = bufInput.readLine();
				
					
					String [] datos = null;
					
					while(bufInput != null) {
						
					datos = line.split(":");
					
					System.out.println(datos[0]);
					System.out.println(datos[1]);
					System.out.println(datos[2]);
					System.out.println(datos[3]);
					System.out.println(datos[4]);
					System.out.println(datos[5]);
					System.out.println(datos[6]);
					System.out.println(datos[7]);
					System.out.println(datos[8]);
					
					}
						
			
						
					
					line = bufInput.readLine();
				
				bufInput.close();
			}
		
		catch (IOException e){
				e.printStackTrace();
			}
		}
		}
	




