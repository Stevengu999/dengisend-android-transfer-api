/*
 * Payneteasy Android Transfer DAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.payneteasy.android.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Consumer
 */

public class Consumer {
  @SerializedName("device")
  private ConsumerDevice device = null;

  @SerializedName("ipAddresses")
  private List<String> ipAddresses = null;

  @SerializedName("email")
  private String email = null;

  public Consumer device(ConsumerDevice device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @ApiModelProperty(value = "")
  public ConsumerDevice getDevice() {
    return device;
  }

  public void setDevice(ConsumerDevice device) {
    this.device = device;
  }

  public Consumer ipAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public Consumer addIpAddressesItem(String ipAddressesItem) {
    if (this.ipAddresses == null) {
      this.ipAddresses = new ArrayList<String>();
    }
    this.ipAddresses.add(ipAddressesItem);
    return this;
  }

   /**
   * Consumer&#39;s IP addresses
   * @return ipAddresses
  **/
  @ApiModelProperty(value = "Consumer's IP addresses")
  public List<String> getIpAddresses() {
    return ipAddresses;
  }

  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  public Consumer email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The consumer’s email address
   * @return email
  **/
  @ApiModelProperty(value = "The consumer’s email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consumer consumer = (Consumer) o;
    return Objects.equals(this.device, consumer.device) &&
        Objects.equals(this.ipAddresses, consumer.ipAddresses) &&
        Objects.equals(this.email, consumer.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, ipAddresses, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consumer {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

