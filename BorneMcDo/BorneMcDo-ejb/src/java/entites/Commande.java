package entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date heure;
    private String identifiantCourt;
    
    @ManyToOne
    private Options uneOption;
    @OneToMany(mappedBy = "uneCommande")
    private Collection<Choix> lesChoix;
    @ManyToOne
    private Status unStatus;
    @ManyToMany
    private Collection<Information> lesInfos;
    @ManyToOne
    private Client unClient;

    public Commande() {
    }

    public Commande(Date heure, String identifiantCourt) {
        this.heure = heure;
        this.identifiantCourt = identifiantCourt;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHeure() {
        return heure;
    }

    public void setHeure(Date heure) {
        this.heure = heure;
    }

    public String getIdentifiantCourt() {
        return identifiantCourt;
    }

    public void setIdentifiantCourt(String identifiantCourt) {
        this.identifiantCourt = identifiantCourt;
    }

    public Options getUneOption() {
        return uneOption;
    }

    public void setUneOption(Options uneOption) {
        this.uneOption = uneOption;
    }

    public Collection<Choix> getLesChoix() {
        return lesChoix;
    }

    public void setLesChoix(Collection<Choix> lesChoix) {
        this.lesChoix = lesChoix;
    }

    public Status getUnStatus() {
        return unStatus;
    }

    public void setUnStatus(Status unStatus) {
        this.unStatus = unStatus;
    }

    public Collection<Information> getLesInfos() {
        return lesInfos;
    }

    public void setLesInfos(Collection<Information> lesInfos) {
        this.lesInfos = lesInfos;
    }

    public Client getUnClient() {
        return unClient;
    }

    public void setUnClient(Client unClient) {
        this.unClient = unClient;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commande n°" + id + ", heure=" + heure + ", identifiantCourt=" + identifiantCourt;
    }

    

}
