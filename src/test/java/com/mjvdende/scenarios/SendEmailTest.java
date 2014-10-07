package com.mjvdende.scenarios;

import com.mjvdende.pageobjects.ToolBarMainWindow;
import com.mjvdende.utils.Helper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.*;

public class SendEmailTest extends BaseTestCase {

  @Test
  public void testCreateNewEmail() throws Exception {
    ToolBarMainWindow toolbar = new ToolBarMainWindow();
    toolbar.newEmail();
    // TODO assert something
    assert true;
  }
}
