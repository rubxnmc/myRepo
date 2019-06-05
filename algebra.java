/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piftercercortealgebra;

import java.util.Scanner;

/**
 *
 * @author CLARIVEL OSPINA
 */
public class PIFTercerCorteAlgebra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ENTRADA = new Scanner(System.in);
        System.out.println("\n***VECTORES Y PUNTOS***");
        System.out.println("****PULSAR F6 PARA QUE EMPIECE EL PROGRAMA*******");
        System.out.println("--Favor leer bien las opciones para que ejecuten correctamente los resultados--");
    
        int m = 1;
        while (m != 0) {
            System.out.println("");
            System.out.println("***MENU***");
            System.out.println("1: Ejercicios con un vector y un punto.");
            System.out.println("2: Ejercicios con dos puntos.");
            System.out.println("3: Ejercicios con dos vectores.");
            System.out.println("0: Salir del programa.");
            System.out.print("\nIngrese la opcion:");
            m = ENTRADA.nextInt();
            while (m != 1 && m != 2 && m != 3 && m != 0) {
                System.err.println("!!Opcion invalida!!");
                System.out.println("\n***MENU***");
                System.out.println("1: Ejercicios con un vector y un punto.");
                System.out.println("2: Ejercicios con dos puntos.");
                System.out.println("3: Ejercicios con dos vectores.");
                System.out.println("0: Salir del programa.");
                System.out.print("\nIngrese la opcion:");
                m = ENTRADA.nextInt();
            }
            if (m == 1) {
                int x = 1;
                while (x != 0) {
                    System.out.println("\n*Ejercicios con un vector y un punto*");
                    System.out.print("Ingrese el tamaño del vector(2 o 3): ");
                    int n = ENTRADA.nextInt();
                    while (n != 2 && n != 3) {
                        System.err.print("Tamaño incorrecto!! ingrese nuevamente (2 o 3): ");
                        n = ENTRADA.nextInt();
                    }
                    int[] vector = new int[n];
                    int[] punto = new int[n];
                    String equis2;
                    String equis3;
                    System.out.print("Ingrese un vector separado por comas ( , ) : ");
                    String v = ENTRADA.next();
                    String[] partes = v.split(",");
                    for (int i = 0; i < n; i++) {
                        vector[i] = Integer.parseInt(partes[i]);
                    }
                    System.out.print("Ingrese un punto separado por comas ( , ) : ");
                    String point = ENTRADA.next();
                    String[] parte = point.split(",");
                    for (int i = 0; i < n; i++) {
                        punto[i] = Integer.parseInt(parte[i]);
                    }
                    int sub = 1;
                    while (sub != 0) {
                        System.out.println("\n--Submenu ejercicios con un vector y un punto--");
                        System.out.println("1: Hallar la ecuacion normal.");
                        System.out.println("2: Hallar la ecuacion general.");
                        System.out.println("3: Hallar la ecuacion vectorial.");
                        System.out.println("4: Hallar la ecuacion parametrica.");
                        System.out.println("5: Resolver todo lo anterior");
                        System.out.println("0: Salir del submenu");
                        System.out.print("\nIngrese la opcion:");
                        sub = ENTRADA.nextInt();
                        x = sub;
                        while (x != 1 && x != 2 && x != 3 && x != 4 && x != 5 && x != 0) {
                            System.err.println("!!opcion invalida!!");
                            System.out.println("\n--Submenu ejercicios con un vector y un punto--");
                            System.out.println("1: Hallar la ecuacion normal.");
                            System.out.println("2: Hallar la ecuacion general.");
                            System.out.println("3: Hallar la ecuacion vectorial.");
                            System.out.println("4: Hallar la ecuacion parametrica.");
                            System.out.println("5: Resolver todo lo anterior");
                            System.out.println("0: Salir del submenu");
                            System.out.print("\nIngrese la opcion:");
                            sub = ENTRADA.nextInt();
                            x = sub;
                        }
                        if (x == 1 || x == 5) {
                            System.out.println("\n**ECUACION NORMAL**");
                            if (n == 2) {
                                equis2 = "x   y";
                                for (int i = 0; i < n; i++) {
                                    System.out.print("[" + vector[i] + "]");
                                }
                                System.out.print(" * [" + equis2 + "]   =   ");
                                for (int i = 0; i < n; i++) {
                                    System.out.print("[" + vector[i] + "]");
                                }
                                System.out.print(" * ");
                                for (int i = 0; i < n; i++) {
                                    System.out.print("(" + punto[i] + ")");
                                }
                                System.out.println("");
                            }
                            if (n == 3) {
                                equis3 = "x  y  z";
                                for (int i = 0; i < n; i++) {
                                    System.out.print("[" + vector[i] + "]");
                                }
                                System.out.print(" * [" + equis3 + "] = ");
                                for (int i = 0; i < n; i++) {
                                    System.out.print("[" + vector[i] + "]");
                                }
                                System.out.print(" * ");
                                for (int i = 0; i < n; i++) {
                                    System.out.print("(" + punto[i] + ")");
                                }
                                System.out.println("");
                            }
                            System.out.println("--Ecuacion nornal se representa asi:  n . x = n . p   ");
                        }//Ecuacion Normal
                        if (x == 2 || x == 5) {
                            System.out.println("\n**ECUACION GENERAL**");

                            if (n == 2) {
                                String equisdos[] = new String[n];
                                equisdos[0] = "x";
                                equisdos[1] = "y";
                                for (int i = 0; i < n; i++) {
                                    System.out.print("   " + vector[i] + "" + equisdos[i]);
                                }
                                System.out.print("  =  ");
                                int sumatoria = 0;
                                for (int i = 0; i < n; i++) {
                                    sumatoria = sumatoria + punto[i];
                                }
                                System.out.print(sumatoria);

                            }
                            if (n == 3) {
                                String equistres[] = new String[n];
                                equistres[0] = "x";
                                equistres[1] = "y";
                                equistres[2] = "z";
                                for (int i = 0; i < n; i++) {
                                    System.out.print("   " + vector[i] + "" + equistres[i]);
                                }
                                System.out.print("  =  ");
                                int sumatoria = 0;
                                for (int i = 0; i < n; i++) {
                                    sumatoria = sumatoria + punto[i];
                                }
                                System.out.print(sumatoria);
                            }
                            System.out.println("");
                            System.out.println("--La ecuacion general es la solucion por medio de un producto de la ecuacion normal--");
                        }//Ecuacion general
                        if (x == 3 || x == 5) {
                            System.out.println("\n**ECUACION VECTORIAL**");
                            if (n == 2) {
                                String equis[] = new String[n];
                                equis[0] = "x";
                                equis[1] = "y";

                                for (int i = 0; i < n; i++) {
                                    System.out.print(" " + equis[i] + " ");
                                }
                                System.out.print(" =  (");
                                for (int i = 0; i < n; i++) {
                                    System.out.print(" " + punto[i] + " ");
                                }
                                System.out.print(")  + ");
                                System.out.print(" t  [ ");
                                for (int i = 0; i < n; i++) {
                                    System.out.print(" " + vector[i] + " ");
                                }
                                System.out.println("]");
                            }
                            if (n == 3) {
                                String equis[] = new String[n];
                                equis[0] = "x";
                                equis[1] = "y";
                                equis[2] = "z";
                                for (int i = 0; i < n; i++) {
                                    System.out.print(" " + equis[i] + " ");
                                }
                                System.out.print(" =  (");
                                for (int i = 0; i < n; i++) {
                                    System.out.print(" " + punto[i] + " ");
                                }
                                System.out.print(")  + ");
                                System.out.print(" t  [ ");
                                for (int i = 0; i < n; i++) {
                                    System.out.print(" " + vector[i] + " ");
                                }
                                System.out.println("]");
                            }
                            System.out.println("--La ecuacion vectorial se representa asi: x = punto +  t [vector] ");
                        }//Ecuacion Vetorial
                        if (x == 4 || x == 5) {
                            System.out.println("\n**ECUACION PARAMETRICA**");
                            if (n == 2) {
                                String x2[] = new String[n];
                                x2[0] = "x";
                                x2[1] = "y";
                                for (int i = 0; i < n; i++) {
                                    System.out.print("" + x2[i] + " = " + punto[i] + " + " + vector[i] + "" + "t     ");
                                }
                                System.out.println("");
                            }
                            if (n == 3) {
                                String x3[] = new String[n];
                                x3[0] = "x";
                                x3[1] = "y";
                                x3[2] = "y";
                                for (int i = 0; i < n; i++) {
                                    System.out.print("" + x3[i] + " = " + punto[i] + " + " + vector[i] + "" + "t     ");
                                }
                                System.out.println("");
                            }
                            System.out.println("--La ecuacion parametrica es la solucion de la ecuacion vectorial--");
                        }//Ecuacion vectorial
                        if (x == 0) {
                            System.out.println("Retornando al menu principal...");
                        }
                    }
                }
            }//Fin ejercicios con un vector y un punto.
            if (m == 2) {
                int x = 1;
                while (x != 0) {
                    System.out.println("\n*Ejercicios con dos puntos*");
                    System.out.print("Ingrese el tamaño de los puntos(2 o 3): ");
                    int n = ENTRADA.nextInt();
                    while (n != 2 && n != 3) {
                        System.err.print("Tamaño incorrecto!! ingrese nuevamente (2 o 3): ");
                        n = ENTRADA.nextInt();
                    }
                    int[] punto1 = new int[n];
                    int[] punto2 = new int[n];
                    System.out.print("Ingrese un punto separado por comas ( , ) : ");
                    String point = ENTRADA.next();
                    String[] partes = point.split(",");
                    for (int i = 0; i < n; i++) {
                        punto1[i] = Integer.parseInt(partes[i]);
                    }
                    System.out.print("Ingrese un punto separado por comas ( , ) : ");
                    String point1 = ENTRADA.next();
                    String[] parte = point1.split(",");
                    for (int i = 0; i < n; i++) {
                        punto2[i] = Integer.parseInt(parte[i]);
                    }
                    int sub = 1;
                    while (sub != 0) {
                        System.out.println("");
                        System.out.println("--Submenu ejercicios con dos puntos--");
                        System.out.println("\n1: Hallar el vector director");
                        System.out.println("2: Distancia entre los puntos.");
                        System.out.println("3: Resolver todo lo anterior");
                        System.out.println("0: Salir del submenu.");
                        System.out.print("\n Ingrese la opcion: ");
                        sub = ENTRADA.nextInt();
                        x = sub;
                        while (x != 0 && x != 1 && x != 2 && x != 3) {
                            System.err.println("!!opcion invalida!!");
                            System.out.println("");
                            System.out.println("--Submenu ejercicios con dos puntos--");
                            System.out.println("\n1: Hallar el vector director");
                            System.out.println("2: Distancia entre los puntos.");
                            System.out.println("3: Resolver todo lo anterior");
                            System.out.println("0: Salir del submenu.");
                            System.out.print("\n Ingrese la opcion: ");
                            sub = ENTRADA.nextInt();
                            x = sub;
                        }
                        if (x == 1 || x == 3) {
                            System.out.println("\n***VECTOR DIRECTOR***");
                            int vectordirector[] = new int[n];
                            for (int i = 0; i < vectordirector.length; i++) {
                                vectordirector[i] = punto2[i] - punto1[i];
                            }
                            System.out.print("[");
                            for (int i = 0; i < vectordirector.length; i++) {
                                System.out.print(vectordirector[i] + " , ");
                            }
                            System.out.print("] ");
                        }//Fin vector director
                        if (x == 2 || x == 3) {
                            System.out.println("\n**DISTANCIA ENTRE DOS PUNTOS**");
                            double dist = 0, rest1[] = new double[n];
                            for (int i = 0; i < n; i++) {
                                rest1[i] = punto2[i] - punto1[i];
                                dist = dist + (Math.pow(rest1[i], 2));
                            }
                            dist = Math.sqrt(dist);
                            System.out.println("La distancia entre los puntos es de: " + dist);
                            System.out.println("La distancia entre dos puntos se saca de la sgte forma:  Raiz de( (x2-x1)^2 + (y2-y1)^2 )");
                        }//Fin distancia de dos puntos
                        if (x == 0) {
                            System.out.println("Retornando al menu principal...");
                        }
                    }
                }
            }//Fin ejercicios con dos puntos
            if (m == 3) {
                int x = 1;
                while (x != 0) {
                    System.out.println("\n*Ejercicios con dos vectores*");
                    System.out.print("Ingrese el tamaño de los vectores(2 o 3): ");
                    int n = ENTRADA.nextInt();
                    while (n != 2 && n != 3) {
                        System.err.print("Tamaño incorrecto!! ingrese nuevamente (2 o 3): ");
                        n = ENTRADA.nextInt();
                    }
                    int[] vector1 = new int[n];
                    int[] vector2 = new int[n];
                    System.out.print("Ingrese un vector separado por comas ( , ) : ");
                    String v1 = ENTRADA.next();

                    String[] partes = v1.split(",");
                    for (int i = 0; i < n; i++) {
                        vector1[i] = Integer.parseInt(partes[i]);
                    }
                    System.out.print("Ingrese un vector separado por comas ( , ) : ");
                    String v2 = ENTRADA.next();
                    String[] parte = v2.split(",");
                    for (int i = 0; i < n; i++) {
                        vector2[i] = Integer.parseInt(parte[i]);
                    }
                    int sub = 1;
                    while (sub != 0) {
                        System.out.println("");
                        System.out.println("-Submenu ejercicios con 2 vectores-");
                        System.out.println("\n1: Hallar la magnitud de los vectores.");
                        System.out.println("2:Suma de vectores.");
                        System.out.println("3:Resta de vectores.");
                        System.out.println("4:Multiplicacion de vectores/Producto Punto");
                        System.out.println("5:Resolver todo lo anterior");
                        System.out.println("0:Salir del submenu.");
                        System.out.print("\n Ingrese la opcion: ");
                        sub = ENTRADA.nextInt();
                        x = sub;
                        while (x != 1 && x != 2 && x != 3 && x != 4 && x != 5 && x != 0) {
                            System.err.println("!!opcion incorrecta!!");
                            System.out.println("-Submenu ejercicios con 2 vectores-");
                            System.out.println("\n1: Hallar la magnitud de los vectores.");
                            System.out.println("2:Suma de vectores.");
                            System.out.println("3:Resta de vectores.");
                            System.out.println("4:Multiplicacion de vectores/Producto Punto");
                            System.out.println("5:Resolver todo lo anterior");
                            System.out.println("0:Salir del submenu.");
                            System.out.print("\n Ingrese la opcion: ");
                            sub = ENTRADA.nextInt();
                            x = sub;
                        }
                        if (x == 1 || x == 5) {
                            System.out.println("\n***MAGNITUD DE CADA VECTOR***");
                            double magnitud1 = 0, magnitud2 = 0;
                            for (int i = 0; i < n; i++) {
                                magnitud1 = magnitud1 + Math.pow(vector1[i], 2);
                            }
                            magnitud1 = Math.sqrt(magnitud1);
                            for (int i = 0; i < n; i++) {
                                magnitud2 = magnitud2 + Math.pow(vector2[i], 2);
                            }
                            magnitud2 = Math.sqrt(magnitud2);

                            System.out.println("La magnitud del primer vector es: " + magnitud1);
                            System.out.println("La magnitud del segundo vector es " + magnitud2);
                            System.out.println("--La magnitud se halla por medio del teorema de pitagoras--");
                        }//Magnitud
                        if (x == 2 || x == 5) {
                            System.out.println("\n***SUMA DE VECTORES***");
                            int[] sumavectores = new int[n];
                            for (int i = 0; i < sumavectores.length; i++) {
                                sumavectores[i] = vector1[i] + vector2[i];
                            }
                            System.out.print("[ ");
                            for (int i = 0; i < sumavectores.length; i++) {
                                System.out.print("" + sumavectores[i] + " , ");
                            }
                            System.out.println("] ");
                            System.out.println("--se realiza sumando componente a componente del vector--");
                        }//Suma de vectores
                        if (x == 3 || x == 5) {
                            System.out.println("\n***RESTA DE VECTORES***");
                            int[] restavectores = new int[n];
                            for (int i = 0; i < restavectores.length; i++) {
                                restavectores[i] = vector1[i] - vector2[i];
                            }
                            System.out.print("[");
                            for (int i = 0; i < restavectores.length; i++) {
                                System.out.print("" + restavectores[i] + " , ");
                            }
                            System.out.println("]");
                            System.out.println("--se realiza restando componente a componente del vector--");
                        }//Resta de vectores
                        if (x == 4 || x == 5) {
                            System.out.println("\n***MULTIPLICACION DE VECTORES/PRODUCTO PUNTO***");
                            int[] multiplicacionvectores = new int[n];
                            int sumatoria = 0;
                            for (int i = 0; i < multiplicacionvectores.length; i++) {
                                multiplicacionvectores[i] = vector1[i] * vector2[i];
                                sumatoria = sumatoria + multiplicacionvectores[i];
                            }
                            System.out.println("[" + sumatoria + "] ");
                            System.out.println("--se realiza multiplicando componente a componente y luego sumando los resultados de dichos productos--");
                        }//Multiplicacion de vectores
                        if (x == 0) {
                            System.out.println("Retornando al menu principal...");
                        }
                    }
                }
            }//Fin ejercicios con dos vectores
            if (m == 0) {
                System.out.println("Saliendo del programa...");
            }
        }
    }//Fin del menu    
}//Fin del programa
