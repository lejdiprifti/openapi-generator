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
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * User
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_ID,
  User.JSON_PROPERTY_USERNAME,
  User.JSON_PROPERTY_FIRST_NAME,
  User.JSON_PROPERTY_LAST_NAME,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_PASSWORD,
  User.JSON_PROPERTY_PHONE,
  User.JSON_PROPERTY_USER_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class User   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private Long id;

  public static final String JSON_PROPERTY_USERNAME = "username";
  @JsonProperty(JSON_PROPERTY_USERNAME)
  private String username;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  private String lastName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  @JsonProperty(JSON_PROPERTY_EMAIL)
  private String email;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  private String password;

  public static final String JSON_PROPERTY_PHONE = "phone";
  @JsonProperty(JSON_PROPERTY_PHONE)
  private String phone;

  public static final String JSON_PROPERTY_USER_STATUS = "userStatus";
  @JsonProperty(JSON_PROPERTY_USER_STATUS)
  private Integer userStatus;

  public User id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty(value = "id")
  @Schema(description = "")
  

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @JsonProperty(value = "username")
  @Schema(description = "")
  

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @JsonProperty(value = "firstName")
  @Schema(description = "")
  

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @JsonProperty(value = "lastName")
  @Schema(description = "")
  

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @JsonProperty(value = "email")
  @Schema(description = "")
  

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @JsonProperty(value = "password")
  @Schema(description = "")
  

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   **/
  @JsonProperty(value = "phone")
  @Schema(description = "")
  

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User userStatus(Integer userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * User Status
   * @return userStatus
   **/
  @JsonProperty(value = "userStatus")
  @Schema(description = "User Status")
  

  public Integer getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.userStatus, user.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, email, password, phone, userStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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

