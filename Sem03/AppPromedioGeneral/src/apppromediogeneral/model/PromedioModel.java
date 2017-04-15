package apppromediogeneral.model;

public class PromedioModel {

    //input

    private int pc1;
    private int pc2;
    private int pc3;
    private int pc4;
    private int ep;
    private int ef;
    //output
    private int notaPcMenor;
    private int promFinal;
    private int promPC;
    private String condicion;

    public int getPc1() {
        return pc1;
    }

    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public int getPc2() {
        return pc2;
    }

    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public int getPc3() {
        return pc3;
    }

    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }

    public int getPc4() {
        return pc4;
    }

    public void setPc4(int pc4) {
        this.pc4 = pc4;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public int getEf() {
        return ef;
    }

    public void setEf(int ef) {
        this.ef = ef;
    }

    public int getNotaPcMenor() {
        return notaPcMenor;
    }

    public void setNotaPcMenor(int notaPcMenor) {
        this.notaPcMenor = notaPcMenor;
    }

    public int getPromFinal() {
        return promFinal;
    }

    public void setPromFinal(int promFinal) {
        this.promFinal = promFinal;
    }

    public int getPromPC() {
        return promPC;
    }

    public void setPromPC(int promPC) {
        this.promPC = promPC;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

}
