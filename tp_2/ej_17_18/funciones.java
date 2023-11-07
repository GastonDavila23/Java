//En la clase FuncionesPrograma codifique una función estática que reciba como parámetro 3 valores enteros,
//día, mes, anio y retorne la fecha de tipo Date correspondiente.
//public static Date getFechaDate(int día, int mes, int anio){
//……….
//}
//En la clase Principal creada en el punto anterior haga uso de la función getFechaDate.
//
package ej_17_18;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class funciones {

    public static String getFechaString(Date fecha) {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaString = formato.format(fecha);
        return fechaString;
    }

    public static Date getFechaDate(int dia, int mes, int anio){
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes - 1, dia);
        Date fecha = calendar.getTime();

        return fecha;
    }
}
