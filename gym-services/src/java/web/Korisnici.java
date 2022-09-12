/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

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
@Table(name = "korisnici")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Korisnici.findAll", query = "SELECT k FROM Korisnici k"),
    @NamedQuery(name = "Korisnici.findByIdKorisnik", query = "SELECT k FROM Korisnici k WHERE k.idKorisnik = :idKorisnik"),
    @NamedQuery(name = "Korisnici.findByIme", query = "SELECT k FROM Korisnici k WHERE k.ime = :ime"),
    @NamedQuery(name = "Korisnici.findByPrezime", query = "SELECT k FROM Korisnici k WHERE k.prezime = :prezime"),
    @NamedQuery(name = "Korisnici.findByKontakt", query = "SELECT k FROM Korisnici k WHERE k.kontakt = :kontakt"),
    @NamedQuery(name = "Korisnici.findByEmail", query = "SELECT k FROM Korisnici k WHERE k.email = :email"),
    @NamedQuery(name = "Korisnici.findByKorisnickoIme", query = "SELECT k FROM Korisnici k WHERE k.korisnickoIme = :korisnickoIme"),
    @NamedQuery(name = "Korisnici.findByLozinka", query = "SELECT k FROM Korisnici k WHERE k.lozinka = :lozinka"),
    @NamedQuery(name = "Korisnici.findByTeretana", query = "SELECT k FROM Korisnici k WHERE k.teretana = :teretana"),
    @NamedQuery(name = "Korisnici.findByTipClanarine", query = "SELECT k FROM Korisnici k WHERE k.tipClanarine = :tipClanarine")})
public class Korisnici implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_korisnik")
    private Integer idKorisnik;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ime")
    private String ime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "prezime")
    private String prezime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
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
    @Column(name = "korisnicko_ime")
    private String korisnickoIme;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "lozinka")
    private String lozinka;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "teretana")
    private String teretana;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tip_clanarine")
    private String tipClanarine;

    public Korisnici() {
    }

    public Korisnici(Integer idKorisnik) {
        this.idKorisnik = idKorisnik;
    }

    public Korisnici(Integer idKorisnik, String ime, String prezime, String kontakt, String email, String korisnickoIme, String lozinka, String teretana, String tipClanarine) {
        this.idKorisnik = idKorisnik;
        this.ime = ime;
        this.prezime = prezime;
        this.kontakt = kontakt;
        this.email = email;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
        this.teretana = teretana;
        this.tipClanarine = tipClanarine;
    }

    public Integer getIdKorisnik() {
        return idKorisnik;
    }

    public void setIdKorisnik(Integer idKorisnik) {
        this.idKorisnik = idKorisnik;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
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

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getTeretana() {
        return teretana;
    }

    public void setTeretana(String teretana) {
        this.teretana = teretana;
    }

    public String getTipClanarine() {
        return tipClanarine;
    }

    public void setTipClanarine(String tipClanarine) {
        this.tipClanarine = tipClanarine;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKorisnik != null ? idKorisnik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Korisnici)) {
            return false;
        }
        Korisnici other = (Korisnici) object;
        if ((this.idKorisnik == null && other.idKorisnik != null) || (this.idKorisnik != null && !this.idKorisnik.equals(other.idKorisnik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "web.Korisnici[ idKorisnik=" + idKorisnik + " ]";
    }
    
}
