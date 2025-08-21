package za.ac.cput.domain;

import java.time.LocalDate;

public class MyAccount {
 private int accountId;
 private String fullName;
 private String password;
 private String phoneNumber;
 private String address;
 private LocalDate dateCreated;


 public MyAccount() {

 }

private MyAccount(Builder builder) {
  this.accountId = builder.accountId;
  this.fullName = builder.fullName;
  this.password = builder.password;
  this.phoneNumber = builder.phoneNumber;
  this.address = builder.address;
  this.dateCreated = builder.dateCreated;

}

 public int getAccountId() {
  return accountId;
 }

 public String getFullName() {
  return fullName;
 }

 public String getPassword() {
  return password;
 }

 public String getPhoneNumber() {
  return phoneNumber;
 }

 public String getAddress() {
  return address;
 }

 public LocalDate getDateCreated() {
  return dateCreated;
 }

 @Override
 public String toString() {
  return "MyAccount{" +
          "accountId=" + accountId +
          ", fullName='" + fullName + '\'' +
          ", password='" + password + '\'' +
          ", phoneNumber='" + phoneNumber + '\'' +
          ", address='" + address + '\'' +
          ", dateCreated=" + dateCreated +
          '}';
 }

 public static class Builder{
  private int accountId;
  private String fullName;
  private String password;
  private String phoneNumber;
  private String address;
  private LocalDate dateCreated;

  public Builder setAccountId(int accountId) {
   this.accountId = accountId;
   return this;
  }

  public Builder setFullName(String fullName) {
   this.fullName = fullName;
   return this;
  }

  public Builder setPassword(String password) {
   this.password = password;
   return this;
  }

  public Builder setPhoneNumber(String phoneNumber) {
   this.phoneNumber = phoneNumber;
   return this;
  }

  public Builder setAddress(String address) {
   this.address = address;
   return this;
  }

  public Builder setDateCreated(LocalDate dateCreated) {
   this.dateCreated = dateCreated;
   return this;
  }

  public Builder copy(MyAccount account) {
   this.accountId = account.getAccountId();
   this.fullName = account.getFullName();
   this.password = account.getPassword();
   this.phoneNumber = account.getPhoneNumber();
   this.address = account.getAddress();
   this.dateCreated = account.getDateCreated();
   return this;

  }
  public MyAccount build() {
   return new MyAccount(this);
  }
 }
}
