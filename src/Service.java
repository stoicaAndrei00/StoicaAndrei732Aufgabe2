import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import model.Charaktere;

public class Service {
    private Repository<Charaktere> charactereRepository;

    public Service(Repository<Charaktere> charactereRepository) {
        this.charactereRepository = charactereRepository;
    }

    public List<Charaktere> alleCharaktereZuruckgeben() {
        return this.charactereRepository.getAllElements();
    }


    public void createACharakter(int id, String name, String region, List<String> gekauftenProdukte) {

        this.charactereRepository.addElement(new Charaktere(id, name, region, gekauftenProdukte));
    }

    public Charaktere getCharaktere(int alter) {
        Iterator var2 = this.charactereRepository.getAllElements().iterator();

        Charaktere p;
        do {
            if (!var2.hasNext()) {
                throw new RuntimeException("Spieler nicht gefunden");
            }

            p = (Charaktere)var2.next();
        } while(p.getId() != alter);

        return p;
    }

    public void updateCharaktere(Charaktere charaktere) {
        Iterator var2 = this.charactereRepository.getAllElements().iterator();

        while(var2.hasNext()) {
            Charaktere p = (Charaktere)var2.next();
            if (p.getId() == charaktere.getId()) {
                int index = this.charactereRepository.getAllElements().indexOf(p);
                p.setName(charaktere.getName());
                p.setRegion(charaktere.getRegion());
                this.charactereRepository.updateElement(index, p);
                break;
            }
        }

    }

    public void deleteCharaktere(String name) {
        Iterator var2 = this.charactereRepository.getAllElements().iterator();

        while(var2.hasNext()) {
            Charaktere p = (Charaktere) var2.next();
            if (Objects.equals(p.getName(), name)) {
                this.charactereRepository.remove(p);
                break;
            }
        }

    }

    public List<Charaktere> filterNachPosition(String ort) {
        new ArrayList();
        List<Charaktere> spielerList = this.charactereRepository.getAllElements().stream().filter((spieler) -> {
            return ort.equals(spieler.getRegion());
        }).toList();
        return spielerList;
    }




}
