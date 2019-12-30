package Entities;
// Generated Dec 10, 2018 1:14:15 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Eleve generated by hbm2java
 */
public class Eleve  implements java.io.Serializable {


     private String idEleve;
     private Filieres filieres;
     private String nom;
     private String prenom;
     private String email;
     private String tel;
     private Date dateNaissance;
     private String lieuNaissance;

    public Eleve() {
    }

    public Eleve(String idEleve, Filieres filieres, String nom, String prenom, String email, String tel, Date dateNaissance, String lieuNaissance) {
       this.idEleve = idEleve;
       this.filieres = filieres;
       this.nom = nom;
       this.prenom = prenom;
       this.email = email;
       this.tel = tel;
       this.dateNaissance = dateNaissance;
       this.lieuNaissance = lieuNaissance;
    }
   
    public String getIdEleve() {
        return this.idEleve;
    }
    
    public void setIdEleve(String idEleve) {
        this.idEleve = idEleve;
    }
    public Filieres getFilieres() {
        return this.filieres;
    }
    
    public void setFilieres(Filieres filieres) {
        this.filieres = filieres;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    public Date getDateNaissance() {
        return this.dateNaissance;
    }
    
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public String getLieuNaissance() {
        return this.lieuNaissance;
    }
    
    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }




}


