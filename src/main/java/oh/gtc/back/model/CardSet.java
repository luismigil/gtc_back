package oh.gtc.back.model;

import org.springframework.data.annotation.Id;

import java.sql.Date;
import java.util.List;
import java.util.Set;

public class CardSet {
    private Integer id;

    private String name;

    private String code;

    private Date releaseDate;

    private List<Card> cards;

    protected CardSet(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
