package entites;

import entites.Categorie;
import entites.Choix;
import entites.Disponibilite;
import entites.InfoArticle;
import entites.Ingredient;
import entites.Preference;
import entites.Promotion;
import entites.SupplementArticle;
import entites.SupplementAutre;
import entites.Tva;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-28T21:49:39")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile SingularAttribute<Article, String> image;
    public static volatile CollectionAttribute<Article, InfoArticle> lesInfos;
    public static volatile SingularAttribute<Article, Float> prix;
    public static volatile SingularAttribute<Article, String> titre;
    public static volatile CollectionAttribute<Article, SupplementArticle> lesSupArt;
    public static volatile SingularAttribute<Article, String> description;
    public static volatile CollectionAttribute<Article, SupplementAutre> lesSuppAut;
    public static volatile CollectionAttribute<Article, Preference> lesPreferences;
    public static volatile CollectionAttribute<Article, Categorie> lesCategorie;
    public static volatile SingularAttribute<Article, String> nom;
    public static volatile CollectionAttribute<Article, Choix> lesChoix;
    public static volatile SingularAttribute<Article, Disponibilite> laDispo;
    public static volatile SingularAttribute<Article, Tva> laTva;
    public static volatile SingularAttribute<Article, Long> id;
    public static volatile CollectionAttribute<Article, Promotion> lesPromo;
    public static volatile CollectionAttribute<Article, Ingredient> lesIngredients;

}