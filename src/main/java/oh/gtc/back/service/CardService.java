package oh.gtc.back.service;

import oh.gtc.back.model.Card;
import oh.gtc.back.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CardService {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/card")
    public void getCards(){
        List<Card> cards = cardRepository.findAll();
    }
}
