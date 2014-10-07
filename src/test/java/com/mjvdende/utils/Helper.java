package com.mjvdende.utils;

import org.sikuli.script.Screen;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {

  private static Screen screen;

  public synchronized static Screen getInstance() {
    if (screen == null){
      screen = new Screen();
    }
    return screen;
  }

  public static Process openApp () {
    try {
      String os = System.getProperty("os.name");
      if (containsIgnoreCase(os, "mac"))  {
        String[] cmd = {"/usr/bin/open", "-a" , DataProperties.get("app.path")};
        Runtime.getRuntime().exec(cmd);
      } else {
        // TODO support other os then mac os
        System.out.println(System.getProperty("os.name"));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static boolean containsIgnoreCase( String haystack, String needle ) {
    if(needle.equals(""))
      return true;
    if(haystack == null || needle == null || haystack .equals(""))
      return false;

    Pattern p = Pattern.compile(needle,Pattern.CASE_INSENSITIVE+Pattern.LITERAL);
    Matcher m = p.matcher(haystack);
    return m.find();
  }
}
