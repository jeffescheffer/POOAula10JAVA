/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author Jefferson
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setIdade(30);
        p1.setSexo("M");
        
        p2.setNome("Maria");
        p2.setIdade(31);
        p2.setSexo("F");
        p2.setMat(45678);
        p2.setCurso("Direito");
        p2.cancelarMat();
        
        p3.setNome("Claudio");
        p3.setIdade(32);
        p3.setSexo("M");
        p3.setEspecialidade("Civil");
        p3.setSalario(7000);
        
        p4.setNome("Fabiana");
        p4.setIdade(33);
        p4.setSexo("F");
        p4.setSetor("Almoxarifado");
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
