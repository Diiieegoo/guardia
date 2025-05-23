package logica;

import java.time.LocalDate;

import utiles.Sexo;

public class Trabajador extends Persona{
    //Atributos
    private LocalDate fechaDeIncorporacion;
    //Constructor
    public Trabajador(String ci,String nombre,Sexo sexo,boolean activo,LocalDate fechaDeIncorporacion,int cantidadGuardias){
        super(ci, nombre, sexo, activo, cantidadGuardias);
        setFechaDeIncorporacion(fechaDeIncorporacion);
    }
    //Getters y setters
    public void setFechaDeIncorporacion(LocalDate fechaDeIncorporacion){
        this.fechaDeIncorporacion = fechaDeIncorporacion;
    }

    public LocalDate getFechaDeIncorporacion(){
        return fechaDeIncorporacion;
    }

    //Metodos
}
