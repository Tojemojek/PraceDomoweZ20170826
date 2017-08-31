package pl.sda.javawwa.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String surname;
    private String Pesel;
    private String street;
    private Integer streetNumber;
    private String city;
    private List<Account> accounts = new ArrayList();

    public Client(String name, String surname, String pesel, String street, Integer streetNumber, String city, List<Account> accounts) {
        this.name = name;
        this.surname = surname;
        Pesel = pesel;
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        if (surname != null ? !surname.equals(client.surname) : client.surname != null) return false;
        if (Pesel != null ? !Pesel.equals(client.Pesel) : client.Pesel != null) return false;
        if (street != null ? !street.equals(client.street) : client.street != null) return false;
        if (streetNumber != null ? !streetNumber.equals(client.streetNumber) : client.streetNumber != null)
            return false;
        if (city != null ? !city.equals(client.city) : client.city != null) return false;
        return accounts != null ? accounts.equals(client.accounts) : client.accounts == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (Pesel != null ? Pesel.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (accounts != null ? accounts.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", Pesel='" + Pesel + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", city='" + city + '\'' +
                ", accounts=" + accounts +
                '}';
    }

}
