package za.ac.cput.factory;

import za.ac.cput.domain.MyAccount;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class MyAccountFactory {
public static MyAccount createMyAccount(String fullName, String password, String phoneNumber, String address, LocalDate dateCreated) {
   if (Helper.isNullOrEmpty(fullName) || Helper.isValidPassword(password) || Helper.isValidPhoneNumber(phoneNumber) ||
   Helper.isNullOrEmpty(address)) {
    return null;
   }
 return new MyAccount.Builder()
         .setFullName(fullName)
         .setPassword(password)
         .setPhoneNumber(phoneNumber)
         .setAddress(address)
         .setDateCreated(dateCreated)
         .build();
}
}
