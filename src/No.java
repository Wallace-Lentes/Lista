public class No {
	private Integer informacao;
	private No proximo;
	
	public No()
	{
		this.informacao = null;
		this.proximo = null;
	}

	public Integer getInformacao() {
		return this.informacao;
	}

	public void setInformacao(Integer informacao) {
		this.informacao = informacao;
	}

	public No getProximo() {
		return this.proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
}
