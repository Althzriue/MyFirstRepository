package com.lanmao.test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /**
     * String 类型转化成 Date类型 && Date 类型转化成 String类型
     * @author wslixiaoliang
     * 注意：日期时间类型的字段，在数据库存放的是：dateTime 类型 ； 在bean 和 document 存放的是string 类型；在索引中存的是date类型（指定mapping文件为date类型即可,无需其他操作）
     */
    /**
     * 索引存储的时间
     */
    //document.put(SearchInterConstants.IKnowledgeIndexParamNames.KNWLG_INVLD_TIME, DateUtil.date2String(DateUtil.string2Date(knowledge.getInvildTime()), DateUtil.DATE_PATTERN.YYYY_MM_DD));

    /**
     * 将String类型转换成Date类型
     *
     * @param date Date对象
     * @return
     */
    public static Date string2Date(String date) {
        SimpleDateFormat format = new SimpleDateFormat(DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
        try {
            return format.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 将Date类型转换成String类型
     *
     * @param date Date对象
     * @return 形如:"yyyy-MM-dd HH:mm:ss"
     */
    public static String date2String(Date date) {
        return date2String(date, DateUtils.DATE_PATTERN.YYYY_MM_DD_HH_MM_SS);
    }

    /**
     * 将Date按格式转化成String
     *
     * @param date    Date对象
     * @param pattern 日期类型
     * @return String
     */
    public static String date2String(Date date, String pattern) {
        if (date == null || pattern == null) {
            return null;
        }
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * 日期格式
     **/
    public interface DATE_PATTERN {
        String HHMMSS = "HHmmss";
        String HH_MM_SS = "HH:mm:ss";
        String HH_MM = "HH:mm";
        String YYYY = "yyyy";
        String YYYYMMDD = "yyyyMMdd";
        String YYYY_MM_DD = "yyyy-MM-dd";
        String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
        String YYMMDDHHMMSS = "yyMMddHHmmss";
        String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
        String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
        String MM = "MM";
    }

    /**
     * 测试方法
     *
     * @param args
     */
    public static void main(String[] args) {
        String strDate = "2018-06-01 21:56:19.0";
        Date date = string2Date(strDate);
    }
}
