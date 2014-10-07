package com.mjvdende.pageobjects;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;

public class ToolBarMainWindow extends AbstractWindow {

  private Pattern newEmail;
  private Region window;

  public ToolBarMainWindow() throws FindFailed {
    newEmail = new Pattern("src/test/resources/new-email.png");
    window = getDriver();
  }

  public ToolBarMainWindow newEmail() throws FindFailed {
    window.click(newEmail);
    return this;
  }
}
