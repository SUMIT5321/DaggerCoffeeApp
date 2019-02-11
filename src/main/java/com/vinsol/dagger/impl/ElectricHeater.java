package com.vinsol.dagger.impl;

import com.vinsol.dagger.base.Heater;

public class ElectricHeater implements Heater {

  private boolean heating;

  @Override public void on() {
    System.out.println("~ ~ ~ heating ~ ~ ~");
    this.heating = true;
  }

  @Override public void off() {
    this.heating = false;
  }

  @Override
  public Boolean isHot() {
    return heating;
  }

}
