/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class testaConexao {
    
    public static void main(String[] args) {
        
         try {
             
             new ConnectionFactory().getConnection();
             JOptionPane.showMessageDialog(null, "Conectado com sucesso!");             
         } catch (HeadlessException erro) {
              JOptionPane.showMessageDialog(null, "Ops aconteceu o erro: "  + erro);    
         }
         
         
     }
}
