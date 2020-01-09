package com.bk.karma.controller;

import com.alibaba.fastjson.JSON;
import com.bk.karam.util.DateUtils;
import com.bk.karma.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author daichangbo
 * @date 2019-11-29 16:40
 */
@Slf4j
public class TestCont {

    public static void main(String[] args) throws Exception{
//        List<UserDTO> userDTOLisy = new ArrayList<> ();
//        UserDTO userDTO = new UserDTO();
//        userDTO.setUserName("快捷流程");
//        userDTO.setPassWord ( "123" );
//        UserDTO userDTO1 = new UserDTO();
//        userDTO1.setUserName("快捷流程");
//        userDTO1.setPassWord ( "123" );
//        UserDTO userDTO2 = new UserDTO();
//        userDTO2.setPassWord ( "123" );
//        userDTO2.setUserName("3223");
//        UserDTO userDTO3 = new UserDTO();
//        userDTO3.setUserName("111");
//        userDTO3.setPassWord ( "123" );
//        userDTOLisy.add(userDTO);
//        userDTOLisy.add(userDTO1);
//        userDTOLisy.add(userDTO2);
//        userDTOLisy.add(userDTO3);
//        System.out.println (JSON.toJSONString ( userDTOLisy ));
//        List<UserDTO> userDTOLisy2 =
//                userDTOLisy.stream().collect(
//                        Collectors.collectingAndThen(Collectors.toCollection(
//                                () -> new TreeSet<> ( Comparator.comparing(UserDTO::getUserName))), ArrayList::new));
//
//                userDTOLisy.stream ().distinct ().collect( Collectors.toList());
//        System.out.println (JSON.toJSONString ( userDTOLisy2 ));
//        System.out.println (JSON.toJSONString(userDTOLisy));
//       List<UserDTO>  u = userDTOLisy.stream() .filter(p -> !p.getUserName ().startsWith("app"))
//                .filter (m -> !m.getUserName ().contains ( "快捷流程" )  )
//                .collect( Collectors.toList());
//
//        System.out.println (JSON.toJSONString(u));

//        BigDecimal a = new BigDecimal ( "0.00" );
//        if (a.compareTo ( new BigDecimal ( "0" ) ) == 0) {
//            System.out.println ("qqqqqq");
//        } else {
//            System.out.println ("bbbbbb");
//        }
//        System.out.println (getMonthBegin(dateToDay("2018-09-09"),0));
//        System.out.println (date2String(dateToDay("2018-09-09")));
//
//        TestDTO testDTO = new TestDTO();
//        Map<String, String> mapx = new HashMap<> (  );
//        mapx.put ( "01","sss" );
//        mapx.put ( "02","333" );
//        mapx.put ( "03","eee" );
//        mapx.put ( "04","ggg" );
//        Map<String, String> mapy = new HashMap<> (  );
//        mapy.put ( "01","232" );
//        mapy.put ( "02","jejkw" );
//        mapy.put ( "03","32" );
//        mapy.put ( "04","ds" );
//        testDTO.setMapx ( mapx );
//        testDTO.setMapy ( mapy );
//        System.out.println (JSON.toJSONString ( testDTO ));

//        List<Integer> a = Arrays.asList ( );
//        List<Integer> b = Arrays.asList ( 1,7,8,9,10);
//        List<Integer> c = new ArrayList<> (  );
//        c.addAll ( b );
//        c.addAll ( a );
//        List<Integer> d = c.stream ().distinct ().collect( Collectors.toList());
//        System.out.println (JSON.toJSONString ( d ));
//         int a = Math.abs(-1);
//        System.out.println (a);

        List<CustomerBillCountVO> customerBillCountVOList = new ArrayList<> (  );
        CustomerBillCountVO customerBillCountVO = new CustomerBillCountVO();
        customerBillCountVO.setShouldPay ( new BigDecimal ( "100.00" ) );
        customerBillCountVO.setShouldReceive ( new BigDecimal ( "300.00" ) );
        customerBillCountVO.setPrePaymentBalance ( new BigDecimal ( "0.00" ) );
        customerBillCountVO.setPreReceivedBalance ( new BigDecimal ( "900.00" ) );

        CustomerBillCountVO customerBillCountVO1 = new CustomerBillCountVO();
        customerBillCountVO1.setShouldPay ( BigDecimal.ZERO );
        customerBillCountVO1.setShouldReceive ( BigDecimal.ZERO );
        customerBillCountVO1.setPrePaymentBalance ( BigDecimal.ZERO );
        customerBillCountVO1.setPreReceivedBalance ( null );
        customerBillCountVOList.add ( customerBillCountVO ) ;
        customerBillCountVOList.add ( customerBillCountVO1 ) ;
        List<CustomerBillCountVO> customerBillCountVoList = new ArrayList<> (  );
        customerBillCountVOList.forEach ( item -> {
            if ( (item.getShouldPay () == null || item.getShouldPay ().compareTo ( BigDecimal.ZERO ) == 0 )&&
                    (item.getShouldReceive () == null || item.getShouldReceive ().compareTo ( BigDecimal.ZERO ) == 0) &&
                    (item.getPrePaymentBalance () == null || item.getPrePaymentBalance ().compareTo ( BigDecimal.ZERO ) == 0) &&
                    (item.getPreReceivedBalance () == null || item.getPreReceivedBalance ().compareTo ( BigDecimal.ZERO ) == 0 )) {
                return ;
            }
            customerBillCountVoList.add ( item );
        } );
//        System.out.println ("customerBillCountVOList" + JSON.toJSONString ( customerBillCountVoList ));
//        Date startDate = DateUtils.parseDate ( "2019-12-01 00:00:00","yyyy-MM-dd HH:mm:ss" ) ;
//        System.out.println (getMonthBegin(startDate,1));
//        System.out.println (getMonthEnd (startDate));
//        try {
//            BigDecimal totalPreReceivedBalance = customerBillCountVOList.stream().filter ( a -> a.getPreReceivedBalance () != null ) .map( CustomerBillCountVO::getPreReceivedBalance).reduce( BigDecimal::add).get();
//            System.out.println (totalPreReceivedBalance);
//        } catch (Exception e) {
//            log.error ( "error" + e );
//        }
//
//        if (customerBillCountVO.getPreReceivedBalance ().compareTo ( BigDecimal.ZERO ) > 0) {
//            System.out.println ("ssss");
//        }else {
//            System.out.println ("sddd");
//        }
        List<Integer> list1 = Arrays.asList ( 10,20,30,40,50,60,70,80 ,90,100);
        List<Integer> list2 = Arrays.asList ( 10,20,30,40,50,60,70,90,100 );

        List<Integer> reduce1 = list1.stream().filter(item -> !list2.contains(item)).collect( Collectors.toList());
        System.out.println (JSON.toJSONString ( reduce1 ));

    }

    private static List<String> getDiffrent(List<String> list1, List<String> list2) {
        long st = System.nanoTime();
        List<String> diff = new ArrayList<String>();
        for(String str:list1)
        {
            if(!list2.contains(str))
            {
                diff.add(str);
            }
        }
        System.out.println("total times "+(System.nanoTime()-st));
        return diff;
    }

    public static String date2String(Date date) {
        if (null == date)
            return "";
        DateFormat df = createFormatter("MM");
        return df.format(date);
    }

    public static DateFormat createFormatter(String pattern) {
        return new SimpleDateFormat(pattern);
    }

    /**
     * 获取指定日期所在月份开始的时间
     * 时间格式yyyyMMdd
     * @param date 指定日期
     * @return
     */
    public static String getMonthBegin( Date date,int month) {
        SimpleDateFormat aDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add ( Calendar.MONTH ,month);
        //设置为1号,当前日期既为本月第一天
        c.set(Calendar.DAY_OF_MONTH, 1);
        //将小时至0
        c.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c.set(Calendar.MINUTE, 0);
        //将秒至0
        c.set(Calendar.SECOND,0);
        //将毫秒至0
        c.set(Calendar.MILLISECOND, 0);
        // 获取本月第一天的时间
        return aDateFormat.format(c.getTime());
    }

    public static final String DEFAULT_FORMAT_STR          = "yyyy-MM-dd";

    public static Date dateToDay(String date) {
        Date result = null;
        try {
            if (StringUtils.isNotEmpty(date)) {
                result = new SimpleDateFormat(DEFAULT_FORMAT_STR).parse(date);
            }
        } catch (ParseException e) {
            log.error(e.getMessage(), e);
        }
        return result;
    }

    public static String getMonthEnd(Date date) {
        SimpleDateFormat aDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        //设置为当月最后一天
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        //将小时至23
        c.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至59
        c.set(Calendar.MINUTE, 59);
        //将秒至59
        c.set(Calendar.SECOND,59);
        //将毫秒至999
        c.set(Calendar.MILLISECOND, 999);
        // 获取本月最后一天的时间
        return aDateFormat.format(c.getTime());
    }
}
