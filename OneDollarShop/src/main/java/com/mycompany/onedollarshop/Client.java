package com.mycompany.onedollarshop;

/**
 *
 * @author Maya
 */
public class Client {
    
    private String _id;
    private String _prenom;
    private String _nom;
    private String _telephone;
    private String _adresse;
    
    public Client(ClientBuilder db)
    {
        _id = db._id;
        _prenom = db._prenom;
        _nom = db._nom;
        _telephone = db._telephone;
        _adresse = db._adresse;
    }
    
    public String getId(){
        return _id;
    }
    public String getPrenom(){
        return _prenom;
    }
    public String getNom(){
        return _nom;
    }
    public String getTelephone(){
        return _telephone;
    }
    public String getAdresse(){
        return _adresse;
    }
    public void setId(String id){
        _id = id;
    }
    public void setPrenom(String prenom){
        _prenom = prenom;
    }
    public void setNom(String nom){
        _nom = nom;
    }
    public void setTelephone(String tel){
        _telephone = tel;
    }
    public void setAdresse(String addresse){
        _adresse = addresse;
    }
    public String afficher(){
        return (_id + "-" + _prenom + "-" + _nom + "-" + _telephone + "-" + _adresse);
    }
    
    public static class ClientBuilder {
        String _id;
        String _prenom;
        String _nom;
        String _telephone;
        String _adresse;
        
        public ClientBuilder(String id) {
            this._id = id;
        }
        
        public ClientBuilder prenom(String prenom) {
            this._prenom = prenom;
            return this;
        }
        public ClientBuilder nom(String nom) {
            this._nom = nom;
            return this;
        }
        public ClientBuilder telephone(String telephone) {
            this._telephone = telephone;
            return this;
        }
        public ClientBuilder adresse(String adresse) {
            this._adresse = adresse;
            return this;
        }
        public Client build(){
            return new Client(this);
        }
    }
}
