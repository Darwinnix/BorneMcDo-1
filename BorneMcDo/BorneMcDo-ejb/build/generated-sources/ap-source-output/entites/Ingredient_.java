package entites;

import entites.Article;
import entites.Choix;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-16T11:59:17")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-15T10:50:07")
>>>>>>> ba9b4b87feeca6a7a755cd6c0b9bd74756f45c00
@StaticMetamodel(Ingredient.class)
public class Ingredient_ { 

    public static volatile CollectionAttribute<Ingredient, Article> lesArticles;
    public static volatile SingularAttribute<Ingredient, String> nom;
    public static volatile CollectionAttribute<Ingredient, Choix> lesChoix;

}