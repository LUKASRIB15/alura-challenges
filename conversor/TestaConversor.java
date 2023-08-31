package conversor; 

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TestaConversor {
	public static void main(String[] args) {
		while(true) {
			Moedas moeda = new Moedas();
			double valorConversao = 0;
			
			// Input para buscar o valor 
			String valor = JOptionPane.showInputDialog("Digite o valor");
			try {
				double valorEmFlutuante = Double.valueOf(valor).doubleValue();
				moeda.setValor(valorEmFlutuante);				
			}catch(NullPointerException ex) {
				System.out.println("Operacao Cancelada!");
				break;
			}
			
			// Input para escolher o modo de conversão
			String[] conversoes = {
					"De Reais a Dollares",
					"De Reais a Euros",
					"De Reais a Libras",
					"De Reais a Pesos Argentinos",
					"De Reais a Peso Chileno",
					"De Dollares a Reais",
					"De Euros a Reais",
					"De Libras a Reais",
					"De Pesos Argentinos a Reais",
					"De Peso Chileno a Reais"
			};
			
			String tipoConversao = (String) JOptionPane.showInputDialog(
					null,
					"Selecione a conversão desejada",
					"Conversões possíveis",
					JOptionPane.QUESTION_MESSAGE,
					null,
					conversoes,
					conversoes[0]
			);
			
			// Realização das conversões
			try {
				switch(tipoConversao) {
				case "De Reais a Dollares" :
					valorConversao = moeda.realParaDolar(moeda.getValor());
					break;
				
				case "De Reais a Euros" :
					valorConversao = moeda.realParaEuro(moeda.getValor());
					break;
				
				case "De Reais a Libras" :
					valorConversao = moeda.realParaLibra(moeda.getValor());
					break;
				
				case "De Reais a Pesos Argentinos" :
					valorConversao = moeda.realParaPesosArgentinos(moeda.getValor());
					break;
				
				case "De Reais a Peso Chileno" :
					valorConversao = moeda.realParaPesoChileno(moeda.getValor());
					break;
				
				case "De Dollares a Reais" :
					valorConversao = moeda.dollarParaReal(moeda.getValor());
					break;
					
				case "De Euros a Reais" :
					valorConversao = moeda.euroParaReal(moeda.getValor());
					break;
					
				case "De Libras a Reais" :
					valorConversao = moeda.libraParaReal(moeda.getValor());
					break;
				
				case "De Pesos Argentinos a Reais" :
					valorConversao = moeda.pesosArgentinosParaReal(moeda.getValor());
					break;
				
				case "De Peso Chileno a Reais" :
					valorConversao = moeda.pesoChilenoParaReal(moeda.getValor());
					break;
				
				
			
				}
			}catch(NullPointerException ex) {
				System.out.println("Operacao Cancelada");
				break;
			}
			
			// Caixa de mensagem para mostrar a mensagem
			StringBuilder mensagem  = new StringBuilder();
			
			if(valorConversao == 0) {
				throw new NullPointerException("Erro: Valor da conversao nao foi realizado");
			}else {
				DecimalFormat valorFormatado = new DecimalFormat("#,##0.00");
				mensagem.append("O valor após a conversão é: " + valorFormatado.format(valorConversao) + " " + moeda.getType());
			}
			
			JOptionPane.showMessageDialog(null, mensagem);
			
			// Mensagem para continuar ou não o programa
			StringBuilder mensagemFinal = new StringBuilder();
			
			mensagemFinal.append("Deseja continuar?");
			int resposta = JOptionPane.showConfirmDialog(null, mensagemFinal, "Confirmacao", JOptionPane.YES_NO_OPTION);
			
			if(resposta == JOptionPane.YES_OPTION) {
				continue;
			}else {
				break;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Obrigado pela participação!");
		
	}
	
}

