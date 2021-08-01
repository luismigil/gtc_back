package oh.gtc.back.dto;

public class CardDTO {

    private Integer id;
    private String name;
    private Integer cardType;
    private Integer cmc;
    private String color;
    private Integer rarity;
    private String artist;
    private Integer cardSet;
    private Integer power;
    private Integer toughness;
    private String cardImageUri;
    private String picImageUri;

    private CardDTO(){

    }

    public Integer getId() {
        return id;
    }

    public CardDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CardDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getCardType() {
        return cardType;
    }

    public CardDTO setCardType(Integer cardType) {
        this.cardType = cardType;
        return this;
    }

    public Integer getCmc() {
        return cmc;
    }

    public CardDTO setCmc(Integer cmc) {
        this.cmc = cmc;
        return this;
    }

    public String getColor() {
        return color;
    }

    public CardDTO setColor(String color) {
        this.color = color;
        return this;
    }

    public Integer getRarity() {
        return rarity;
    }

    public CardDTO setRarity(Integer rarity) {
        this.rarity = rarity;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public CardDTO setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public Integer getCardSet() {
        return cardSet;
    }

    public CardDTO setCardSet(Integer cardSet) {
        this.cardSet = cardSet;
        return this;
    }

    public Integer getPower() {
        return power;
    }

    public CardDTO setPower(Integer power) {
        this.power = power;
        return this;
    }

    public Integer getToughness() {
        return toughness;
    }

    public CardDTO setToughness(Integer toughness) {
        this.toughness = toughness;
        return this;
    }

    public String getCardImageUri() {
        return cardImageUri;
    }

    public CardDTO setCardImageUri(String cardImageUri) {
        this.cardImageUri = cardImageUri;
        return this;
    }

    public String getPicImageUri() {
        return picImageUri;
    }

    public CardDTO setPicImageUri(String picImageUri) {
        this.picImageUri = picImageUri;
        return this;
    }

    @Override
    public String toString() {
        return "CardDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardType=" + cardType +
                ", cmc=" + cmc +
                ", color='" + color + '\'' +
                ", rarity=" + rarity +
                ", artist='" + artist + '\'' +
                ", cardSet=" + cardSet +
                ", power=" + power +
                ", toughness=" + toughness +
                ", cardImageUri='" + cardImageUri + '\'' +
                ", picImageUri='" + picImageUri + '\'' +
                '}';
    }

    public static class Builder{
        private Integer id;
        private String name;
        private Integer cardType;
        private Integer cmc;
        private String color;
        private Integer rarity;
        private String artist;
        private Integer cardSet;
        private Integer power;
        private Integer toughness;
        private String cardImageUri;
        private String picImageUri;

        public Builder(final Integer id){
            this.id = id;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCardType(Integer cardType) {
            this.cardType = cardType;
            return this;
        }

        public Builder setCmc(Integer cmc) {
            this.cmc = cmc;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setRarity(Integer rarity) {
            this.rarity = rarity;
            return this;
        }

        public Builder setArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public Builder setCardSet(Integer cardSet) {
            this.cardSet = cardSet;
            return this;
        }

        public Builder setPower(Integer power) {
            this.power = power;
            return this;
        }

        public Builder setToughness(Integer toughness) {
            this.toughness = toughness;
            return this;
        }

        public Builder setCardImageUri(String cardImageUri) {
            this.cardImageUri = cardImageUri;
            return this;
        }

        public Builder setPicImageUri(String picImageUri) {
            this.picImageUri = picImageUri;
            return this;
        }

        public CardDTO build(){
            CardDTO cardDTO = new CardDTO();
            cardDTO.setName(this.name);
            cardDTO.setCardType(this.cardType);
            cardDTO.setCmc(this.cmc);
            cardDTO.setColor(this.color);
            cardDTO.setRarity(this.rarity);
            cardDTO.setArtist(this.artist);
            cardDTO.setCardSet(this.cardSet);
            cardDTO.setPower(this.power);
            cardDTO.setToughness(this.toughness);
            cardDTO.setCardImageUri(this.cardImageUri);
            cardDTO.setPicImageUri(this.picImageUri);

            return cardDTO;
        }
    }



}
