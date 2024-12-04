package web.model;

public class Car {
    long id;
    private String series;
    private String model;
    private int cost;

    public Car() {

    }

    public Car(Long id, String series, String model, int cost) {
        this.series = series;
        this.model = model;
        this.cost = cost;
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getSeries() {
        return series;
    }
    public void setSeries(String series) {
        this.series = series;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}
