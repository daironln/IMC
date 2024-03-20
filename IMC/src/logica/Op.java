package logica;

public class Op {

    private float imc;
    private float pesoActual;
    private int semana;
    private double[] aumento;
    private String rango;

    public Op(float imc, int semana, float pesoActual) {

        this.imc = imc;
        this.semana = semana;
        this.pesoActual = pesoActual;
        aumento = new double[2];

        if (imc <= 18.8) {
            rango = "Peso Deficiente";
        } else if (imc > 18.8 && imc < 25.6) {
            rango = "Peso Adecuado";
        } else if (imc < 28.6 && imc >= 25.6) {
            rango = "Sobre Peso";
        } else if (imc >= 28.6) {
            rango = "Obesidad";
        }
    }

    public float getImc() {
        return imc;
    }

    public String getGanancia() {

        if (pesoActual >= getAumento()[0] && pesoActual <= getAumento()[1])
            return "adecuada";
        else if (pesoActual < getAumento()[0])
            return "insuficiente";
        else
            return "exesiva";
    }
    public int getSemana() {
        return semana;
    }
    //Una funcion que imprima hello world
    public String getRango() {
        return rango;
    }
    public double[] getAumento() {

        switch (rango) {
            case "Peso Deficiente":
                if (semana <= 20) {
                    aumento[0] = semana * 0.57;
                    aumento[1] = semana * 0.79;
                } else if (semana > 20 && semana <= 28) {
                    aumento[0] = semana * 0.68;
                    aumento[1] = semana * 0.79;
                } else {
                    aumento[0] = semana * 0.57;
                    aumento[1] = semana * 0.57;
                }
                break;
            case "Peso Adecuado":
                if (semana <= 20) {
                    aumento[0] = semana * 0.45;
                    aumento[1] = semana * 0.68;
                } else if (semana > 20 && semana <= 28) {
                    aumento[0] = semana * 0.57;
                    aumento[1] = semana * 0.79;
                } else {
                    aumento[0] = semana * 0.45;
                    aumento[1] = semana * 0.45;
                }
                break;
            case "Sobre Peso":
                if (semana <= 20) {
                    aumento[0] = semana * 0.45;
                    aumento[1] = semana * 0.57;
                } else if (semana > 20 && semana <= 28) {
                    aumento[0] = semana * 0.45;
                    aumento[1] = semana * 0.68;
                } else {
                    aumento[0] = semana * 0.45;
                    aumento[1] = semana * 0.45;
                }
                break;
            case "Obesidad":
                if (semana <= 20) {
                    aumento[0] = semana * 0.34;
                    aumento[1] = semana * 0.45;
                } else if (semana > 20 && semana <= 28) {
                    aumento[0] = semana * 0.34;
                    aumento[1] = semana * 0.57;
                } else {
                    aumento[0] = semana * 0.34;
                    aumento[1] = semana * 0.34;
                }
                break;

            default:
                aumento[0] = 0;
                aumento[1] = 0;
                break;
        }

        return aumento;
    }
}