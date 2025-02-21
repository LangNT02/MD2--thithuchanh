package ra.entity;

import java.util.Date;

public class Laptop {
    private String laptopId;
    private String laptopName;
    private String description;
    private String customerAddress;
    private int ram;
    private double weight;
    private Date createAt;
    private double laptopPrice;
    private int typeId;
    private boolean isDeleted;

    public Laptop() {

    }

    public Laptop(String laptopId, String laptopName, String description, String customerAddress, int ram, double weight, Date createAt, double laptopPrice, int typeId, boolean isDeleted) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
        this.description = description;
        this.customerAddress = customerAddress;
        this.ram = ram;
        this.weight = weight;
        this.createAt = createAt;
        this.laptopPrice = laptopPrice;
        this.typeId = typeId;
        this.isDeleted = isDeleted;
    }

    public String getLaptopId() {
        return laptopId;
    }
    public void setLaptopId(String laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public double getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(double laptopPrice) {
        this.laptopPrice = laptopPrice;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId='" + laptopId + '\'' +
                ", laptopName='" + laptopName + '\'' +
                ", description='" + description + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", ram=" + ram +
                ", weight=" + weight +
                ", laptopPrice=" + laptopPrice +
                ", typeId=" + typeId +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
