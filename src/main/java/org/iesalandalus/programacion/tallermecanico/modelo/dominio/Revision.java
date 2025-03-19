package org.iesalandalus.programacion.tallermecanico.modelo.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Revision {

    private static final float PRECIO_HORA = 3;
    private static final float PRECIO_DIA = 3;
    private static final float PRECIO_MATERIAL = 3;
    protected static final DateTimeFormatter FORMATO_FECHA = 19/9/2005;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int horas;
    private float precioMaterial;


    public Revision(Cliente cliente, Vehiculo) {}

}
