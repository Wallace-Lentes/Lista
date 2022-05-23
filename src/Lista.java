public class Lista {

	private No primeiro;
		
	public Lista()
	{
		this.primeiro = null;
	};
	
	public boolean vazia() {
		return this.primeiro == null;
	};
	
	public void inserePrimeiro(int valor) {
		No temp = new No();
		temp.setInformacao(valor);
		temp.setProximo(this.primeiro);
		this.primeiro = temp;
	};
	
	public void insereUltimo(int valor) {
		if (this.vazia()) {
			this.inserePrimeiro(valor);
		} else {
			No temp = this.primeiro;
			
			while(temp != null && temp.getProximo() != null) {
				temp = temp.getProximo();
			}
			
			if (temp.getProximo() == null) {
				No newTemp = new No();
				newTemp.setInformacao(valor);
				temp.setProximo(newTemp);
			}
		}
	}
	
	public void insereDepois(No node, int valor) {
		No temp = this.primeiro;
		No newTemp = new No();
		
		while(temp.getProximo() != null) {

			if(temp.getInformacao() == node.getInformacao()) {
				newTemp.setInformacao(valor);
				newTemp.setProximo(temp.getProximo());
				temp.setProximo(newTemp);
				break;
			}
			temp = temp.getProximo();
		}
		
	}
	
	public void removePrimeiro() {
		this.primeiro = this.primeiro.getProximo();
	}
	
	public void removeUltimo() {
		No temp = this.primeiro;
		No nextTemp = temp.getProximo();
		
		while(nextTemp != null) {
			if(nextTemp.getProximo() == null) {
				temp.setProximo(null);
			}

			temp = nextTemp;
			nextTemp = nextTemp.getProximo();
		}
	}
	
	public void remove(No node) {
		No temp = this.primeiro;
		No nextTemp = temp.getProximo();
		
		while (nextTemp != null) {
			
			if (nextTemp.getInformacao() == node.getInformacao()) {
				temp.setProximo(nextTemp.getProximo());
				break;
			}
			temp = nextTemp;
			nextTemp = nextTemp.getProximo();		
		}
	}
	
	public No buscar(int valor) {
		No temp = this.primeiro;
		
		while(temp != null && temp.getInformacao() != valor) {
			temp = temp.getProximo();
		}
		return temp;
	}
	
	public void mostrar() {
		No temp = this.primeiro;
		while (temp != null) {
			System.out.print(temp.getInformacao() + ", ");
			temp = temp.getProximo();
		}
	}

}
 