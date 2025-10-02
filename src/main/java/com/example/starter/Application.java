package com.example.starter;


import com.example.starter.verticles.MainVerticle;
import io.vertx.core.Vertx;

public class Application {

  public static void main(final String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new MainVerticle());

  }

}
