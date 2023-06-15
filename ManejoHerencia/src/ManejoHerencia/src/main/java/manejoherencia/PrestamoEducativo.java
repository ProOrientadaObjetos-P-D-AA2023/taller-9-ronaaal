/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoherencia;

/**
 *
 * @author UTPL
 */
public class PrestamoEducativo extends Prestamo {
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPagoPrestamoCarrera;

    public PrestamoEducativo(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo, String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera) {
        super (beneficiario, tiempoPrestamoMeses, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        this.valorMensualPagoPrestamoCarrera = (valorCarrera / tiempoPrestamoMeses) * 0.9;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public double getValorMensualPagoPrestamoCarrera() {
        return valorMensualPagoPrestamoCarrera;
    }

    
    @Override
    public void setCiudadPrestamo(String ciudadPrestamo) {
        super.setCiudadPrestamo(ciudadPrestamo.toUpperCase());
    }

    @Override
    public String toString() {
        return  "Nivel de estudio: " + nivelEstudio +
                "\nCentro educativo: " + centroEducativo +
                "\nValor de la carrera: " + valorCarrera +
                "\nValor mensual del pago del préstamo del valor de la carrera: " + valorMensualPagoPrestamoCarrera;
    }
}
