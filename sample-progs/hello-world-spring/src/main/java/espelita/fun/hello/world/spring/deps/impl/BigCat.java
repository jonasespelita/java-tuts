package espelita.fun.hello.world.spring.deps.impl;

import espelita.fun.hello.world.spring.deps.Cat;

/**
 *
 * @author Jonas
 */
public class BigCat implements Cat{

    @Override
    public void meow() {
        System.out.println("MEOW");
    }
    
}
