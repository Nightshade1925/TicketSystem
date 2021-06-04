public class ProblemCategory {

    private String name;
    private String description;
    private Double price;
    private Double estimatedTime;

    public ProblemCategory(String name, String description, Double price, Double estimatedTime) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.estimatedTime = estimatedTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Double estimatedTime) {
        this.estimatedTime = estimatedTime;
    }
}
