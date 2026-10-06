public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoOnlineUso;

    // Construtor padrão (considera disciplina de 60 horas, logo 120 horas online esperadas)
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
        this.tempoOnlineUso = 0;
    }

    // Construtor que permite definir explicitamente o tempo online esperado
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnlineUso = 0;
    }

    // Adiciona horas de estudo online ao total acumulado
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineUso += tempo;
    }

    // Verifica se o aluno atingiu ou ultrapassou a meta de tempo online
    public boolean atingiuMetaTempoOnline() {
        return this.tempoOnlineUso >= this.tempoOnlineEsperado;
    }

    // Retorna a representação textual com o nome da disciplina, o tempo usado e o esperado
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnlineUso + "/" + this.tempoOnlineEsperado;
    }
}