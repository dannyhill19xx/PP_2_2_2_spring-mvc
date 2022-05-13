package web.Models;

public class Cars {

    private int id;

    private String model;

    private int series;


    public Cars() {
    }

    public Cars(int id, String model, int series) {
        this.model = model;
        this.series = series;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}