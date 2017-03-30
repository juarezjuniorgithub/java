package com.juarezjunior.guice.singleton.example;

import org.junit.Assert;
import org.junit.Test;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Singleton;

public class InjectorSingletonTest {

  static class ModuleOne extends AbstractModule {

    @Override
    protected void configure() {
      bind(MySingleton.class);
    }

  }

  static class ModuleTwo extends AbstractModule {

    final MySingleton singleton;

    @Inject
    ModuleTwo(MySingleton singleton) {
      this.singleton = singleton;
    }

    @Override
    protected void configure() {
      bind(MySingleton.class).toInstance(singleton);
    }

  }

  @Singleton
  static class MySingleton {
  }

  @Test
  public void test() {

    // via injector one
    Injector injectorOne = Guice.createInjector(new ModuleOne());
    MySingleton singletonFromInjectorOne = injectorOne
        .getInstance(MySingleton.class);

    // via injector one, then injector two (indirectly)
    Module moduleTwo = injectorOne.getInstance(ModuleTwo.class);
    Injector injectorTwo = Guice.createInjector(moduleTwo);
    MySingleton singletonFromInjectorTwo = injectorTwo
        .getInstance(MySingleton.class);

    // final assertion
    Assert.assertSame(singletonFromInjectorOne, singletonFromInjectorTwo);

  }
}