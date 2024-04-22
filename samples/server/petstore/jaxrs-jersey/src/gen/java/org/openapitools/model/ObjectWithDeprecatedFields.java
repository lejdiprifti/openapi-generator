/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeprecatedObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ObjectWithDeprecatedFields
 */
@JsonPropertyOrder({
  ObjectWithDeprecatedFields.JSON_PROPERTY_UUID,
  ObjectWithDeprecatedFields.JSON_PROPERTY_ID,
  ObjectWithDeprecatedFields.JSON_PROPERTY_DEPRECATED_REF,
  ObjectWithDeprecatedFields.JSON_PROPERTY_BARS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ObjectWithDeprecatedFields   {
  public static final String JSON_PROPERTY_UUID = "uuid";
  @JsonProperty(JSON_PROPERTY_UUID)
  private String uuid;

  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private BigDecimal id;

  public static final String JSON_PROPERTY_DEPRECATED_REF = "deprecatedRef";
  @JsonProperty(JSON_PROPERTY_DEPRECATED_REF)
  private DeprecatedObject deprecatedRef;

  public static final String JSON_PROPERTY_BARS = "bars";
  @JsonProperty(JSON_PROPERTY_BARS)
  private List<String> bars = new ArrayList<>();

  public ObjectWithDeprecatedFields uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
   **/
  @JsonProperty(value = "uuid")
  @ApiModelProperty(value = "")
  

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ObjectWithDeprecatedFields id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(value = "")
  

  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public ObjectWithDeprecatedFields deprecatedRef(DeprecatedObject deprecatedRef) {
    this.deprecatedRef = deprecatedRef;
    return this;
  }

  /**
   * Get deprecatedRef
   * @return deprecatedRef
   **/
  @JsonProperty(value = "deprecatedRef")
  @ApiModelProperty(value = "")
  

  public DeprecatedObject getDeprecatedRef() {
    return deprecatedRef;
  }

  public void setDeprecatedRef(DeprecatedObject deprecatedRef) {
    this.deprecatedRef = deprecatedRef;
  }

  public ObjectWithDeprecatedFields bars(List<String> bars) {
    this.bars = bars;
    return this;
  }

  public ObjectWithDeprecatedFields addBarsItem(String barsItem) {
    if (this.bars == null) {
      this.bars = new ArrayList<>();
    }
    this.bars.add(barsItem);
    return this;
  }

  /**
   * Get bars
   * @return bars
   **/
  @JsonProperty(value = "bars")
  @ApiModelProperty(value = "")
  

  public List<String> getBars() {
    return bars;
  }

  public void setBars(List<String> bars) {
    this.bars = bars;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectWithDeprecatedFields objectWithDeprecatedFields = (ObjectWithDeprecatedFields) o;
    return Objects.equals(this.uuid, objectWithDeprecatedFields.uuid) &&
        Objects.equals(this.id, objectWithDeprecatedFields.id) &&
        Objects.equals(this.deprecatedRef, objectWithDeprecatedFields.deprecatedRef) &&
        Objects.equals(this.bars, objectWithDeprecatedFields.bars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, id, deprecatedRef, bars);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectWithDeprecatedFields {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deprecatedRef: ").append(toIndentedString(deprecatedRef)).append("\n");
    sb.append("    bars: ").append(toIndentedString(bars)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

