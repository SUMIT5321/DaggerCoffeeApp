package com.vinsol.dagger;


import com.vinsol.dagger.base.Heater;
import com.vinsol.dagger.base.Pump;
import com.vinsol.dagger.impl.ElectricHeater;
import com.vinsol.dagger.impl.ThermosiphonPump;

public class CoffeeApp {

  public static void main(String[] args) {

    // First create a heater
    Heater heater = new ElectricHeater();

    // Then create a pump
    Pump pump = new ThermosiphonPump(heater);

    // Then create a coffee maker
    CoffeeMaker maker = new CoffeeMaker(heater, pump);

    maker.brew();
  }

}