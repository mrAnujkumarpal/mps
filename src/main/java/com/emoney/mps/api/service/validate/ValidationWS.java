package com.emoney.mps.api.service.validate;

import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationWS {

    public boolean isContainSpecialChar(String s) {
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(s);
        boolean ans =   m.find()?true:false;
        return ans;
    }

    public boolean isNumericOnly(String s) {

        Pattern pattern = Pattern.compile("^[1-9]+[0-9]*$");
        Matcher matcher = pattern.matcher(s);
        boolean isValid =   matcher.matches()?true:false;
        return isValid;

    }
    public boolean isValidDate(XMLGregorianCalendar calendar)
    {
            SimpleDateFormat sdfrmt = new SimpleDateFormat( "MMddHHmmss");
            sdfrmt.setLenient(false);

            Date strDate= calendar.toGregorianCalendar().getTime();
            try  {
                Date javaDate = sdfrmt.parse(String.valueOf(strDate));
                System.out.println(strDate+" is valid date format");
            } catch (ParseException e) {
                System.out.println(strDate+" is Invalid Date format");
                return false;
            }
            return true;

    }
}
