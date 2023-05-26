package Skytech.student.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class University {
    private int id ;
    private String country;
    private String alpha_two_code;
    private String name ;
    private String state_province;
    private String domains;
    private String webPages;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAlpha_two_code() {
        return alpha_two_code;
    }

    public void setAlpha_two_code(String alpha_two_code) {
        this.alpha_two_code = alpha_two_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public String getDomains() {
        return domains;
    }

    public void setDomains(String domains) {
        this.domains = domains;
    }

    public String getWebPages() {
        return webPages;
    }

    public void setWebPages(String webPages) {
        this.webPages = webPages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "University{" +
                "country='" + country + '\'' +
                ", alpha_two_code='" + alpha_two_code + '\'' +
                ", name='" + name + '\'' +
                ", state_province='" + state_province + '\'' +
                ", domains='" + domains + '\'' +
                ", webPages='" + webPages + '\'' +
                '}';
    }
}
