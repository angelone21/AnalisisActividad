/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Clase: Gestionarempleado
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
package edu.cecar.controladores;

import edu.cecar.componentes.singletons.SingletonConexionDB;
import edu.cecar.modelo.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * Clase
 */
public class ControladorGestionarEmpleado {

    public void GestionarEmpleado(Empleado empleado, String opcion) throws SQLException {

        PreparedStatement preparedStatement = SingletonConexionDB.getInstance().prepareStatement("call procedure(?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, empleado.getIdentificacion());
        preparedStatement.setString(2, empleado.getNombrescompletos());
        preparedStatement.setString(3, empleado.getFechanacimiento());
        preparedStatement.setString(4, empleado.getDireccionresidencia());
        preparedStatement.setString(5, empleado.getDepartamento_oficina());
        preparedStatement.setInt(6, empleado.getSalario());
        preparedStatement.setString(7, opcion);
        preparedStatement.execute();
    }

    public Empleado consultarEmpleado(Empleado empleado) throws SQLException {
        Empleado resultado = null;
        PreparedStatement preparedStatement = SingletonConexionDB.getInstance().prepareStatement("call gestionarpersona(?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, empleado.getIdentificacion());
        preparedStatement.setString(2, empleado.getNombrescompletos());
        preparedStatement.setString(3, empleado.getFechanacimiento());
        preparedStatement.setString(4, empleado.getDireccionresidencia());
        preparedStatement.setString(5, empleado.getDepartamento_oficina());
        preparedStatement.setInt(6, empleado.getSalario());
        preparedStatement.setString(7, "consultar");
        ResultSet result = preparedStatement.executeQuery();
        if(result.next()){
            resultado = new Empleado(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getInt(6));
        }
        return resultado;
    }

}
