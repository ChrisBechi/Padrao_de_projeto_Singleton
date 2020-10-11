package singleton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christian
 */
public class Configs {
    private String nome;
    private int idade;
    private double altura;
    
    private static Configs instance;
    
    private Configs(){
        this.nome = "cavalo";
        this.idade = 18;
        this.altura = 1.9;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public static synchronized Configs getInstance(){
        if(instance == null){
            instance = new Configs();
        }
        
        return instance;
    }
    
    public void pessoaSelecionada(){
        System.out.println("nome:"+nome+" - idade:"+idade+" - altura:"+altura);
    }
}
