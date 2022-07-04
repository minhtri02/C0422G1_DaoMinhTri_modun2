package Common;

import java.time.LocalDate;
import java.time.Period;

public class CheckRegex{
    private final static String REGEX_FACILITY_ID = "^SV(VL|RO|HO)-(\\d){4}$";
    private final static String REGEX_FACILYTY_NAME = "^[A-Z][a-z]+$";
    private final static String REGEX_FACILITY_EMAIL = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private final static String REGEX_FACILITY_SDT = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";

    public static boolean checkRegexFacilityId(String facilityId) {
        return facilityId.matches(REGEX_FACILITY_ID);
    }

    public static boolean checkRegexFacilityName(String facilityName) {
        return facilityName.matches(REGEX_FACILYTY_NAME);
    }

    public static boolean checkRegexFacilityEmail(String facilityEmail) {
        return facilityEmail.matches(REGEX_FACILITY_EMAIL);
    }

    public static boolean checkRegexFacilitySDT(String facilitySDT) {
        return facilitySDT.matches(REGEX_FACILITY_SDT);
    }

    public static void checkDateEndBooking(LocalDate startDay, LocalDate endDay) throws Common.UserException {
        boolean checkEndDay = Period.between(startDay, endDay).getDays() < 0;
        if (checkEndDay){
            throw new Common.UserException();
        }

    }

    public static void checkDateStartBooking(LocalDate startDay) throws Common.UserException {
        LocalDate now = LocalDate.now();
        boolean checkStartDay = Period.between(now, startDay).getDays() < 0;
        if (checkStartDay) throw new UserException();
    }

}
