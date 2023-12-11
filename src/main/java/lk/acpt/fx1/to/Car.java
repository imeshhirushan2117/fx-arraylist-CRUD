package lk.acpt.fx1.to;

/**
 * Created By Imesh Hirushan
 * Project Name : fx-1
 * Package Name : lk.acpt.fx1
 * Date : Dec 9, 2023
 * Time : 10:29 AM
 */
public class Car {

    private String id;
    private String module;
    private String brand;
    private int engNo;
    private String tMode;


    public Car(String id, String module, String brand, int engNo, String tMode) {
        this.id = id;
        this.module = module;
        this.brand = brand;
        this.engNo = engNo;
        this.tMode = tMode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getEngNo() {
        return engNo;
    }

    public void setEngNo(int engNo) {
        this.engNo = engNo;
    }

    public String gettMode() {
        return tMode;
    }

    public void settMode(String tMode) {
        this.tMode = tMode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", module='" + module + '\'' +
                ", brand='" + brand + '\'' +
                ", engNo=" + engNo +
                ", tMode='" + tMode + '\'' +
                '}';
    }
}
