public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo = 0;
    private double[] notas = new double[4]; // Índices válidos: 0, 1, 2 e 3

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    // Horas de estudo são cumulativas
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    // Cadastra ou atualiza a nota (1 a 4). Salva no índice correspondente (nota - 1)
    public void cadastraNota(int nota, double valorNota) {
        if (nota >= 1 && nota <= 4) {
            this.notas[nota - 1] = valorNota;
        }
    }

    // Calcula a média aritmética das 4 notas de forma segura
    public double calculaMedia() {
        double soma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }
        return soma / this.notas.length;
    }

    // O aluno é aprovado se a média for igual ou superior a 7.0
    public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }

    // Representação textual contendo o nome, horas, média e as notas
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " +
                "[" + this.notas[0] + ", " + this.notas[1] + ", " + this.notas[2] + ", " + this.notas[3] + "]";
    }
}