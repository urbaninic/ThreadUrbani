/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadesercitazionecs;

/**
 *
 * @author nicou
 */
public class StartServer {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Server srv;
        srv = new Server(2000);
        srv.inAscolto();
        srv.scrivi("benvenuto client");
        // commento1
    }
    
}
