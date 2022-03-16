package Dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements Dao{
    @Override
    public double getData(){
        System.out.println("visualiser resultat version données");
        double data=50;
        return data;
    }

}