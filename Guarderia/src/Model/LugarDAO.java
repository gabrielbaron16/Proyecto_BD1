/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author fercon997
 */
public interface LugarDAO {
    public void insertLugar(Lugar lugar);
    public Lugar getDatosLugar(String rif);
}
