//package com.bk.karma.test;
//
//import com.alibaba.fastjson.JSON;
//import com.bk.karma.dto.ImportReplaceCodeDTO;
//import org.apache.commons.lang3.StringUtils;
//
//import java.util.*;
//import java.util.function.Supplier;
//import java.util.stream.Collectors;
//
///**
// * @author daichangbo
// * @date 2019-12-01 15:22
// * supplier一般可以用于工厂模式
// */
//public class SupplierTest {
//
////    public static void main ( String[] args ) {
////        Supplier<String> supplier = () -> "hello world";
////        System.out.println (supplier.get ());
////    }
//
//    private static boolean isIntq(String intStr) {
//        if (StringUtils.isBlank(intStr)) {
//            return false;
//        }
//        try {
//            Integer.parseInt(intStr);
//        } catch (Exception e) {
//            return false;
//        }
//        return true;
//    }
//
//    public static void main ( String[] args ) {
//        System.out.println (isIntq("374"));
//        List<ImportReplaceCodeDTO> importReplaceCodeDTOList = new ArrayList<> (  );
//        ImportReplaceCodeDTO importReplaceCodeDTO = new ImportReplaceCodeDTO();
//        importReplaceCodeDTO.setPartsCode ( "11111" );
//        importReplaceCodeDTO.setReplacePartsCode ( "2132r" );
//        importReplaceCodeDTOList.add ( importReplaceCodeDTO );
//        ImportReplaceCodeDTO importReplaceCodeDTO1 = new ImportReplaceCodeDTO();
//        importReplaceCodeDTO1.setPartsCode ( "11111" );
//        importReplaceCodeDTO1.setReplacePartsCode ( "2132r" );
//        importReplaceCodeDTOList.add ( importReplaceCodeDTO1 );
//        ImportReplaceCodeDTO importReplaceCodeDTO2 = new ImportReplaceCodeDTO();
//        importReplaceCodeDTO2.setPartsCode ( "2222" );
//        importReplaceCodeDTO2.setReplacePartsCode ( "344434d" );
//        importReplaceCodeDTOList.add ( importReplaceCodeDTO2 );
//        Map<String,List<ImportReplaceCodeDTO>> replaceodeGroupMap = importReplaceCodeDTOList.stream().collect( Collectors.groupingBy(ImportReplaceCodeDTO::getPartsCode));
//        Iterator<Map.Entry<String,List<ImportReplaceCodeDTO>>> it = replaceodeGroupMap.entrySet().iterator();
////        while (it.hasNext ()) {
////            Map.Entry<String,List<ImportReplaceCodeDTO>> entry = it.next ();
////            System.out.println (JSON.toJSONString (entry));
////            String partsCode = entry.getKey ();
////            List<ImportReplaceCodeDTO> valueList = entry.getValue ();
////            System.out.println ("partsCode:"+partsCode);
////            System.out.println ("valueList" + JSON.toJSONString (valueList));
////        }
////        System.out.println ( Calendar.getInstance().getTimeInMillis());
////        String regPwd = "^[A-Z0-9](-?)+([A-Z0-9]+[-_/+]?)+[A-Z0-9]+$";
////        String password = "213212,12";
////        if (!password.matches ( regPwd )) {
////            System.out.println ("11111");
////        } else {
////            System.out.println ("22222");
////        }
////        List<ImportReplaceCodeDTO> distinctClassList = importReplaceCodeDTOList.stream ().distinct ().collect( Collectors.toList());
////        System.out.println (JSON.toJSONString ( distinctClassList ));
////        List<ImportReplaceCodeDTO> distinctClass = importReplaceCodeDTOList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(o -> o.getPartsCode () + ";" + o.getReplacePartsCode ()))), ArrayList::new));
////        System.out.println (JSON.toJSONString ( distinctClass ));
//        List<String> list = new ArrayList<> (  );
//        list.add ( "12121" );
//        list.add ( "12121" );
//        list.add ( "12121" );
//        list.add ( "12121" );
//        List<String> list1 = list.stream ().distinct ().collect( Collectors.toList());
////        System.out.println (JSON.toJSONString ( list1 ));
////        int i =1 ;
////        while (i<=5) {
////            System.out.println (JSON.toJSONString ( list ));
////            if (i == list.size ()) {
////                System.out.println ("1");
////                return ;
////            }
////            i ++ ;
////        }
//        System.out.println ("qwqqw".toUpperCase ());
//        String salesNo = "bSS2121b" +
//
//                "";
////        System.out.println (salesNo.replace ( "SS","S" ) );
//        System.out.println (salesNo);
//        salesNo = salesNo.substring(0, salesNo.length() - 1);
//
//        System.out.println (salesNo);
//
//    }
//
//    private String name (String partsName) {
//        partsName = partsName.replaceAll("\\\\n", StringUtils.EMPTY)
//                .replaceAll("\\\\b", StringUtils.EMPTY)
//                .replaceAll("\\\\f", StringUtils.EMPTY)
//                .replaceAll("\\\\t", StringUtils.EMPTY)
//                .replaceAll("\\\\r", StringUtils.EMPTY)
//                .replaceAll("\\\\u", StringUtils.EMPTY);
//        return partsName;
//    }
//}
