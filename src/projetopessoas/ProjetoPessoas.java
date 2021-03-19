
package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(18);
        
        
        p2.setCurso("Informatica"); //ainda não foi implementado 
        p3.setSalario(2500f); //ainda não foi implementado 
        p4.setSetor("Estoque"); //ainda não foi implementado 
        
        
        //p1.receberAumento(550.20f); //pessoa não recebe aumento, só professor
        //p2.mudarTrabalho(); //aluno não pode mudar trabalho, funcionário pode
        //p4.cancelarMatr(); //funcionario não pode cancelar matrícula, aluno pode
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
