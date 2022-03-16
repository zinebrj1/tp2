package pres;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Metier.IMetier;
public class pres {
    public static void main(String[] args) throws Exception {
        //ApplicationContext ctx=new ClassPathXmlApplicationContext("C:\\Users\\hp\\IdeaProjects\\Couplagefaib\\src\\main\\java\\config.txt");
        ApplicationContext ctx = new AnnotationConfigApplicationContext("Dao", "Metier");
        IMetier metier = ctx.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}