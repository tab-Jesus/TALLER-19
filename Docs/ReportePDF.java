/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller19.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
       
        System.out.println("GENERANDO PDF");
        
        System.out.println("COSAS DEL PDF: " + datos);
    }
    
    
}