package oh.gtc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfig {

    @Value("${domain.datasource.url}")
    private String url;

    @Value("${domain.datasource.username}")
    private String username;

    @Value("${domain.datasource.password}")
    private String password;

    @Value("${domain.datasource.type}")
    private String type;

    @Value("${domain.datasource.driver-class}")
    private String driverClass;

    @Bean
    public DataSource dataSource() {
        if (type.equals("MYSQL")) {
            return DataSourceBuilder
                    .create()
                    .username("username")
                    .password(password)
                    .url(url)
                    .driverClassName(driverClass)
                    .build();
        } else {
            EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
            return builder
                    .setType(EmbeddedDatabaseType.H2)
                    .build();
        }
    }
}