package actividad02apg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Actividad02APG {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        
        int i,u, opcion_APG, recipiente_APG ;
        double litros_APG = 0,suma = 0;
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
                    
                    do {
                    
                    System.out.println("Introduce el número de recipiente");
                    
                    try {
                    recipiente_APG = Integer.parseInt(br.readLine());
                    }catch (Exception e){
                        System.out.println("No puede contener letras");
                        recipiente_APG = 0;
                    }
                    if ((recipiente_APG < 0) || (recipiente_APG > 4)){
                        
                        System.out.println("El valor tiene que ser entre 0 y 4");
                        
                    }
                    }  while ((recipiente_APG < 0) || (recipiente_APG > 4));
                               
                    
                    
                  do {
                    
                    System.out.println("Introduce litros a añadir:");
                    
                   try {
                    litros_APG = Double.parseDouble(br.readLine());
                    
                   }catch (Exception e){
                  
                     
                        System.out.println("No puede contener letras");
                     
                        litros_APG = 0;
                   }
                   if ((litros_APG) < 0)  {
                   
                       System.out.println("el valor introducido no puede ser negativo");
                   }
                   if ((recipientes_APG[recipiente_APG]+litros_APG)<0){
                       System.out.println("No puede existir valores negativos");
                   }
                   
                  }while (((litros_APG) < 0)||((recipientes_APG[recipiente_APG]+litros_APG)<0));
                           
                    recipientes_APG[recipiente_APG]+=litros_APG;
                    
                     
                            
                    
                    for(u=0;u<recipientes_APG.length;u++) {
                        System.out.println("El recipiente " + u + " tiene: " + recipientes_APG[u]);
                        
                    }
                  
                    break;

                case 2:
                    
                    
                 do {
                    
                    System.out.println("Introduce el número de recipiente");
                    
                    try {
                    recipiente_APG = Integer.parseInt(br.readLine());
                    }catch (Exception e){
                        System.out.println("No puede contener letras");
                        recipiente_APG = 0;
                    }
                    if ((recipiente_APG < 0) || (recipiente_APG > 4)){
                        
                        System.out.println("El valor tiene que ser entre 0 y 4");
                        
                    }
                    }  while ((recipiente_APG < 0) || (recipiente_APG > 4));
                   
                   
                     
                    
                  do {
                    
                    System.out.println("Introduce litros a quitar:");
                    
                   try {
                    litros_APG = Double.parseDouble(br.readLine());
                    
                   }catch (Exception e){
                  
                     
                        System.out.println("No puede contener letras");
                     
                        litros_APG = 0;
                   }
                   if ((litros_APG) < 0)  {
                   
                       System.out.println("el valor introducido no puede ser negativo");
                   }
                   if ((recipientes_APG[recipiente_APG]-litros_APG)<0){
                       System.out.println("No puede existir valores negativos");
                   }
                   
                  }while (((litros_APG) < 0)||((recipientes_APG[recipiente_APG]-litros_APG)<0));
                           
                    recipientes_APG[recipiente_APG]-=litros_APG;
                    
              
                    
                    for(u=0;u<recipientes_APG.length;u++) {
                        System.out.println("El recipiente " + u + " tiene: " + recipientes_APG[u]);
                        
                    }
                  
                    break;
                
                case 3:
                
        
                    
                    for(i=0;i<recipientes_APG.length;i++) {
                        System.out.println("El recipiente " + 1 + " tiene: " + recipientes_APG[i]);
                        suma = suma + recipientes_APG[i];
                        
                                            }
                    
                      System.out.println("suma total: " + suma );
          
                     
     
                    break;
                
                    
                default:
                    System.out.println("Valor no válido");

            }
        } while (opcion_APG !=0);

    }

}
