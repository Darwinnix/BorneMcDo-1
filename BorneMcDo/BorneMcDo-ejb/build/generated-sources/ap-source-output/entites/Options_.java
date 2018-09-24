package entites;

import entites.Article;
import entites.Choix;
import entites.Commande;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-24T22:50:34")
@StaticMetamodel(Options.class)
public class Options_ { 

    public static volatile SingularAttribute<Options, String> libele;
    public static volatile CollectionAttribute<Options, Commande> lesCommandes;
    public static volatile CollectionAttribute<Options, Article> lesArticles;
    public static volatile SingularAttribute<Options, Long> id;
    public static volatile CollectionAttribute<Options, Choix> lesChoix;

}