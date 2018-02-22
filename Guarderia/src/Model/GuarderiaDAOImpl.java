package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GuarderiaDAOImpl implements GuarderiaDAO {
    DBConnection con = new DBConnection();
    ArrayList<Guarderia> guarderias;

    public GuarderiaDAOImpl() {
        con = new DBConnection();
    }
    
    
    
    @Override
    public ArrayList<String> getRifs() {
        Connection connection = con.connectToPostgres();
        ArrayList rifs = new ArrayList();
        String sql = "SELECT rif FROM Guarderia_4";
        try {
            Statement st;
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                rifs.add(rs.getString(1));
            }
            rs.close();
            st.close();
            connection.close();
        } catch(SQLException e) {
            System.out.println("Error");
            e.getStackTrace();
        }
        return rifs;
    }
    
    @Override
    public ArrayList<Guarderia> loadGuarderias() {
        Connection connection = con.connectToPostgres();
        ArrayList listaGuarderias = new ArrayList();
        Guarderia guarderia;
        String sql = "SELECT nombre " + 
                "FROM guarderia_4;";
        try {
            Statement st;
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                guarderia = new Guarderia();
                guarderia.setComboText(rs.getString(1));
                listaGuarderias.add(guarderia);
            }
            rs.close();
            st.close();
            connection.close();
        } catch(SQLException e) {
            System.out.println("Error: " + e);
        }
        return listaGuarderias;
    }
    
    @Override
    public Guarderia getDatosGuarderia(String rif) {
        Connection connection = con.connectToPostgres();
        Guarderia guarderia = new Guarderia();
        String sql = "SELECT horario_entrada, horario_salida FROM Guarderia_4 WHERE RIF = '" + rif + "';";
        try {
            Statement st;
            st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                guarderia.setHoraEntrada(rs.getTime(1));
                guarderia.setHoraSalida(rs.getTime(2));
            }
            rs.close();
            st.close();
            connection.close();
        } catch(SQLException e) {
            System.out.println("Error");
            e.getStackTrace();
        }
        return guarderia;
    }
    
    public void saveGuarderia(Guarderia guarderia) {
        Connection connection = con.connectToPostgres();
        String sql = "INSERT INTO guarderia_4 values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pps = connection.prepareCall(sql);
            pps.setString(1, guarderia.getRif());
            pps.setString(2, guarderia.getNombre());
            pps.setInt(3, guarderia.getCostoMensualidad());
            pps.setInt(4, guarderia.getCostoMulta());
            pps.setInt(5, guarderia.getConstoTransporte());
            pps.setInt(6, guarderia.getConstoTransporte());
            pps.setInt(7, guarderia.getCostoAgoDic());
            pps.setInt(8, guarderia.getCostoHoraExtra());
            pps.setTime(9, guarderia.getHoraEntrada());
            pps.setTime(10, guarderia.getHoraSalida());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos cargados satisfactoriamente");
            pps.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(LugarDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
