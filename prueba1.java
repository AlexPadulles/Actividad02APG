
 
package actividad02apg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prueba1 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        
        int i,u, opcion_APG, recipiente_APG ;
        double litros_APG,suma = 0;
        double[] recipientes_APG = new double[5];
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        for(i=0;i<recipientes_APG.length;i++) {
            recipientes_APG[i]=0.0;
        }

       /*for(i=0;i<recipientes_APG.length;i++) {
            System.out.println("El recipiente " + i + " tiene: " + recipientes_APG[1]);
        }*/
        do {
            
            System.out.println("Las opciones de la máquina son: ");
            System.out.println("1. Rellenar refresco");
            System.out.println("2. Quitar refresco");
            System.out.println("3. Saber cuanto refresco tenemos");
            System.out.println("0. Finalizar ");
            System.out.println("Elige una opción : ");
            
            
            
            
            try {
                opcion_APG = Integer.parseInt(br.readLine());
            }catch (Exception e) {
                opcion_APG=-1;

            }
            switch (opcion_APG) {
                
                case 0:
                    
                    System.out.println("Programa finalizado.");
                     break;
                     
                case 1:
                    
                    System.out.println("Introduce el número de recipiente");
                   recipiente_APG = Integer.parseInt(br.readLine());
                    
                
                    
                    System.out.println("Introduce litros a añadir:");
                    litros_APG = Double.parseDouble(br.readLine());
                            
                   // if (litros_APG = 0)
                    
                   
                  
                    recipientes_APG[recipiente_APG]+=litros_APG;
                    
                {
                    
                    for(u=0;u<recipientes_APG.length;u++) {
                        System.out.println("El recipiente " + u + " tiene: " + recipientes_APG[u]);
                        
                    }
                }
                    break;

                case 2:
                    
                    
                System.out.println("Introduce el número de recipiente");
                   recipiente_APG = Integer.parseInt(br.readLine());
                    
                
                   
                    System.out.println("Introduce litros a quitar:");
                    litros_APG = Double.parseDouble(br.readLine());
                  
                    recipientes_APG[recipiente_APG]-=litros_APG;
                    
                    
                 
                {
                    
                    for(u=0;u<recipientes_APG.length;u++) {
                        System.out.println("El recipiente " + u + " tiene: " + recipientes_APG[u]);
                    
                    }
                }   
                  break;
                
                case 3:
                
        
                    
                    for(i=0;i<recipientes_APG.length;i++) {
                        
                        suma = suma + recipientes_APG[i];
                                            }
                    
                      System.out.println("suma total " + suma );
          
                     
     
                    break;
                
                    
                default:
                    System.out.println("Valor no válido");

            }
        } while (opcion_APG !=0);

    }

}


