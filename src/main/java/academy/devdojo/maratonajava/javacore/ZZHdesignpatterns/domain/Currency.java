package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

public interface Currency {
    String getSymbol();
}

class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }

    @Override
    public String toString() {
        return getSymbol();
    }
}

class usDollar implements Currency {
    @Override
    public String getSymbol() {
        return "$";
    }
}
