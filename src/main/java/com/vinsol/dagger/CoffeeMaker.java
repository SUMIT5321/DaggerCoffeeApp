package com.vinsol.dagger;

import com.vinsol.dagger.base.Heater;
import com.vinsol.dagger.base.Pump;

class CoffeeMaker {

  private final Heater heater;
  private final Pump pump;

  CoffeeMaker(Heater heater, Pump pump) {
    this.heater = heater;
    this.pump = pump;
  }

  void brew() {
    heater.on();

    pump.pump();
    System.out.println(" [_]P coffee! [_]P ");

    heater.off();
  }
}
