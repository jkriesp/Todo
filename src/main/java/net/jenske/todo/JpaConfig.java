package net.jenske.todo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Configuration
@EnableJpaRepositories(basePackages = "net.jenske.todo.repository")
@EntityScan(basePackages = "net.jenske.todo.model")
public class JpaConfig {
    // Add any additional JPA-related configuration here
}
