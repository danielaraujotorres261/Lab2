public class RegistroResumos {
    private String[] temas;
    private String[] conteudos;
    private int capacidade;
    private int proximoIndice;
    private int quantidade;

    public RegistroResumos(int numeroDeResumos) {
        this.capacidade = numeroDeResumos;
        this.temas = new String[capacidade];
        this.conteudos = new String[capacidade];
        this.proximoIndice = 0;
        this.quantidade = 0;
    }

    public void adicionaResumo(String tema, String conteudo) {
        for (int i = 0; i < capacidade; i++) {
            if (temas[i] != null && temas[i].equals(tema)) {
                conteudos[i] = conteudo;
                return;
            }
        }

        temas[proximoIndice] = tema;
        conteudos[proximoIndice] = conteudo;

        if (quantidade < capacidade) {
            quantidade++;
        }

        proximoIndice = (proximoIndice + 1) % capacidade;
    }

    public void adiciona(String tema, String conteudo) {
        adicionaResumo(tema, conteudo);
    }

    public int contaResumos() {
        return this.quantidade;
    }

    public int conta() {
        return contaResumos();
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < capacidade; i++) {
            if (temas[i] != null && temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }

    public boolean terResumo(String tema) {
        return temResumo(tema);
    }

    public String[] pegaResumos() {
        String[] resumosAtivos = new String[quantidade];
        int count = 0;
        for (int i = 0; i < capacidade; i++) {
            if (temas[i] != null) {
                resumosAtivos[count++] = temas[i] + ": " + conteudos[i];
            }
        }
        return resumosAtivos;
    }

    public String imprimeResumos() {
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(this.quantidade).append(" resumo(s) cadastrado(s)\n");
        sb.append("- ");

        boolean primeiro = true;
        for (int i = 0; i < capacidade; i++) {
            if (temas[i] != null) {
                if (!primeiro) {
                    sb.append(" | ");
                }
                sb.append(temas[i]);
                primeiro = false;
            }
        }
        return sb.toString();
    }
}