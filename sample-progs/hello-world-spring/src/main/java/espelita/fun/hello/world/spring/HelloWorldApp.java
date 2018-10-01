package espelita.fun.hello.world.spring;

import espelita.fun.hello.world.spring.deps.Cat;
import espelita.fun.hello.world.spring.deps.Dog;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Jonas
 */
@SpringBootApplication
public class HelloWorldApp {

    private final Cat myCat;
    private final Dog myDog;

    // spring ioc via BeanConfig
    @Autowired
    public HelloWorldApp(Cat myCat, Dog myDog) {
        this.myCat = myCat;
        this.myDog = myDog;
    }

    @PostConstruct
    public void talk() {
        System.out.println("=========================");

        myCat.meow();
        myDog.bark();

        System.out.println("=========================");

    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApp.class, args);

    }
}
