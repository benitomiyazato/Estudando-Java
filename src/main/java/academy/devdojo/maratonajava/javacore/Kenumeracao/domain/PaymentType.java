package academy.devdojo.maratonajava.javacore.Kenumeracao.domain;

public enum PaymentType {
    DEBITO(1, "Débito"){
        public double getDescount(double value){
            return value * 0.1;
        }
    },
    CREDITO(2, "Crédito"){
        public double getDescount(double value){
            return value * 0.05;
        }
    };

    public final int index;
    public final String type;

    PaymentType(int index, String type){
        this.index = index;
        this.type = type;
    }

    public abstract double getDescount(double value);
}
