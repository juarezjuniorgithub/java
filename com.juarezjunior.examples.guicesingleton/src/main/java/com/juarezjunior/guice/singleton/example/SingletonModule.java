package com.juarezjunior.guice.singleton.example;

import static com.google.inject.matcher.Matchers.any;
import static com.google.inject.matcher.Matchers.subclassesOf;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class SingletonModule extends AbstractModule {

  @Override
  protected void configure() {

    bind(SingletonUtilityToBeInjected.class).in(Singleton.class);

    bindInterceptor(subclassesOf(SingletonUtilityToBeInjected.class), any(),
        new SimpleAOPInterceptor());

  }

}
