package ra.entity;

public class LaptopType {
    private static int counter = 1;
    private int typeId;
    private String typeName;
    private String description;
    private boolean isDeleted;

    public LaptopType() {
        this.typeId = counter++;
    }

    public LaptopType(int typeId, String typeName, String description, boolean isDeleted) {
        this.typeId = counter++;
        this.typeName = typeName;
        this.description = description;
        this.isDeleted = isDeleted;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    // toString method
    @Override
    public String toString() {
        return "LaptopType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", description='" + description + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
