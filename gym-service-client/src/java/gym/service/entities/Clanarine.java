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
@Table(name = "clanarine")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clanarine.findAll", query = "SELECT c FROM Clanarine c"),
    @NamedQuery(name = "Clanarine.findByIdClanarine", query = "SELECT c FROM Clanarine c WHERE c.idClanarine = :idClanarine"),
    @NamedQuery(name = "Clanarine.findByNaziv", query = "SELECT c FROM Clanarine c WHERE c.naziv = :naziv"),
    @NamedQuery(name = "Clanarine.findByCijena", query = "SELECT c FROM Clanarine c WHERE c.cijena = :cijena"),
    @NamedQuery(name = "Clanarine.findByTeretana", query = "SELECT c FROM Clanarine c WHERE c.teretana = :teretana"),
    @NamedQuery(name = "Clanarine.findByNapomena", query = "SELECT c FROM Clanarine c WHERE c.napomena = :napomena")})
public class Clanarine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_clanarine")
    private Integer idClanarine;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "naziv")
    private String naziv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "cijena")
    private String cijena;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "teretana")
    private String teretana;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "napomena")
    private String napomena;

    public Clanarine() {
    }

    public Clanarine(Integer idClanarine) {
        this.idClanarine = idClanarine;
    }

    public Clanarine(Integer idClanarine, String naziv, String cijena, String teretana, String napomena) {
        this.idClanarine = idClanarine;
        this.naziv = naziv;
        this.cijena = cijena;
        this.teretana = teretana;
        this.napomena = napomena;
    }

    public Integer getIdClanarine() {
        return idClanarine;
    }

    public void setIdClanarine(Integer idClanarine) {
        this.idClanarine = idClanarine;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getCijena() {
        return cijena;
    }

    public void setCijena(String cijena) {
        this.cijena = cijena;
    }

    public String getTeretana() {
        return teretana;
    }

    public void setTeretana(String teretana) {
        this.teretana = teretana;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClanarine != null ? idClanarine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clanarine)) {
            return false;
        }
        Clanarine other = (Clanarine) object;
        if ((this.idClanarine == null && other.idClanarine != null) || (this.idClanarine != null && !this.idClanarine.equals(other.idClanarine))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Clanarine[ idClanarine=" + idClanarine + " ]";
    }
    
}
