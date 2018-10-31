package com.devinrsmith.example;

import com.google.common.io.Resources;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Helper {
  public static void show(Class<?> context, String resource) throws IOException {
    URL resourceUrl = Resources.getResource(context, resource);
    String value = Resources.asCharSource(resourceUrl, StandardCharsets.UTF_8).read();
    System.out.println(value);
  }
}
