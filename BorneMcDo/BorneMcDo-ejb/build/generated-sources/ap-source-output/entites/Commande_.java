package entites;

import entites.Choix;
import entites.Client;
import entites.Information;
import entites.Preference;
import entites.Status;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-16T11:59:17")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-15T10:50:07")
>>>>>>> ba9b4b87feeca6a7a755cd6c0b9bd74756f45c00
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, Date> heure;
    public static volatile SingularAttribute<Commande, Status> unStatus;
    public static volatile CollectionAttribute<Commande, Information> lesInfos;
    public static volatile SingularAttribute<Commande, Preference> unePreference;
    public static volatile SingularAttribute<Commande, Client> unClient;
    public static volatile SingularAttribute<Commande, Long> id;
    public static volatile SingularAttribute<Commande, String> identifiantCourt;
    public static volatile CollectionAttribute<Commande, Choix> lesChoix;

}