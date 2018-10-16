package entites;

import entites.Article;
import entites.Choix;
import entites.Commande;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-16T11:59:17")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-15T10:50:08")
>>>>>>> ba9b4b87feeca6a7a755cd6c0b9bd74756f45c00
@StaticMetamodel(Preference.class)
public class Preference_ { 

    public static volatile SingularAttribute<Preference, String> libele;
    public static volatile CollectionAttribute<Preference, Commande> lesCommandes;
    public static volatile CollectionAttribute<Preference, Article> lesArticles;
    public static volatile SingularAttribute<Preference, Long> id;
    public static volatile CollectionAttribute<Preference, Choix> lesChoix;

}