package model.data;

public enum Marca {

    SAMSUNG("Samsung"), HUAWEI("Huawei"), APPLE("Apple"), XIAOMI("Xiaomi"), MOTOROLA("Motorola"), LG("LG"), SONY("Sony");

    private String marca;

    private Marca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

}
