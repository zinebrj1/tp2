package Metier;
import Dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("dao1")
    private Dao dao;

    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp * 20;
        return res;
    }

    /* Setter pour injection des dépendances*/
    public void setDao(Dao dao) {
        this.dao = dao;
    }
}