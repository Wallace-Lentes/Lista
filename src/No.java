public class No {
    private Integer informacao;
    private No proximo;
    private No anterior;

    public No() {
        informacao = null;
        proximo = null;
        anterior = null;
    }

    public void setInfo(Integer informacao) {
        this.informacao = informacao;
    }

    public void setProx(No proximo) {
        this.proximo = proximo;
    }

    public No getProx() {
        return this.proximo;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getAnterior() {
        return this.anterior;
    }

    public Integer getInfo() {
        return this.informacao;
    }

    public No buscar(int informacao) {
        No p = this.proximo;
        while ((p != null) && (p.getInfo() != informacao))
            p = p.getProx();
        return p;

    }
}
