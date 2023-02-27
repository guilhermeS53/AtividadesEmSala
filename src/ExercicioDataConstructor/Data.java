package ExercicioDataConstructor;
public class Data {
    int dia, mes, ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void displayData() {
        if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 0) {
            System.out.println("A data é a seguinte: " + dia + "/" + mes + "/" + ano);
        }
        else {
            System.out.println("Insira uma data válida!!!");
        }
    }
}
