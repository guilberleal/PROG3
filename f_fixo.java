package funcionario;

import funcionario.Funcionario;

public class f_fixo extends Funcionario {
    private int horaExtra;

    // construtor
    public f_fixo(String nome, double salario, int horaExtra) {
        super(nome, salario);
        this.horaExtra = horaExtra;
    }

    // gets
    public int getHoraExtra() {
        return this.horaExtra;
    }

    // sets
    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    // funcao que calcula salario mensal
    public double calculaSalarioFixo() {
        return (this.horaExtra * 80) + super.getSalario();
    }

}