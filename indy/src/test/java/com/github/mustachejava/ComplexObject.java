package com.github.mustachejava;

import java.util.Arrays;
import java.util.List;

public class ComplexObject {
  String header = "Colors";
  List<Color> item = Arrays.asList(
          new Color("red", true, "#Red"),
          new Color("green", false, "#Green"),
          new Color("blue", false, "#Blue")
  );

  boolean list() {
    return item.size() != 0;
  }

  boolean empty() {
    return item.size() == 0;
  }

  private static class Color {
    boolean link() {
      return !current;
    }

    Color(String name, boolean current, String url) {
      this.name = name;
      this.current = current;
      this.url = url;
    }

    String name;
    boolean current;
    String url;
  }
}
