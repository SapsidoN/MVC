package web.model;




public class Car {

    private String model;

    private String vin;

    private String number;

    public Car(String model, String vin, String number) {
        this.model = model;
        this.number = number;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
