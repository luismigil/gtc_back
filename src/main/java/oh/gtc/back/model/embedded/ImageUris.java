package oh.gtc.back.model.embedded;

import org.springframework.data.mongodb.core.mapping.Field;

public class ImageUris {

    @Field(name = "art_crop")
    private String artCrop;

    @Field(name = "border_crop")
    private String borderCrop;

    public String getArtCrop() {
        return artCrop;
    }

    public void setArtCrop(String artCrop) {
        this.artCrop = artCrop;
    }

    public String getBorderCrop() {
        return borderCrop;
    }

    public void setBorderCrop(String borderCrop) {
        this.borderCrop = borderCrop;
    }
}
