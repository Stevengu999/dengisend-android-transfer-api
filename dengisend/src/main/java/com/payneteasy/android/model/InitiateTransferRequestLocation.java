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

/**
 * InitiateTransferRequestLocation
 */

public class InitiateTransferRequestLocation {
  @SerializedName("lat")
  private Double lat = null;

  @SerializedName("lng")
  private Double lng = null;

  public InitiateTransferRequestLocation lat(Double lat) {
    this.lat = lat;
    return this;
  }

   /**
   * The latitude specified in the range of -90.0 through +90.0, both inclusive
   * @return lat
  **/
  @ApiModelProperty(value = "The latitude specified in the range of -90.0 through +90.0, both inclusive")
  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public InitiateTransferRequestLocation lng(Double lng) {
    this.lng = lng;
    return this;
  }

   /**
   * The longitude specified in the range -180.0 through +180.0, both inclusive
   * @return lng
  **/
  @ApiModelProperty(value = "The longitude specified in the range -180.0 through +180.0, both inclusive")
  public Double getLng() {
    return lng;
  }

  public void setLng(Double lng) {
    this.lng = lng;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateTransferRequestLocation initiateTransferRequestLocation = (InitiateTransferRequestLocation) o;
    return Objects.equals(this.lat, initiateTransferRequestLocation.lat) &&
        Objects.equals(this.lng, initiateTransferRequestLocation.lng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lat, lng);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateTransferRequestLocation {\n");
    
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
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

