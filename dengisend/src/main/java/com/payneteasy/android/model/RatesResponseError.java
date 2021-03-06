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
 * RatesResponseError
 */

public class RatesResponseError {
  @SerializedName("cause")
  private String cause = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("message")
  private String message = null;

  public RatesResponseError cause(String cause) {
    this.cause = cause;
    return this;
  }

   /**
   * the cause of the error
   * @return cause
  **/
  @ApiModelProperty(value = "the cause of the error")
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public RatesResponseError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The unique error code
   * @return code
  **/
  @ApiModelProperty(value = "The unique error code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RatesResponseError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * the description of the error
   * @return message
  **/
  @ApiModelProperty(value = "the description of the error")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatesResponseError ratesResponseError = (RatesResponseError) o;
    return Objects.equals(this.cause, ratesResponseError.cause) &&
        Objects.equals(this.code, ratesResponseError.code) &&
        Objects.equals(this.message, ratesResponseError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, code, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatesResponseError {\n");
    
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

