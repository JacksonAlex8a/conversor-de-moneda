package com.aluracursos.moneda;

import com.google.gson.annotations.SerializedName;

public class Moneda {

    //Atributos
    @SerializedName("base_code")
  private String nombreMoneda;

    @SerializedName("target_code")
  private String nombreMoneda2;

    @SerializedName("conversion_result")
  private double valorMoneda;

    //Getter
    public double getValorMoneda() {
        return valorMoneda;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public String getNombreMoneda2() { return nombreMoneda2; }


    @Override
    public String toString() {

        return "El valor a convertir de = [" + nombreMoneda + "], a = [" + nombreMoneda2 + "], es de = " + valorMoneda;
    }
}
