import javax.swing.JOptionPane;

public class resultadoAluno {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
      double media = 0;
      double valor = Double.parseDouble (
    		  JOptionPane .showInputDialog(null,"nota 1"));
      double valor2 = Double.parseDouble(
    		  JOptionPane.showInputDialog(null,"nota 2"));
      media= (valor + valor2) /2;
    		   
    if (media >=6) { JOptionPane.showMessageDialog(null, "aluno aprovado");
    
    }else if (media<6) { JOptionPane.showMessageDialog(null, "aluno reprovado");
    
    }
      
    
       ;
      

      
	
	
	
	
	
	
	}

}
