package com.juarezjunior.guice.singleton.example;

import com.google.inject.Singleton;

@Singleton
public class SingletonUtilityToBeInjected {
  
  public SingletonUtilityToBeInjected(){
    
    System.out.println("SingletonUtilityToBeInjected - CONSTRUCTOR");
    
  }
  
  public void emitMessageForInjectedSingleton(){
    
    System.out.println("SingletonUtilityToBeInjected - emitMessageForInjectedSingleton METHOD CALLED!");
    
  }
  

}
