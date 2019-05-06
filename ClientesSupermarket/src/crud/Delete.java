package crud;

import javax.swing.JOptionPane;

public class Delete {
	static JOptionPane entrada = new JOptionPane();
	static JOptionPane saida = new JOptionPane();
	
	public static void Deletar() {
		String codigoBusca = "";
		codigoBusca = entrada.showInputDialog("Digite o codigo do cliente que deseja deletar:");
		
		for(int i=0;i<crud.Variaveis.QTDDISPO;i++) {
			if(codigoBusca.equals(crud.Variaveis.codigo[i])) {
				saida.showMessageDialog(saida, "Codigo encontrado");
				saida.showMessageDialog(saida,i);
				crud.Variaveis.indexcodigo = i;
			}
		 }
						crud.Variaveis.codigo[crud.Variaveis.indexcodigo]=null;
						crud.Variaveis.nome[crud.Variaveis.indexcodigo]=null;
						crud.Variaveis.email[crud.Variaveis.indexcodigo]=null;
						crud.Variaveis.cidade[crud.Variaveis.indexcodigo]=null;
						crud.Variaveis.uf[crud.Variaveis.indexcodigo]=null;
						saida.showMessageDialog(saida, "Codigo: "+codigoBusca+ " foi deletado com sucesso");
						crud.Variaveis.ncadastrados=crud.Variaveis.ncadastrados-1;	
		}
}
