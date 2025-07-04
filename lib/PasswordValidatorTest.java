package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        String pw;
        int count = 1;

        // Test Case 1: ถ้าความยาว password < 8 ตัว จะเป็น INVALID
        pw = "123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case " + count + " Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case " + count + " FAILED: Expected INVALID but got " + result1);
        }
        count++;

        // Test Case 2: ถ้า password เป็น null จะเป็น INVALID
        pw = "";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.INVALID) {
            System.out.println("Test Case " + count + " Passed: INVALID.");
        } else {
            System.out.println("Test Case " + count + " FAILED: Expected INVALID but got " + result2);
        }
        count++;

        // Test Case 3: ถ้า password มีแค่ตัวอักษรตัวเล็ก จะเป็น WEAK
        pw = "dsayourr";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case " + count + " Passed: WEAK.");
        } else {
            System.out.println("Test Case " + count + " FAILED: Expected WEAK but got " + result3);
        }
        count++;

        // Test Case 4: ถ้า password มีแค่ตัวอักษรตัวใหญ่ จะเป็น WEAK
        pw = "ASDWERYF";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.WEAK) {
            System.out.println("Test Case " + count + " Passed: WEAK.");
        } else {
            System.out.println("Test Case " + count + " FAILED: Expected WEAK but got " + result4);
        }
        count++;

        // Test Case 5: ถ้า password มีแค่ตัวอักษรเลข จะเป็น WEAK
        pw = "23567984";
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.WEAK) {
            System.out.println("Test Case " + count + " Passed: WEAK.");
        } else {
            System.out.println("Test Case " + count + " FAILED: Expected WEAK but got " + result5);
        }
        count++;

        // Test Case 6: ถ้า password มีแค่ตัวอักษรขระ จะเป็น WEAK
        pw = "!@#$%^&*";
        PasswordStrength result6 = PasswordValidator.validate(pw);
        if (result6 == PasswordStrength.WEAK) {
            System.out.println("Test Case " + count + " Passed: WEAK.");
        } else {
            System.out.println("Test Case " + count + " FAILED: Expected WEAK but got " + result6);
        }
        count++;

        // Test Case 7: ถ้า password มีตัวอักษรตัวเล็กและตัวเลข จะเป็น MEDIUM
        pw = "12dsf12s";
        PasswordStrength result7 = PasswordValidator.validate(pw);
        if (result7 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case " + count + " Passed: MEDIUM.");
        } else {
            System.out.println("Test Case " + count + " FAILED: Expected MEDIUM but got " + result7);
        }
        count++;

        // Test Case 8: ถ้า password มีคัวอักษรตัวใหญ่และตัวเลข จะเป็น MEDIUM
        pw = "DFS345QW";
        PasswordStrength result8 = PasswordValidator.validate(pw);
        if (result8 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case " + count + " Passed: MEDIUM.");
        } else {
            System.out.println("Test Case " + count + " FAILED: Expected MEDIUM but got " + result8);
        }
        count++;

        // Test Case 9: ถ้า password มีคัวอักษรตัวอักขระและตัวเลข จะเป็น MEDIUM
        pw = "#$234@#1";
        PasswordStrength result9 = PasswordValidator.validate(pw);
        if (result9 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case " + count + " Passed: MEDIUM.");
        } else {
            System.out.println("Test Case " + count + " FAILED: Expected MEDIUM but got " + result9);
        }
        count++;

        // Test Case 10: ถ้า password มีตัวอักษรทั้งตัวเล็กและตัวใหญ่และตัวเลข STRONG
        pw = "dSew234W";
        PasswordStrength result10 = PasswordValidator.validate(pw);
        if (result10 == PasswordStrength.STRONG) {
            System.out.println("Test Case " + count + " Passed: STRONG.");
        } else {
            System.out.println("Test Case " + count + " FAILED: Expected STRONG but got " + result10);
        }
        count++;

        // Test Case 11: ถ้า password มีตัวอักษรทั้งตัวเล็กและตัวใหญ่และอักขระและตัวเลข STRONG
        pw = "Ds095#@g";
        PasswordStrength result11 = PasswordValidator.validate(pw);
        if (result11 == PasswordStrength.STRONG) {
            System.out.println("Test Case " + count + " Passed: STRONG.");
        } else {
            System.out.println("Test Case " + count + " FAILED: Expected STRONG but got " + result11);
        }

        System.out.println("--------------------------------");
    }
}