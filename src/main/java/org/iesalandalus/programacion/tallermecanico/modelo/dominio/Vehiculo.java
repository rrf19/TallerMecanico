package org.iesalandalus.programacion.tallermecanico.modelo.dominio;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public record Vehiculo() {

    private static final String ER_MARCA = "ADF";
    private static final String ER_MATRICULA = "\\d{4}[A-Z]{3}";
    private static String marca;
    private static String modelo = ;
    private static String matricula;

    public Vehiculo(String marca, String modelo, String matricula){
        this.marca =
    }

    private void validarMarca(String marca){
        Objects.requireNonNull(marca, "La marca no puede ser nula");
        Pattern patron = Pattern.compile(ER_MARCA);
        Matcher comparador = patron.matcher(marca);
        if(!comparador.matches()){
            throw new IllegalArgumentException("La marca no puede ser nula");
        } else {
            this.marca = marca;
        }
    }

    private void validarModelo(String modelo){
        Objects.requireNonNull(modelo, "El modelo no puede ser nulo");
        Pattern patron = Pattern.compile(modelo);
        Matcher comparador = patron.matcher(modelo);
        if(!comparador.matches()){
            throw new IllegalArgumentException("El modelo no puede ser nulo");
        } else {
            this.modelo = modelo;
        }
    }
}
