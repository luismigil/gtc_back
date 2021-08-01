package oh.gtc.back.model;

import javax.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer cardType;
    private Integer cmc;
    private String color;
    private Integer rarity;
    private String artist;
    @ManyToOne
    @JoinColumn(name = "card_set", referencedColumnName = "id")
    private CardSet cardSet;
    private Integer power;
    private Integer toughness;
    private String cardImageUri;
    private String picImageUri;


    protected Card(){

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

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public Integer getCmc() {
        return cmc;
    }

    public void setCmc(Integer cmc) {
        this.cmc = cmc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public CardSet getCardSet() {
        return cardSet;
    }

    public void setCardSet(CardSet cardSet) {
        this.cardSet = cardSet;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getToughness() {
        return toughness;
    }

    public void setToughness(Integer toughness) {
        this.toughness = toughness;
    }

    public String getCardImageUri() {
        return cardImageUri;
    }

    public void setCardImageUri(String cardImageUri) {
        this.cardImageUri = cardImageUri;
    }

    public String getPicImageUri() {
        return picImageUri;
    }

    public void setPicImageUri(String picImageUri) {
        this.picImageUri = picImageUri;
    }
}
