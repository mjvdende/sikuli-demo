package com.mjvdende.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.*;
import org.sikuli.basics.Debug;
import com.mjvdende.utils.DataProperties;

import java.io.IOException;
import java.util.Properties;

public class SendEmailTest {

  private Sikulix script;
  private Process app;

  @Test
  public void testCreateNewEmail() throws Exception {
    //Debug.setDebugLevel(3);
    Screen screen = new Screen();
    screen.click("src/test/resources/new-email.png");
  }
}
