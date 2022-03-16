package Dao;
import org.springframework.stereotype.Component;

@Component("dao1")
public class DaoImpl1 implements Dao{
    @Override
    public double getData(){
        System.out.println("visualise resultat version capteurs");
        double data=50;
        return data;
    }

}