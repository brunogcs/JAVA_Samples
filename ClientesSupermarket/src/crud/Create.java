package crud;

import javax.swing.JOptionPane;

public class Create {
	static JOptionPane entrada = new JOptionPane();
	static JOptionPane saida = new JOptionPane();
	
	public static void Cadastro() {
		String verificadorCodigo;
		String verificadorNome;
		
			
			while(crud.Variaveis.ncadastrados<crud.Variaveis.QTDDISPO) {
				verificadorCodigo=entrada.showInputDialog("Digite o codigo do cliente:");
				 if(verificadorCodigo.equals(crud.Variaveis.codigo[crud.Variaveis.ncadastrados])) {
					saida.showMessageDialog(saida,"Este codigo já existe!");
					break;
				}
				else if(verificadorCodigo.equals("")){
					saida.showMessageDialog(saida,"O campo está em branco!");
					break;
				}
				verificadorNome = entrada.showInputDialog("Digite o nome do cliente:");
				if(verificadorNome.equals("")) {
					saida.showMessageDialog(saida,"O campo está em branco!");
					break;
				}
				else {
					crud.Variaveis.codigo[crud.Variaveis.ncadastrados+1]=verificadorCodigo;
					crud.Variaveis.nome[crud.Variaveis.ncadastrados+1]=verificadorNome;
				}
					crud.Variaveis.email[crud.Variaveis.ncadastrados+1]=entrada.showInputDialog("Digite o email do cliente:");
					crud.Variaveis.cidade[crud.Variaveis.ncadastrados+1]=entrada.showInputDialog("Digite o cidade do cliente:");
					crud.Variaveis.uf[crud.Variaveis.ncadastrados+1]=entrada.showInputDialog("Digite o uf do cliente:");
					saida.showMessageDialog(saida, "Codigo: "+crud.Variaveis.codigo[crud.Variaveis.ncadastrados+1]+ " foi inserido com sucesso");
					crud.Variaveis.ncadastrados=crud.Variaveis.ncadastrados+1;
					saida.showMessageDialog(saida, crud.Variaveis.ncadastrados);
					break;		
			}
		}
	}

