package oh.gtc.back.repository;

import oh.gtc.back.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface CardRepository extends MongoRepository<Card, String> {

    Card findByName(String name);
}
