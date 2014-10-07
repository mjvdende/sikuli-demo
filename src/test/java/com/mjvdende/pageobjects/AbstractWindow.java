package com.mjvdende.pageobjects;

import com.mjvdende.utils.Helper;
import org.sikuli.script.Screen;

public class AbstractWindow {
  protected Screen getDriver() {
    return Helper.getInstance();
  }
}
