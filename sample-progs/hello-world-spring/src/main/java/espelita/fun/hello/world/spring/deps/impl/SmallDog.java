package espelita.fun.hello.world.spring.deps.impl;

import espelita.fun.hello.world.spring.deps.Dog;

/**
 *
 * @author Jonas
 */
public class SmallDog implements Dog {

    @Override
    public void bark() {
        System.out.println("yip");
    }

}
