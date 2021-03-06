package commons;

import models.FreeConvenient;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static boolean regexNameService(String name) {
        final String REGEXNAME = "^[A-Z]{1}[a-z]*";
        Pattern pattern = Pattern.compile(REGEXNAME);
        Matcher matcher = pattern.matcher(name);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexId(String id) {
        final String REGEX_ID = "^SV(VL|HO|RO)-\\d{4}";
        Pattern pattern = Pattern.compile(REGEX_ID);
        Matcher matcher = pattern.matcher(id);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexAreaOfUse(String areaOfUse) {

        final String REGEX_AREAOFUSE = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$";
        Pattern pattern = Pattern.compile(REGEX_AREAOFUSE);
        Matcher matcher = pattern.matcher(areaOfUse);
        boolean check = matcher.matches();
        return check;
//        float area = Float.parseFloat(areaOfUse);
//        boolean check;
//        if (area>=30){
//            check=true;
//        }else {
//            check=false;
//        }
//        return check;
    }

    public static boolean regexPoolArea(String poolArea) {

        final String REGEX_POOLAREA = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$";
        Pattern pattern = Pattern.compile(REGEX_POOLAREA);
        Matcher matcher = pattern.matcher(poolArea);
        boolean check = matcher.matches();
        return check;
//        float area = Float.parseFloat(poolArea);
//        boolean check;
//        if (area>=30){
//            check=true;
//        }else {
//            check=false;
//        }
//        return check;
    }

    public static boolean regexRentalCost(String rentalCost) {
        final String REGEX_RENTALCOST = "^[1-9]\\d*$";
        Pattern pattern = Pattern.compile(REGEX_RENTALCOST);
        Matcher matcher = pattern.matcher(rentalCost);
        boolean check = matcher.matches();
        return check;
//        int costRental= Integer.parseInt(rentalCost);
//        boolean check;
//        if(costRental>0){
//            check= true;
//        }else {
//            check=false;
//        }
//        return check;
    }

    public static boolean regexMaxPeople(String maxPeople) {
        final String REGEX_MAXPEOPLE = "[1-9]|1\\d{1}|[20]";
        Pattern pattern = Pattern.compile(REGEX_MAXPEOPLE);
        Matcher matcher = pattern.matcher(maxPeople);
        boolean check = matcher.matches();
        return check;
//        int people= Integer.parseInt(maxPeople);
//        boolean check;
//        if(people>0&&people<20){
//            check=true;
//        }else {
//            check=false;
//        }
//        return check;
    }

    public static boolean
    regexFreeConvenient(String nameFreeConvenient) {
        final String REGEX_FREECONVENIENT = "(massage|karaoke|food|drink|car)";
        Pattern pattern = Pattern.compile(REGEX_FREECONVENIENT);
        Matcher matcher = pattern.matcher(nameFreeConvenient);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexFloor(String floor) {
        final String REGEX_FLOOR = "[1-9]\\d{0,}$";
        Pattern pattern = Pattern.compile(REGEX_FLOOR);
        Matcher matcher = pattern.matcher(floor);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexRentalType(String rentalType) {
        final String REGEXRENTALTYPE = "^[A-Z]{1}[a-z]*";
        Pattern pattern = Pattern.compile(REGEXRENTALTYPE);
        Matcher matcher = pattern.matcher(rentalType);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexStandard(String standard) {
        final String REGEXSTANDARD = "^[A-Z]{1}[a-z]*";
        Pattern pattern = Pattern.compile(REGEXSTANDARD);
        Matcher matcher = pattern.matcher(standard);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexNameCustomer(String fullName) {
        final String REGEXNAMECUS = "^([A-Z]{1}([a-z])*)(\\s[A-Z]{1}[a-z]*)*$";
        Pattern pattern = Pattern.compile(REGEXNAMECUS);
        Matcher matcher = pattern.matcher(fullName);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexEmail(String email) {
        final String REGEXEMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(REGEXEMAIL);
        Matcher matcher = pattern.matcher(email);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexBirthday(String birthday) {
        final String REGEX_BIRTHDAY = "^([0][1-9]|[1-2][0-9]|[3][0-1])[/]([0][1-9]|[1][0-2])[/]\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_BIRTHDAY);
        Matcher matcher = pattern.matcher(birthday);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexIdNumber(String idNumber) {
        final String REGEX_IDNUMBER = "\\d{3}\\s\\d{3}\\s\\d{3}";
        Pattern pattern = Pattern.compile(REGEX_IDNUMBER);
        Matcher matcher = pattern.matcher(idNumber);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexSex(String sex) {
        final String REGEX_SEX = "(male)|(female)|(unknow)";
        Pattern pattern = Pattern.compile(REGEX_SEX);
        Matcher matcher = pattern.matcher(sex);
        boolean check = matcher.matches();
        return check;
    }
}
