package model;

import java.util.List;
public class Charaktere {
    private int id;
    private String name;
    private String region;

    private List<String> gekauftenProdukte;

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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<String> getGekauftenProdukte() {
        return gekauftenProdukte;
    }

    public void setGekauftenProdukte(List<String> gekauftenProdukte) {
        this.gekauftenProdukte = gekauftenProdukte;
    }


    public Charaktere(int id, String name, String region, List<String> gekauftenProdukte) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.gekauftenProdukte = gekauftenProdukte;
    }
}
