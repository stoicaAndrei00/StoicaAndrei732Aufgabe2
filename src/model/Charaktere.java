import java.util.List;
public class Charaktere {
    private int id;
    private String name;
    private String region;
    private List<String> gekauftenProdukte;

    public Charaktere(int id, String name, String region, List<String> gekauftenProdukte) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.gekauftenProdukte = gekauftenProdukte;
    }
}
