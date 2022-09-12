/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.service.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Korisnik
 */
@Entity
@Table(name = "grupe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grupe.findAll", query = "SELECT g FROM Grupe g"),
    @NamedQuery(name = "Grupe.findByIdgrupe", query = "SELECT g FROM Grupe g WHERE g.idgrupe = :idgrupe"),
    @NamedQuery(name = "Grupe.findByNaziv", query = "SELECT g FROM Grupe g WHERE g.naziv = :naziv"),
    @NamedQuery(name = "Grupe.findByTermin", query = "SELECT g FROM Grupe g WHERE g.termin = :termin"),
    @NamedQuery(name = "Grupe.findByKapacitet", query = "SELECT g FROM Grupe g WHERE g.kapacitet = :kapacitet"),
    @NamedQuery(name = "Grupe.findByPopunjeno", query = "SELECT g FROM Grupe g WHERE g.popunjeno = :popunjeno"),
    @NamedQuery(name = "Grupe.findByTeretana", query = "SELECT g FROM Grupe g WHERE g.teretana = :teretana")})
public class Grupe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idgrupe")
    private Integer idgrupe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "naziv")
    private String naziv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "termin")
    private String termin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "kapacitet")
    private String kapacitet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "popunjeno")
    private String popunjeno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "teretana")
    private String teretana;

    public Grupe() {
    }

    public Grupe(Integer idgrupe) {
        this.idgrupe = idgrupe;
    }

    public Grupe(Integer idgrupe, String naziv, String termin, String kapacitet, String popunjeno, String teretana) {
        this.idgrupe = idgrupe;
        this.naziv = naziv;
        this.termin = termin;
        this.kapacitet = kapacitet;
        this.popunjeno = popunjeno;
        this.teretana = teretana;
    }

    public Integer getIdgrupe() {
        return idgrupe;
    }

    public void setIdgrupe(Integer idgrupe) {
        this.idgrupe = idgrupe;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTermin() {
        return termin;
    }

    public void setTermin(String termin) {
        this.termin = termin;
    }

    public String getKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(String kapacitet) {
        this.kapacitet = kapacitet;
    }

    public String getPopunjeno() {
        return popunjeno;
    }

    public void setPopunjeno(String popunjeno) {
        this.popunjeno = popunjeno;
    }

    public String getTeretana() {
        return teretana;
    }

    public void setTeretana(String teretana) {
        this.teretana = teretana;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgrupe != null ? idgrupe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupe)) {
            return false;
        }
        Grupe other = (Grupe) object;
        if ((this.idgrupe == null && other.idgrupe != null) || (this.idgrupe != null && !this.idgrupe.equals(other.idgrupe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Grupe[ idgrupe=" + idgrupe + " ]";
    }
    
}
