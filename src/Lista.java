public class Lista {
    private No primeiro;

    public Lista() {
        primeiro = null;

    }

    public boolean vazia() {
        return primeiro == null;
    }

    public void inserePrimeiro(int info) {
        No auxiliar = new No();
        auxiliar.setInfo(info);
        auxiliar.setProx(primeiro);
        primeiro = auxiliar;
    }

    public void insereDepois(int info) {
        if (vazia() == true) {
            inserePrimeiro(info);
        }
        No auxiliar = primeiro;

        while (auxiliar != null && auxiliar.getProx() != null) {
            auxiliar = auxiliar.getProx();
        }
        if (auxiliar.getProx() == null) {
            No novo = new No();
            novo.setInfo(info);
            auxiliar.setProx(novo);
        }

    }

    public void insereUltimo(int info) {
        if (vazia() == true) {
            inserePrimeiro(info);
        } else {
            No auxiliar = primeiro;

            while (auxiliar != null && auxiliar.getProx() != null) {
                auxiliar = auxiliar.getProx();
            }
            if (auxiliar.getProx() == null) {
                No novo = new No();
                novo.setInfo(info);
                auxiliar.setProx(novo);
            }
        }
    }

    public void removerPimeiro(int info) {
        No noAtual = this.primeiro;

        while (noAtual != null) {
            if (noAtual.getInfo() == info) {
                if (noAtual.getAnterior() == null) {
                    this.primeiro = noAtual.getProx();
                    noAtual.getProx().setAnterior(null);
                } else {
                    noAtual.getAnterior().setProx(noAtual.getProx());
                    noAtual.getProx().setAnterior(noAtual.getAnterior());
                }
            }
            noAtual = noAtual.getProx();
        }
    }

    public void removeUltimo(int info) {
        No noAtual = this.primeiro;

        while (noAtual != null) {
            if (noAtual.getInfo() == info) {
                if (noAtual.getAnterior() == null) {
                    this.primeiro = noAtual.getProx();
                    noAtual.getProx().setAnterior(null);
                } else {
                    noAtual.getAnterior().setProx(noAtual.getProx());
                    noAtual.getProx().setAnterior(noAtual.getAnterior());
                }
            }
            noAtual = noAtual.getProx();
        }
    }

    public void mostrar() {
        No auxiliar = primeiro;
        while (auxiliar != null) {
            System.out.print(auxiliar.getInfo() + ", ");
            auxiliar = auxiliar.getProx();
        }
    }
}
