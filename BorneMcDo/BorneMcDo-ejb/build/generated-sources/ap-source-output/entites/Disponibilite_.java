package entites;

import entites.Article;
import entites.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-16T11:59:17")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-15T10:50:07")
>>>>>>> ba9b4b87feeca6a7a755cd6c0b9bd74756f45c00
@StaticMetamodel(Disponibilite.class)
public class Disponibilite_ { 

    public static volatile CollectionAttribute<Disponibilite, Menu> lesMenus;
    public static volatile SingularAttribute<Disponibilite, String> description;
    public static volatile CollectionAttribute<Disponibilite, Article> lesArticles;
    public static volatile SingularAttribute<Disponibilite, Long> id;

}