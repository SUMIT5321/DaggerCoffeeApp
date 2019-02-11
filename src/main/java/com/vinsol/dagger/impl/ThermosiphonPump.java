package com.vinsol.dagger.impl;

import com.vinsol.dagger.base.Heater;
import com.vinsol.dagger.base.Pump;


public class ThermosiphonPump implements Pump {

  private final Heater heater;

  public ThermosiphonPump(Heater heater) {
    this.heater = heater;
  }

  @Override public void pump() {
    if (heater.isHot()) {
      System.out.println("=> => pumping => =>");
    }
  }

}
