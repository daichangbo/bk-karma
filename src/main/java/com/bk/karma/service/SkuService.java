//package com.bk.karma.service;
//
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.jk.base.http.HttpClient;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import sun.security.provider.MD5;
//
//import javax.annotation.Resource;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * @author daichangbo
// * @date 2020-01-08 16:02
// */
//@Slf4j
//@Service
//public class SkuService {
//
//    private static final String url = "https://sit.apbenben.com/league-submng/system/data/saveCarParts" ;
//
//    private static final String ALGORITHM_MD5 = "MD5";
//
//    @Autowired
//    private HttpClient httpClient ;
//
//    public void postApbenben () {
//        try {
//        String supplierCode = "pinpaiceshi2018" ;
//        String sign = supplierCode + new SimpleDateFormat ("yyyyMMddHH").format(new Date ());
//        sign = MD5_32bit(sign);
//
//        JSONObject json = new JSONObject();
//
//        json.put("supplierCode", supplierCode);
//        json.put("cname", "测试配件名称");//中文名称
//        json.put("partsNo", "058125-03"); //商品编码
//        json.put("carInfo", "测试车型");// 适用车型
//        json.put("producingArea", "中国");//出产地
//        json.put("price", "100");// 单价（零售价）
//        json.put("stock", "12");//零件库存量
//        json.put("standardPartsNo", "058125031");//原厂编码
//        json.put("isOem", "");
//        json.put("manufacturerCname", "CSPJMC");//品牌中文名称
//        json.put("manufacturerEname", "CSPJMC");//品牌英文名称
//        json.put("ename", "CSPJMC"); //英文名称
//        json.put("batchPrice", "90");//批发价
//        json.put("unit", "把");// 单位
//        json.put ( "erpInfo" ,"积准" ) ;
//
//        JSONArray jsonArray = new JSONArray();//数组  数组支持500到2000条
//        jsonArray.add ( json );   //库存1
//
//            String response =   httpClient.post ( url, JSON.toJSONString (jsonArray) );
//            log.info ( response );
//        } catch (Exception e) {
//            log.error ( "postApbenben is error" ,e );
//        }
//    }
//
//    public static final String MD5_32bit(String readyEncryptStr) throws NoSuchAlgorithmException {
//        if(readyEncryptStr != null){
//            //Get MD5 digest algorithm's MessageDigest's instance.
//            MessageDigest md = MessageDigest.getInstance(ALGORITHM_MD5);
//            //Use specified byte update digest.
//            md.update(readyEncryptStr.getBytes());
//            //Get cipher text
//            byte [] b = md.digest();
//            //The cipher text converted to hexadecimal string
//            StringBuilder su = new StringBuilder();
//            //byte array switch hexadecimal number.
//            for(int offset = 0,bLen = b.length; offset < bLen; offset++){
//                String haxHex = Integer.toHexString(b[offset] & 0xFF);
//                if(haxHex.length() < 2){
//                    su.append("0");
//                }
//                su.append(haxHex);
//            }
//            return su.toString();
//        }else{
//            return null;
//        }
//    }
//
//}
