package com.internetShopProject.domain;

/**
 * Created by Андрей on 02.03.2017.
 */
public class Customer  {
    public String Name;
    public String Contact;
    public String login;
    public String password;
    public String eMail;

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getContact() {
        return Contact;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return Name;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
