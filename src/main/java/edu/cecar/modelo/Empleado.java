/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Clase: empleado
 *
 * @version: 0.1
 *
 * @since: 21/10/2019
 *
 * Fecha de Modificación:
 *
 * @author: Rafael Avila Llorente
 *
 * Copyrigth: CECAR
 */
package edu.cecar.modelo;

import java.sql.Date;

/**
 *
 * Clase
 */
public class Empleado {

    private int identificacion;
    private String nombrescompletos;
    private String fechanacimiento;
    private String direccionresidencia;
    private String departamento_oficina;
    private int salario;

    public Empleado() {
    }

    public Empleado(int identificacion, String nombrescompletos, String fechanacimiento, String direccionresidencia, String departamento_oficina, int salario) {
        this.identificacion = identificacion;
        this.nombrescompletos = nombrescompletos;
        this.fechanacimiento = fechanacimiento;
        this.direccionresidencia = direccionresidencia;
        this.departamento_oficina = departamento_oficina;
        this.salario = salario;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombrescompletos() {
        return nombrescompletos;
    }

    public void setNombrescompletos(String nombrescompletos) {
        this.nombrescompletos = nombrescompletos;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getDireccionresidencia() {
        return direccionresidencia;
    }

    public void setDireccionresidencia(String direccionresidencia) {
        this.direccionresidencia = direccionresidencia;
    }

    public String getDepartamento_oficina() {
        return departamento_oficina;
    }

    public void setDepartamento_oficina(String departamento_oficina) {
        this.departamento_oficina = departamento_oficina;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
