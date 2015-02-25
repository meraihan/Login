
package validation;
public class valid {
public static boolean emailValidator(String str){
return str.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

}
public static boolean useridValidator(String str){
return str.matches("[a-zA-Z][a-zA-Z0-9_@]*");

}
public static boolean usernameValidator(String str){
return str.matches("^[a-zA-Z][a-zA-z. ]*$");

}
public static boolean passwordValidator(String str){
return str.matches("^.{4,80}$");
    
}
}
