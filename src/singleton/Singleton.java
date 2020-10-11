/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author christian
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configs lol = Configs.getInstance();
        lol.setNome("babaca");
        lol.pessoaSelecionada();
    }
    
}
