package entites;

import entites.Commande;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-10T11:46:29")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-09T16:57:52")
>>>>>>> 3120b32a37c8efe98b8b7d7aa816afbfb8770e44
@StaticMetamodel(Information.class)
public class Information_ { 

    public static volatile CollectionAttribute<Information, Commande> lesCommandes;
    public static volatile SingularAttribute<Information, String> description;
    public static volatile SingularAttribute<Information, String> id;

}