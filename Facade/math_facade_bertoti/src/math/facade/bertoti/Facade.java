package math.facade.bertoti;

public class Facade {
    private Subsistema1 subSistema1;
    private Subsistema2 subSistema2;
    private Subsistema3 subSistema3;

    public Facade() {
        subSistema1 = new Subsistema1();
        subSistema2 = new Subsistema2();
        subSistema3 = new Subsistema3();
    }

    public void operacaoFacade() {
        subSistema1.operacao1();
        subSistema2.operacao2();
        subSistema3.operacao3();
    }
}

