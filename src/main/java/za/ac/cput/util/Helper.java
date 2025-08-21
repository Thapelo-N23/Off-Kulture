package za.ac.cput.util;


import java.time.LocalDate;

public class Helper {


 public static boolean isNullOrEmpty(String s) {

  return s == null || s.isEmpty();
 }


 public static LocalDate isValidDate(String dateCreated) {
  // Support both "yyyy-MM-dd" and "yyyyMMdd" formats
  if (dateCreated == null) throw new IllegalArgumentException("Date string is null");
  if (dateCreated.contains("-")) {
   return LocalDate.parse(dateCreated); // ISO format
  } else if (dateCreated.length() == 8) {
   int year = Integer.parseInt(dateCreated.substring(0, 4));
   int month = Integer.parseInt(dateCreated.substring(4, 6));
   int day = Integer.parseInt(dateCreated.substring(6, 8));
   return LocalDate.of(year, month, day);
  } else {
   throw new IllegalArgumentException("Invalid date format: " + dateCreated);
  }
 }
// public static double calculateSubTotal(int quantity, double unitPrice) {
//  return quantity * unitPrice;
// }
// public static boolean isValidEmail(String email){
//  EmailValidator validator = EmailValidator.getInstance();
//  if (validator.isValid(email)) {
//   return true;
//  } else {
//   return false;
//  }
// }
 public static boolean isValidStreetNumber(short streetNumber) {
  if (streetNumber < 1 || streetNumber > 99999) {
   return false;
  }
  return true;
 }
 public static boolean isValidPostalCode(short postalCode) {
  if (postalCode < 1000 || postalCode > 9999) {
   return false;
  }
  return true;

 }

 public static boolean isValidCategoryId(Integer categoryId) {
  return categoryId != null && categoryId > 0;
 }

 public static boolean isValidReviewId(Integer reviewId) {
  return reviewId != null && reviewId > 0;
 }

 public static boolean isValidId(int inventoryId) {
  return false;
 }

 public static boolean isValidAmount(double amount) {
  return amount >= 0.0;
 }
 public static boolean isNullOrEmpty(int supplierId) {
  return false;
 }

 public static boolean isValidProductId(Long productId) {
  return productId != null && productId > 0;
 }

 public static boolean isValidPrice(Short price) {
  return price != null && price > 0;
 }

 public static boolean isValidShipmentId(int id) {
  return id > 0;
 }

 public static boolean isValidPassword(String password) {
  return password != null
          && password.length() >= 8
          && password.length() <= 20
          && password.matches(".*[0-9].*")      // at least one digit
          && password.matches(".*[a-z].*")      // at least one lowercase
          && password.matches(".*[A-Z].*")      // at least one uppercase
          && password.matches(".*[@#$%^&+=!].*") // at least one special character
          && !password.contains(" ");           // no spaces
 }

 public static boolean isValidPhoneNumber(String phoneNumber) {
  return phoneNumber != null
          && phoneNumber.matches("^\\+?[0-9]{10,15}$");
 }



}
