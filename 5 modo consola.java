paquete  queuex ;

import  java.util.LinkedList ;
import  java.util.Queue ;
import  java.util.Scanner ;
Todos los derechos reservados
 *
 * @author junior loor
 * /
public  class  QueueX {

     cadena privada n;
     teclado de escáner privado ;
     cola cola privada ;
    private  String valorBuscado;

                public   QueueX () {
                esta . cola =  nuevo  LinkedList ();
                }
         
                                    // METODO PARA INSERTAR EN QUEUE
                                    public  void  insertarQueue () {
                                    teclado =  nuevo  Escáner ( System . in);
                                    Sistema . a cabo . println ( " Ingrese dato: " );
                                    n = teclado . siguiente();
                                    esta . Cola . añadir (n);
                                    }
                                    // METODO PARA IMPRIMIR TODA LA COLA QUEUE
                                    public  void  imprimirQueue () {
                                    esta . Cola . ojeada();
                                    Sistema . a cabo . println ( " El elemento de la cabezera del queso es: " + cola);
                                    }
                                    // METODO PARA IMPRIMIR CABEZERA QUEUE
                                    public  void  imprimirCabezeraQueue () {
                                    esta . Cola . ojeada();
                                    Sistema . a cabo . println ( " El Elemento de la cabezera del COLA es: " + cola . peek ());
                                    }
                                    // METODO PARA VACIAR QUEUE
                                    public  void  vaciarQueue () {
                                    Cola . claro();
                                    Sistema . a cabo . println ( "¡ Se ha eliminado la cola, COLA VACIA! " );
                                    }
                                    // METODO PARA BUSCAR EN QUEUE
                                    public  void  buscarQueue () {
                                    Sistema . a cabo . println ( " INGRESAR ELEMENTO A BUSCAR EN QUEUE " );
                                    teclado =  nuevo  Escáner ( System . in);
                                    valorBuscado = teclado . siguiente();
                                    si (refresco de cola . contiene (valorBuscado)) {
                                    Sistema . a cabo . println ( " El elemento si se encuentra en la cola " );
                                    }
                                    else {
                                     Sistema . a cabo . println ( " El elemento no se encuentra en la cola " );
                                    }
                                    }
    
    
    public  static  void  Menú () {
        Sistema . a cabo . println ( " \ n \ n \ t \ t \ t ================ MENU QUEUE ================= " ) ;
        Sistema . a cabo . println ( " \ t \ t \ t = = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 1 - INSERTAR ELEMENTO A LA COLA QUEUE = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 2 - MOSTRAR TODOS LOS ELEMENTOS DE QUEUE = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 3 MOSTRAR CABEZERA DEL QUEUE = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 4 - VACIAR TODA LA COLA QUEUE = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 5- BUSCAR ELEMENTO EN QUEUE = " );
        Sistema . a cabo . println ( " \ t \ t \ t = 6 SALIR = " );
        Sistema . a cabo . println ( " \ t \ t \ t ========================================= ====== " );
        Sistema . a cabo . imprimir ( " \ t \ t \ t Ingrese Opcion: " );
    }
   
    public  static  void  main ( String [] args ) {
        // TODO codifica la lógica de la aplicación aquí
       QueueX xxx =  nueva  QueueX ();
       Scanner teclado = nuevo  Escáner ( System . In );
       Queue cola = nuevo  LinkedList (); // Usamos LinkedList o creamos la cola
         String dato;
         int opcion;
         
           hacer {
       
                     Menú();
                     opcion = teclado . nextInt ();
                 switch (opcion) {
                   caso  1 :
                       // CODIGO PARA INGRESAR EN QUEUE
                       xxx . inserttarQueue ();
                       romper ;
                   Caso  2 :
                       // CODIGO PARA IMPRIMIR QUEUE
                       xxx . imprimirQueue ();
                       romper ;
                       
                   caso  3 :
                       // CODIGO PARA IMPRIMIR CABEZERA QUEUE
                       xxx . imprimirCabezeraQueue ();
                       romper ;
                   caso  4 :
                       // CODIGO PARA VACIAR TODO QUEUE
                       xxx . vaciarQueue ();
                       romper ;
                   caso  5 :
                       // CODIGO PARA BUSCAR EN QUEUE
                       xxx . buscarQueue ();
                       romper ;
                    caso  6 : 
                        // CODIGO PARA SALIR
                        Sistema . salida ( 1 );
                        romper ;
                      por defecto :
                        Sistema . a cabo . println ( " vuelva ingresar numero dentro del rango indicado " );
                        romper ;
           }
    } while (opcion ! = 6 );
        
           }
}
    