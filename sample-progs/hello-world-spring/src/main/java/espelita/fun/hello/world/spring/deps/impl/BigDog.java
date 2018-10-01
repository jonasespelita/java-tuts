package espelita.fun.hello.world.spring.deps.impl;

import espelita.fun.hello.world.spring.deps.Dog;

/**
 *
 * @author Jonas
 */
public class BigDog implements Dog{

    @Override
    public void bark() {
        System.out.println("WOOF");
    }
    
}
