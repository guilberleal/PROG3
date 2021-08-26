package funcionario;

import funcionario.Funcionario;

public class f_diarista extends Funcionario {
    private int dias;
    private int horas;

    // construtor
    public f_diarista(String nome, double salario, int dias, int horas) {
        super(nome, salario);
        this.dias = dias;
        this.horas = horas;
    }

    // gets
    public int getDias() {
        return this.dias;
    }

    public int getHoras() {
        return this.horas;
    }

    // sets
    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    // funcao que calcula salario
    public double calculaSalarioDiarista() {
        return ((this.horas * this.dias) * 40);
    }
}