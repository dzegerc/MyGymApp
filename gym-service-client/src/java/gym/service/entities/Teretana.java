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
@Table(name = "teretana")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teretana.findAll", query = "SELECT t FROM Teretana t"),
    @NamedQuery(name = "Teretana.findByIdTeretana", query = "SELECT t FROM Teretana t WHERE t.idTeretana = :idTeretana"),
    @NamedQuery(name = "Teretana.findByNaziv", query = "SELECT t FROM Teretana t WHERE t.naziv = :naziv"),
    @NamedQuery(name = "Teretana.findByAdresa", query = "SELECT t FROM Teretana t WHERE t.adresa = :adresa"),
    @NamedQuery(name = "Teretana.findByRadnoVrijeme", query = "SELECT t FROM Teretana t WHERE t.radnoVrijeme = :radnoVrijeme"),
    @NamedQuery(name = "Teretana.findByKontakt", query = "SELECT t FROM Teretana t WHERE t.kontakt = :kontakt"),
    @NamedQuery(name = "Teretana.findByEmail", query = "SELECT t FROM Teretana t WHERE t.email = :email"),
    @NamedQuery(name = "Teretana.findByVelicina", query = "SELECT t FROM Teretana t WHERE t.velicina = :velicina"),
    @NamedQuery(name = "Teretana.findByOpis", query = "SELECT t FROM Teretana t WHERE t.opis = :opis")})
public class Teretana implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_teretana")
    private Integer idTeretana;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "naziv")
    private String naziv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "adresa")
    private String adresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "radno_vrijeme")
    private String radnoVrijeme;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "kontakt")
    private String kontakt;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "velicina")
    private String velicina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1100)
    @Column(name = "opis")
    private String opis;

    public Teretana() {
    }

    public Teretana(Integer idTeretana) {
        this.idTeretana = idTeretana;
    }

    public Teretana(Integer idTeretana, String naziv, String adresa, String radnoVrijeme, String kontakt, String email, String velicina, String opis) {
        this.idTeretana = idTeretana;
        this.naziv = naziv;
        this.adresa = adresa;
        this.radnoVrijeme = radnoVrijeme;
        this.kontakt = kontakt;
        this.email = email;
        this.velicina = velicina;
        this.opis = opis;
    }

    public Integer getIdTeretana() {
        return idTeretana;
    }

    public void setIdTeretana(Integer idTeretana) {
        this.idTeretana = idTeretana;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getRadnoVrijeme() {
        return radnoVrijeme;
    }

    public void setRadnoVrijeme(String radnoVrijeme) {
        this.radnoVrijeme = radnoVrijeme;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVelicina() {
        return velicina;
    }

    public void setVelicina(String velicina) {
        this.velicina = velicina;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTeretana != null ? idTeretana.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teretana)) {
            return false;
        }
        Teretana other = (Teretana) object;
        if ((this.idTeretana == null && other.idTeretana != null) || (this.idTeretana != null && !this.idTeretana.equals(other.idTeretana))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Teretana[ idTeretana=" + idTeretana + " ]";
    }
    
}
