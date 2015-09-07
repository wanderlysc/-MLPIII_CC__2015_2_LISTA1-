
public class Data {
		private int dia, mes, ano, cont;
		
		public Data(int dia, int mes, int ano) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		public String toString() {
			if(!(dia > 0 && dia < 32))
				cont++;
			if(!(mes > 0 && mes < 13))
				cont++;
			if(!(ano > 0))
				cont++; 
			
			if(cont>0)
				return "Data INVALIDA!!!";
			else
				return dia + "/" + mes + "/" + ano;
		}
}
