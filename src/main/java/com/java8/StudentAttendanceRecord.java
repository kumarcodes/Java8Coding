package com.java8;

public class StudentAttendanceRecord {
    public static void main(String[] args) {
        String str = "PPALLL";
        boolean isEligible = checkEligibilityForReward(str);
        System.out.println(isEligible);
    }

    private static boolean checkEligibilityForReward(String str) {
        int absenceCount = 0;
        int consecutiveLate = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A') {
                absenceCount++;
                if (absenceCount > 1)
                    return false;
            }
            if (ch == 'L') {
                consecutiveLate++;
                if (consecutiveLate >= 3)
                    return false;
                else
                    consecutiveLate = 0;
            }
        }
        return true;
    }
}
