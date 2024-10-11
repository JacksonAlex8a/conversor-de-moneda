package main;

import com.aluracursos.conexion.ConexionWeb;
import com.aluracursos.moneda.Moneda;

import java.util.*;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {

        //9ce9034a5fbf2a45de6e1d71

        Scanner t = new Scanner(System.in);

        int opciones = 0,numero = 0;

        String url;

        String Seleccion = """
                
                           1) Dólar -> Peso argentino
                           2) Peso argentino -> Dólar
                           3) Dólar -> Real brasileño
                           4) Real brasileño -> Dólar
                           5) Dólar -> Peso colombiano
                           6) Peso colombiano -> Dólar
                           7) Salir
                           """;

        while(opciones != 7 && opciones <= 7) {

            System.out.println(Seleccion);
            opciones = t.nextInt();

            ConexionWeb cnx = new ConexionWeb();

                    switch (opciones){

                case 1:

                    System.out.println("Indicame un valor de la moneda: ");
                    numero = t.nextInt();

                    url = cnx.url("USD","ARS",numero);

                    cnx.conexionApi(url);
                     break;

                case 2:

                    System.out.println("Indicame un valor de la moneda: ");
                    numero = t.nextInt();

                    url = cnx.url("ARS","USD",numero);
                    cnx.conexionApi(url);

                    break;

                case 3:
                    System.out.println("Indicame un valor de la moneda: ");
                    numero = t.nextInt();

                    url = cnx.url("USD","BRL",numero);
                    cnx.conexionApi(url);

                    break;

                case 4:

                    System.out.println("Indicame un valor de la moneda: ");
                    numero = t.nextInt();

                    url = cnx.url("BRL","USD",numero);
                    cnx.conexionApi(url);

                    break;
                case 5:

                    System.out.println("Indicame un valor de la moneda: ");
                    numero = t.nextInt();

                    url = cnx.url("USD","COP",numero);
                    cnx.conexionApi(url);

                    break;

                case 6:
                    System.out.println("Indicame un valor de la moneda: ");
                    numero = t.nextInt();

                    url = cnx.url("COP","USD",numero);
                    cnx.conexionApi(url);

                    break;
            }
        }
    }
}
