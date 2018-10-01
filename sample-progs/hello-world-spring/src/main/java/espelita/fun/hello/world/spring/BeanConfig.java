package espelita.fun.hello.world.spring;

import espelita.fun.hello.world.spring.deps.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import espelita.fun.hello.world.spring.deps.Dog;
import espelita.fun.hello.world.spring.deps.impl.BigCat;
import espelita.fun.hello.world.spring.deps.impl.BigDog;

/**
 * Provides dependencies in Spring. Follows the IoC principle.
 *
 * @author Jonas
 */
@Configuration
public class BeanConfig {

    @Bean
    public Dog depA() {
        return new BigDog();
//        return new SmallDog();

    }

    @Bean
    public Cat depB() {
        return new BigCat();
//        return new SmallCat();
    }

}
