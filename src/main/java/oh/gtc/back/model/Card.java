package oh.gtc.back.model;


import oh.gtc.back.model.embedded.ImageUris;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "card")
public class Card {
    @Id
    private String id;

    private String name;

    @Field(name = "set_id")
    private String cardSetId;

    @Field(name = "image_uris")
    private ImageUris imageUris;

    protected Card() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardSetId() {
        return cardSetId;
    }

    public void setCardSetId(String cardSetId) {
        this.cardSetId = cardSetId;
    }

    public ImageUris getImageUris() {
        return imageUris;
    }

    public void setImageUris(ImageUris imageUris) {
        this.imageUris = imageUris;
    }

    @Override
    public String toString() {
        return String.format("Card [id='%s', name='%s', cardSetId='%s', imageUris=[artCrop='%s', borderCrop='%s']]",
                id, name, cardSetId, imageUris.getArtCrop(), imageUris.getBorderCrop());
    }
}
