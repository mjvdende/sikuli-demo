package com.mjvdende.scenarios;

import com.mjvdende.utils.DataProperties;
import com.mjvdende.utils.Helper;
import org.junit.After;
import org.junit.Before;
import org.sikuli.script.*;

public class BaseTestCase {
  private Process app;

  @Before
  public void setUp() throws InterruptedException, FindFailed {
    app = Helper.openApp();
  }

  @After
  public void tearDown() {
    // TODO close application
  }
}
