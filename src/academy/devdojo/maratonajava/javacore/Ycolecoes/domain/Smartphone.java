package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (this == obj)
            return true;

        if (this.getClass() != obj.getClass())
            return false;

        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.getSerialNumber())
                && brand.equals(smartphone.getBrand());
        // retorna true se serial number e marca forem iguais

    }

    // se x.equals(y) ==> y.hashCode == x.hashCode(), ou seja, y e x tem que ter o
    // msm hashcode
    // se y.hashCode() == x.hashCode => não necessariamente y.equals(x) == true
    // x.hashCode() != y.hashCode -> x.equals(y) == false
    @Override
    public int hashCode() {

        return serialNumber == null ? 0 : serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone [brand=" + brand + ", serialNumber=" + serialNumber + "]";
    }
}
