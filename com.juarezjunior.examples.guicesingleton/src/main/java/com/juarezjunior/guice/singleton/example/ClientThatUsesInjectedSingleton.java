package com.juarezjunior.guice.singleton.example;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class ClientThatUsesInjectedSingleton {
  
  @Inject
  SingletonUtilityToBeInjected singleton;
  
  public static void main(String args[]){
    
    
    Injector injector = Guice.createInjector(new SingletonModule());
    ClientThatUsesInjectedSingleton client = new ClientThatUsesInjectedSingleton();
    injector.injectMembers(client);  
    
    client.finalMessageMethodTest();
    
  }
  
  public void finalMessageMethodTest(){
    
    singleton.emitMessageForInjectedSingleton();
    
  }
  

}
