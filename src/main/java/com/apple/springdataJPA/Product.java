package com.apple.springdataJPA;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Table(name = "product",
  uniqueConstraints = {
        @UniqueConstraint(name = "product_email_unique", columnNames = "user_email")
  })
@Entity(name = "Product")
public class Product {
  @Id
  @SequenceGenerator(name = "SeqGen", sequenceName = "SeqGen", allocationSize = 1)
  @GeneratedValue(strategy = SEQUENCE, generator = "SeqGen")
  @Column(name = "id", updatable = false)
  private Long id;

  @Column(name = "product_name", nullable = false, columnDefinition = "TEXT")
  private String productName;

  @Column(name = "purchased_user", nullable = false, columnDefinition = "TEXT")
  private String purchasedUser;

  @Column(name = "user_email", nullable = false, columnDefinition = "TEXT")
  private String userEmail;

  @Column(name = "user_mobile", nullable = false)
  private Integer userMobile;

  public Product() {
  }

  public Product(String productName, String purchasedUser, String userEmail, Integer userMobile) {
    this.productName = productName;
    this.purchasedUser = purchasedUser;
    this.userEmail = userEmail;
    this.userMobile = userMobile;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getPurchasedUser() {
    return purchasedUser;
  }

  public void setPurchasedUser(String purchasedUser) {
    this.purchasedUser = purchasedUser;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public Integer getUserMobile() {
    return userMobile;
  }

  public void setUserMobile(Integer userMobile) {
    this.userMobile = userMobile;
  }

  @Override
  public String toString() {
    return "Product{"
        + "id="
        + id
        + ", productName='"
        + productName
        + '\''
        + ", purchasedUser='"
        + purchasedUser
        + '\''
        + ", userEmail='"
        + userEmail
        + '\''
        + ", userMobile="
        + userMobile
        + '}';
  }
}
