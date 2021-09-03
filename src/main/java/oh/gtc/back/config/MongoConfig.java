package oh.gtc.back.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "oh.gtc.back.repository")
public class MongoConfig{

//    @Override
//    protected String getDatabaseName() {
//        return "gtc";
//    }

    @Bean
    public MongoClient mongo() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/gtc");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

//    @Override
//    public Collection getMappingBasePackages() {
//        return Collections.singleton("oh.gtc");
//    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongo(), "gtc");
    }
}