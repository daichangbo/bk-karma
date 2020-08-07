//package com.bk.karma.test;
//
//import com.alibaba.fastjson.JSON;
//import com.bk.karam.util.DateUtils;
//import com.bk.karma.dto.Student;
//import com.google.common.base.MoreObjects;
//import com.google.common.collect.ImmutableMap;
//import org.apache.commons.lang3.StringUtils;
//
//import java.math.BigDecimal;
//import java.text.DecimalFormat;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.util.function.BinaryOperator;
//import java.util.stream.Collectors;
//
///**
// * @author daichangbo
// * @date 2019-12-01 20:02
// */
//public class MethodReferenceDemo {
//
//    public static void main ( String[] args ) {
////        List<String> list = Arrays.asList ( "hello","world","hello world" );
////        list.forEach ( System.out :: println );
//
//        Student student = new Student ( "zhangsan" ,10,12.92,new BigDecimal ( "22.00" ) );
//        Student student1 = new Student ( "lisi" ,90,13.1,new BigDecimal ( "88.00" ));
//        Student student2 = new Student ( "wangwu" ,50,19.9,new BigDecimal ( "99.00" ));
//        Student student3 = new Student ( "zhouliu" ,40,18.9,new BigDecimal ( "100.00" ));
//        List<Student> students = Arrays.asList ( student,student1,student2,student3) ;
//        students.sort ( (stu ,stu2 ) -> Student.compareStudentByScore(stu,stu2));
////        System.out.println ( JSON.toJSONString (students));
////
////        System.out.println ("---------");
////
////        students.sort ( Student :: compareStudentByScore );
////
////        students.forEach ( stud -> System.out.println (stud.getScore ()) );
////
////
////        System.out.println ("-----------");
////        StudentComparator studentComparator = new StudentComparator();
////
////        students.sort ( Student :: compareStudentByScore );
////
////        students.forEach ( stud1 -> System.out.println (stud1.getScore ()) );
////
////        System.out.println ("------");
////        students.sort ( Student::compareByScore );
////        students.forEach ( studentq -> System.out.println (student.getScore ()) );
////
////        int score = students.stream ().mapToInt ( Student::getScore ).sum ();
////        System.out.println (score);
////        OptionalDouble a = students.stream ().mapToDouble ( Student::getPrice ).average ();
////        System.out.println (a.getAsDouble ());
////
////
////        DecimalFormat df = new DecimalFormat("#.##");
////        String proportions = df.format ( student.getPrice () );
////        System.out.println (Double.valueOf (proportions));
//
//
////        System.out.println (JSON.toJSONString ( getStudent() ));
//
////        BigDecimal totalAmount = new BigDecimal ( "0.00" ) ;
////
////        for (Student st : students) {
////            totalAmount =  st.getAmount ().multiply ( new BigDecimal ( 10 ) ).add ( totalAmount );
////            System.out.println ("sssssssss"+totalAmount);
////
////        }
////        System.out.println ("totalAmount"+totalAmount);
//////
//////        BigDecimal oneAmountAllTeam = students.stream().map(Student::getAmount).reduce(BigDecimal::add).get();
//////        System.out.println ("oneAmountAllTeam"+oneAmountAllTeam);
////
////        List<Student> s = students.stream ().sorted ( Comparator.comparing ( Student::getScore ).reversed() ).collect( Collectors.toList());
////        System.out.println ( JSON.toJSONString (s));
////
//////        BigDecimal totalReturnNum = new BigDecimal ( 1);
//////        BigDecimal totalNum = new BigDecimal ( 108 );
//////        Double  returnRate = compute(totalReturnNum,totalNum,(a,b) -> a.divide ( b ,BigDecimal.ROUND_UNNECESSARY)).doubleValue ();
////        double  totalReturnNum = Double.valueOf(2);
////        double  totalNum = Double.valueOf(1009);
////        double  returnRate = totalReturnNum /totalNum ;
////        System.out.println ("returnRate"+returnRate);
////        System.out.println ("returnRate"+rounding(returnRate));
////
////
////        System.out.println ("-----------------");
////        int actualReturnNum = 1;
////        int num =10;
////        student.setAge (  MoreObjects.firstNonNull(actualReturnNum, 0) > 0 ?
////                actualReturnNum : num );
////        System.out.println (JSON.toJSONString ( student ));
////
////
////
////
////        List<String> partsCodeList = new ArrayList<> (  );
////        partsCodeList.add ( "1" );
////        System.out.println (JSON.toJSONString ( partsCodeList ));
//        try {
//            student.setStartDate ( DateUtils.parseDate ( "2019-09-09" ,"yyyy-MM-dd") );
//            student.setEndDate ( DateUtils.parseDate ( "2019-09-10" ,"yyyy-MM-dd") );
//            System.out.println (JSON.toJSONString ( student ));
//            System.out.println (format(student.getStartDate ()));
//            System.out.println (format(student.getEndDate ()));
//        } catch (Exception e) {
//            e.printStackTrace ();
//        }
//
//
//        List<Integer> list = Arrays.asList ( 1,1,2,2,3,3,3,3,3 );
//        List<Integer> list1= list.stream ().distinct ().collect ( Collectors.toList () );
//        System.out.println ("++++++++"+JSON.toJSONString ( list1 ));
//        final int[] repeatCount = {0};
//        list1.forEach ( id -> {
//            repeatCount[0]++ ;
//        } );
//        System.out.println (repeatCount[0]);
//
//
//        BigDecimal totalReturnsPrice = BigDecimal.ZERO;
//        if(false) {
//            totalReturnsPrice = new BigDecimal ( "1010.00" );
//        }
//        BigDecimal salesAmount = student.getAmount ().subtract ( totalReturnsPrice );
//        System.out.println (salesAmount);
//
//        String imagePath = "21;424;536;111";
//        List<String> listq = new ArrayList<> (  );
//        StringTokenizer st = new StringTokenizer(imagePath,";");
//        while(st.hasMoreTokens()){
//            listq.add(st.nextToken ());
//        }
//        System.out.println (JSON.toJSONString ( listq ));
//    }
//
//    public static String format(Date date) {
//        if (date == null) {
//            return StringUtils.EMPTY;
//        }
//        return dateFormatThreadLocal.get().get(YEAR_MONTH_DAY_SECOND).format(date);
//    }
//
//
//    public static final String YEAR_MONTH_DAY_SECOND = "yyyy-MM-dd HH:mm:ss";
//    public static final String YEAR_MONTH_DAY_MINUTE = "yyyy-MM-dd HH:mm";
//    public static final String YEAR_MONTH_DAY_SECOND_NO_BLACE = "yyyyMMddHHmmss";
//    public static final String YEAR_MONTH_DAY = "yyyy-MM-dd";
//    public static final String YEAR_MONTH = "yyyyMM";
//
//    private static ThreadLocal<Map<String, SimpleDateFormat>> dateFormatThreadLocal = ThreadLocal.withInitial(() -> {
//        Map<String, SimpleDateFormat> simpleDateFormatMap = ImmutableMap.<String, SimpleDateFormat>builder()
//                .put(YEAR_MONTH_DAY_SECOND, new SimpleDateFormat(YEAR_MONTH_DAY_SECOND))
//                .put(YEAR_MONTH_DAY, new SimpleDateFormat(YEAR_MONTH_DAY))
//                .put(YEAR_MONTH_DAY_MINUTE, new SimpleDateFormat(YEAR_MONTH_DAY_MINUTE))
//                .put(YEAR_MONTH_DAY_SECOND_NO_BLACE, new SimpleDateFormat(YEAR_MONTH_DAY_SECOND_NO_BLACE))
//                .put(YEAR_MONTH, new SimpleDateFormat(YEAR_MONTH))
//                .build();
//        return simpleDateFormatMap;
//    });
//
//
//    private static Double rounding (Double param) {
//        DecimalFormat df = new DecimalFormat("#.###");
//        String proportions = df.format ( param );
//        return Double.valueOf ( proportions ) ;
//    }
//
//    public static BigDecimal compute ( BigDecimal a , BigDecimal b, BinaryOperator<BigDecimal> binaryOperator ) {
//        if (b.equals ( BigDecimal.ZERO )) {
//            return b;
//        }
//        return binaryOperator.apply ( a,b );
//    }
//
//    private static Student getStudent() {
//        Student student = new Student ( "zhangsan" ,10,12.9293123213213213);
//        Student student1 = new Student ( "lisi" ,90,13.1);
//        Student student2 = new Student ( "wangwu" ,50,19.9);
//        Student student3 = new Student ( "zhouliu" ,40,18.9);
//        List<Student> students = Arrays.asList ( student,student1,student2,student3 ) ;
//        return (Student) Optional.ofNullable ( students ).get ();
//    }
//}
