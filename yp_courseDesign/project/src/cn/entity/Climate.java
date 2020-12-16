package cn.entity;

public class Climate {
    private int id;
    private String name;
    private double degree;
    private  String month;
    private double niudegree;
    private double bodegree;
    private double lundegree;

    public double getBodegree() {
        return bodegree;
    }

    public void setBodegree(double bodegree) {
        this.bodegree = bodegree;
    }

    public double getLundegree() {
        return lundegree;
    }

    public void setLundegree(double lundegree) {
        this.lundegree = lundegree;
    }

    public double getNiudegree() {
        return niudegree;
    }

    public void setNiudegree(double niudegree) {
        this.niudegree = niudegree;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Climate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", degree=" + degree +
                ", month='" + month + '\'' +
                ", niudegree=" + niudegree +
                ", bodegree=" + bodegree +
                ", lundegree=" + lundegree +
                '}';
    }
}
