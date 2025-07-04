package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * -------------------------------------
     * INVALID
     * ความยาว password < 8 ตัว จะเป็น Invalid
     * ถ้า password เป็นค่าว่างหรือ null จะเป็น Invalid
     * -------------------------------------
     * WEAK
     * ถ้ามีแค่ตัวอักษรตัวเล็ก จะเป็น Weak
     * ถ้ามีแค่ตัวอักษรตัวตัวใหญ่ จะเป็น Weak
     * ถ้ามีแค่ตัวเลข จะเป็น Weak
     * ถ้ามีแค่ตัวอักขระ จะเป็น Weak
     * -------------------------------------
     * MEDIUM
     * ถ้ามีตัวอักษรตัวเล็กและตัวเลข จะเป็น Medium
     * ถ้ามีคัวอักษรตัวใหญ่และตัวเลข จะเป็น Medium
     * ถ้ามีคัวอักษรตัวอักขระและตัวเลข จะเป็น Medium
     * -------------------------------------
     * STRONG
     * ถ้ามีตัวอักษรทั้งตัวเล็กและตัวใหญ่และตัวเลข Strong
     * ถ้ามีตัวอักษรทั้งตัวเล็กและตัวใหญ่และอักขระและตัวเลข Strong
     * -------------------------------------
     * @param password string ที่จะต้องการตรวจสอบ
     * @return PasswordStrength INVALID, PasswordStrength WEAK, PasswordStrength MEDIUM, PasswordStrength STRONG
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        int minLength = 8;// TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        
        if (password == null || password.length() < minLength) {
            return PasswordStrength.INVALID;
        } 

        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigitCase = false;
        boolean hasSpecailCase = false;
            // change string to char for check letter
            for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isDigit(c)) {
                    hasDigitCase = true;
                } else {
                    hasSpecailCase = true;
                }
            }

            // checking letter in password
            if (hasLowerCase && !hasUpperCase && !hasDigitCase && !hasSpecailCase) {
                return PasswordStrength.WEAK;
            } else if (!hasLowerCase && hasUpperCase && !hasDigitCase && !hasSpecailCase) {
                return PasswordStrength.WEAK;
            } else if (!hasLowerCase && !hasUpperCase && hasDigitCase && !hasSpecailCase) {
                return PasswordStrength.WEAK;
            } else if (!hasLowerCase && !hasUpperCase && !hasDigitCase && hasSpecailCase) {
                return PasswordStrength.WEAK;
            } else if (hasLowerCase && !hasUpperCase && hasDigitCase && !hasSpecailCase) {
                return PasswordStrength.MEDIUM;
            } else if (!hasLowerCase && hasUpperCase && hasDigitCase && !hasSpecailCase) {
                return PasswordStrength.MEDIUM;
            } else if (!hasLowerCase && !hasUpperCase && hasDigitCase && hasSpecailCase) {
                return PasswordStrength.MEDIUM;
            } else if (hasLowerCase && hasUpperCase && hasDigitCase && !hasSpecailCase) {
                return PasswordStrength.STRONG;
            } else if (hasLowerCase && hasUpperCase && hasDigitCase && hasSpecailCase) {
                return PasswordStrength.STRONG;
            }
            
        
        return PasswordStrength.INVALID;
    }
}