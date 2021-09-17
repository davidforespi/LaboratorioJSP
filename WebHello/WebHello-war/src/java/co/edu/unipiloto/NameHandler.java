/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author david
 */
public class NameHandler {

    private String name;
    private String edad;

    public NameHandler() {
        this.name = "";
        this.edad= "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        String ed;
        LocalDate ago = LocalDate.parse(edad, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate current = LocalDate.now();
        ed = String.valueOf(Period.between(ago, current).getYears());
        this.edad = ed ;
      
    }
}
