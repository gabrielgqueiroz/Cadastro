package com.example.cadastro;

public class Formulario {
    private String fullName;
    private String tel;
    private String email;
    private boolean signEmail;
    private boolean isMale;
    private String city;
    private String state;

    public Formulario() {
    }

    public Formulario(String fullName, String tel, String email, boolean signEmail, boolean isMale, String city, String state) {
        this.fullName = fullName;
        this.tel = tel;
        this.email = email;
        this.signEmail = signEmail;
        this.isMale = isMale;
        this.city = city;
        this.state = state;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSignEmail() {
        return signEmail;
    }

    public void setSignEmail(boolean signEmail) {
        this.signEmail = signEmail;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Nome Completo='" + fullName + '\'' +
                ", Telefone='" + tel + '\'' +
                ", E-mail='" + email + '\'' +
                ", Ingresso na lista de email=" + signEmail +
                ", Sexo=" + (isMale ? "Mascullino" : "Feminino") +
                ", Cidade='" + city + '\'' +
                ", Estado='" + state + '\'';
    }
}
