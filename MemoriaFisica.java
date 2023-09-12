public class MemoriaFisica {
    String[] espaco = new String[8];
    Disco disco; // Referência para a classe Disco

    public MemoriaFisica(Disco disco, MVirtual memoriaVirtual) {
        this.disco = disco;
        this.memoriaVirtual = memoriaVirtual;
    }

    public String insereDadoMF(String conteudo) {
        if (cheia()) {
            moverParaDisco();
        }

        int posicaoVazia = encontrarPosicaoVazia();
        if (posicaoVazia != -1) {
            espaco[posicaoVazia] = conteudo;
        }

        return String.valueOf(posicaoVazia);
    }

    private boolean cheia() {
        for (String elemento : espaco) {
            if (elemento == null) {
                return false;
            }
        }
        return true;
    }

    private int encontrarPosicaoVazia() {
        for (int i = 0; i < espaco.length; i++) {
            if (espaco[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private void moverParaDisco() {
        if (disco != null && espaco[0] != null) {
            disco.preencheDisco(espaco[0]);
            // Remova o elemento da primeira posição após armazená-lo no disco
            for (int i = 0; i < espaco.length - 1; i++) {
                espaco[i] = espaco[i + 1];
            }
            espaco[espaco.length - 1] = null;
        }
    }
}
