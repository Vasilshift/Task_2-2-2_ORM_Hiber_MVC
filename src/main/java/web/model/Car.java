package web.model;

public class Car {
    String brandCar;
    String modelCar;
    String speedCar;

    public Car(String brandCar, String modelCar, String speedCar) {
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.speedCar = speedCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getSpeedCar() {
        return speedCar;
    }

    public void setSpeedCar(String speedCar) {
        this.speedCar = speedCar;
    }

//    @Override
//    public String toString() {
//        return brandCar + " " + modelCar + " " + speedCar;
//    }
}
