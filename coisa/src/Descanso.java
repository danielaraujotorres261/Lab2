public class Descanso {
    private int horasDescanso = 0;
    private int numeroSemanas = 0;

    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    public String getStatusGeral() {
        // Se o número de semanas for zero, o aluno começa cansado (evita divisão por zero)
        if (this.numeroSemanas == 0) {
            return "cansado";
        }

        double media = (double) this.horasDescanso / this.numeroSemanas;

        // O aluno deve descansar 26 horas por semana ou mais para ser considerado descansado
        if (media >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}