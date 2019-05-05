package crud;

import javax.swing.JOptionPane;

public class Read {
static JOptionPane entrada = new JOptionPane();
static JOptionPane saida = new JOptionPane();
	
	
	public static void Consulta() {
		String codigoBusca = "";
		codigoBusca = entrada.showInputDialog("Digite o codigo que deseja procurar:");
		
		for(int i=0;i<crud.Variaveis.QTDDISPO;i++) {
			if(codigoBusca.equals(crud.Variaveis.codigo[i])) {
				saida.showMessageDialog(saida,"Codigo: "+crud.Variaveis.codigo[i]+
											  "\nNome: "+crud.Variaveis.nome[i]+
											  "\nEmail: "+crud.Variaveis.email[i]+
											  "\nCidade: "+crud.Variaveis.cidade[i]+
											  "\nUF: "+crud.Variaveis.uf[i]);
				break;
			}
		}
	}
}
