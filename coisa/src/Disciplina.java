import java.util.Arrays;

public class Disciplina {
    private String nomeDaDisciplina;
    private int horasEstudo;
    private double[] notas;


    Disciplina(String nomeDisciplina){
        this.nomeDaDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas= new double[4];
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }
    public void cadastraNota(int nota, double valorNota){
        this.notas[ nota -1] = valorNota;
    }
    public double calculaMedia(){
        double soma = this.notas[0] + this.notas[1] + this.notas[3] + this.notas[4];
        return soma / 4.0;
    }
    public boolean aprovado(){
        return calculaMedia() >= 7.0;
    }
    @Override
    public String toString(){
        return this.nomeDaDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}
