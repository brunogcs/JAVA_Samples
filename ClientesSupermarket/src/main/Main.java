package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String opcao = "";
		JOptionPane entrada = new JOptionPane();
		JOptionPane saida = new JOptionPane();
		while(!opcao.equals("6")) {
			opcao=entrada.showInputDialog("***Menu de opções***\n\n"+
					 					"1 - Cadastrar\n"+
					 					"2 - Consultar\n"+
					 					"3 - Atualizar\n"+
					 					"4 - Excluir\n"+
					 					"5 - Listar\n"+
					 					"6 - Sair\n"+
					 					"Escolha sua opção: "
					);
		switch(opcao) { 	 
	 	case "1": 
	 		crud.Create.Cadastro();
	 		break;
	 	case "2": 
	 		crud.Read.Consulta();	
	 		break;
	 	case "3":
	 		crud.Update.Atualizar();
	 		break;
	 	case "4": 
	 		System.exit(0);	
	 		break;
	 	case "5": 
	 		crud.ReadListar.Listar();
	 		break;
	 	case "6": 
	 		System.exit(0);
	 		break;
	 	default:
		 JOptionPane.showMessageDialog(
				 null,
				"Opção inválida"
		  );
	 }
	 }

	}

}
