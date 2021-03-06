/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.JDAddJuegoNino;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fercon997
 */
public class JuegoNinoController {
    JDAddJuegoNino vistaJN;

    public JuegoNinoController(JDAddJuegoNino vistaJN) {
        this.vistaJN = vistaJN;
    }
    
    public void agregarJuego(JTable tabla, Nino kid){
        try{
            int codigoJuego = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
            Juego_Nino gamesKid = new Juego_Nino();
            gamesKid.setCodigoJuego(codigoJuego);
            gamesKid.setCiRepresentante(kid.getCiRepresentante());
            gamesKid.setLetraNino(kid.getLetra());
            Juego_NinoDAOImpl bdGamesKid = new Juego_NinoDAOImpl();
            bdGamesKid.insertarJuegoNino(gamesKid);
            JOptionPane.showMessageDialog(vistaJN, "Datos cargados satisfactoriamente");
        } catch(Exception e){
            Logger.getLogger(JuegoNinoController.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(vistaJN, "Error");
        }
         vistaJN.agregarBtn.setEnabled(false);
    }
    
    public void loadJuegos(JTable tabla){
        DefaultTableModel modeloTabla = (DefaultTableModel)tabla.getModel();
        for (int i = modeloTabla.getRowCount() -1; i >=0; i--)
          modeloTabla.removeRow(i);
        Object[] columna = new Object[2];
        try{
             JuegoDAOImpl bdGames = new JuegoDAOImpl();
            ArrayList<Juego> games = bdGames.getJuegos();
            for(int i = 0; i<games.size(); i++){
                System.out.println(games.get(i).getCodigo());
                columna[0] = games.get(i).getCodigo();
                columna[1] = games.get(i).getNombre();
                modeloTabla.addRow(columna);
            }
        } catch(Exception e){
            for (int i = modeloTabla.getRowCount() -1; i >=0; i--)
                modeloTabla.removeRow(i);   
        }
    }
    
    public void loadJuegosNino(JTable tabla, Nino kid){
        DefaultTableModel modeloTabla = (DefaultTableModel)tabla.getModel();
        for (int i = modeloTabla.getRowCount() -1; i >=0; i--)
          modeloTabla.removeRow(i);
        Juego_NinoDAOImpl bdGamesKid = new Juego_NinoDAOImpl();
        ArrayList<Juego> gamesKid = bdGamesKid.getJuegosNino(kid);
        Object[] columna = new Object[2];
        try{
            for(int i = 0; i<gamesKid.size(); i++){
                columna[0] = gamesKid.get(i).getCodigo();
                columna[1] = gamesKid.get(i).getNombre();
                modeloTabla.addRow(columna);
            }
        } catch(Exception e) {
            for (int i = modeloTabla.getRowCount() -1; i >=0; i--)
          modeloTabla.removeRow(i);

        }
    }
    
    public void deleteJuegoNino(JTable tabla, Nino kid){
        int codigo = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)) );
        int confirmacion = JOptionPane.showConfirmDialog(vistaJN, "Está seguro que quiere borrar este Juego?","Borrar Juego", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (confirmacion == JOptionPane.YES_OPTION){
                try{
                    Juego_NinoDAOImpl bdGameKid = new Juego_NinoDAOImpl();
                    bdGameKid.deleteJuego(kid, codigo);
                    JOptionPane.showMessageDialog(vistaJN, "Borrado");
                    loadJuegosNino(tabla, kid);
                } catch(Exception e){
                    Logger.getLogger(GuarderiaController.class.getName()).log(Level.SEVERE, null, e);
                    JOptionPane.showMessageDialog(vistaJN, "No se puede borrar");
                }
            }
            vistaJN.eliminarBtn.setEnabled(false);
    }
    
    
}
