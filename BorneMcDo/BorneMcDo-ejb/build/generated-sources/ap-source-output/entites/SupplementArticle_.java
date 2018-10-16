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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-15T10:50:08")
>>>>>>> ba9b4b87feeca6a7a755cd6c0b9bd74756f45c00
@StaticMetamodel(SupplementArticle.class)
public class SupplementArticle_ { 

    public static volatile SingularAttribute<SupplementArticle, Article> unArticle;
    public static volatile SingularAttribute<SupplementArticle, Float> prix;
    public static volatile SingularAttribute<SupplementArticle, Long> id;
    public static volatile CollectionAttribute<SupplementArticle, Choix> lesChoix;

}