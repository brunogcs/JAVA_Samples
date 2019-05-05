package crud;

import javax.swing.JOptionPane;

public class ReadListar {
	static JOptionPane entrada = new JOptionPane();
	static JOptionPane saida = new JOptionPane();
		
		
		public static void Listar() {	
			for(int i=1;i<=crud.Variaveis.ncadastrados;i++) {
						saida.showMessageDialog(saida,"***Cliente "+(i)+"***\n\n"+
												"Codigo: "+crud.Variaveis.codigo[i]+"\n"+
												"Nome: "+crud.Variaveis.codigo[i]+"\n"+
												"Email: "+crud.Variaveis.codigo[i]+"\n"+
												"Cidade: "+crud.Variaveis.codigo[i]+"\n"+
												"UF: "+crud.Variaveis.codigo[i]);

					
			}
		}
}
