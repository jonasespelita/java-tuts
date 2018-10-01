package espelita.fun.hello.world.spring.deps.impl;

import espelita.fun.hello.world.spring.deps.Cat;

/**
 *
 * @author Jonas
 */
public class SmallCat implements Cat {

    @Override
    public void meow() {
        System.out.println("mew");
    }

}
