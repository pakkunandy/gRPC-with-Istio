// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package com.manning.mss.ch12.grpc.sample01;

public interface LineItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sample01.LineItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.sample01.Product product = 1;</code>
   */
  boolean hasProduct();
  /**
   * <code>.sample01.Product product = 1;</code>
   */
  com.manning.mss.ch12.grpc.sample01.Product getProduct();
  /**
   * <code>.sample01.Product product = 1;</code>
   */
  com.manning.mss.ch12.grpc.sample01.ProductOrBuilder getProductOrBuilder();

  /**
   * <code>int32 quantity = 2;</code>
   */
  int getQuantity();
}
