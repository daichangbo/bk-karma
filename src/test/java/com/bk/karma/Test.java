package com.bk.karma;

import com.bk.karma.dto.Son;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author daichangbo
 * @date 2019-10-29 16:36
 */
public class Test {

    public static void main ( String[] args ) throws Exception {
        Son father = new Son ();
        father.setName ("Lisi");
        Son son = new Son ();
        son.setName ("LiWu");
        Son grandSon = new Son();
        grandSon.setName ("LiLiu");
        father.setSon ( son );

        son.setSon ( grandSon );
        //调用clone方法
        Son fatherCopy = (Son) father.clone ();
        boolean flag1 = fatherCopy == father;
        boolean flag2 = fatherCopy.getSon () == son;
        boolean flag3 = fatherCopy.getSon ().getSon () == grandSon;

        //比较克隆后的地址
        System.out.println (flag1);
        System.out.println (flag2);
        System.out.println (flag3);

        //比较name
        flag1 = fatherCopy.getName ()==father.getName ();
        flag2 = fatherCopy.getSon ().getName () == son.getName ();
        flag3 = fatherCopy.getSon ().getSon ().getName () == grandSon.getName ();
        System.out.println (flag1);
        System.out.println (flag2);
        System.out.println (flag3);

        //讲对象写到流里
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream (  );
        ObjectOutputStream objOut = new ObjectOutputStream ( byteOut );
        objOut.writeObject ( father );

        //从流中读出来
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream (  byteOut.toByteArray ());
        ObjectInputStream objectOutputStream = new ObjectInputStream ( byteArrayInputStream ) ;
        fatherCopy = (Son) objectOutputStream.readObject ();
        flag1 = fatherCopy == father;
        flag2 = fatherCopy.getSon () == son;
        flag3 = fatherCopy.getSon ().getSon () == grandSon;

        System.out.println (flag1);
        System.out.println (flag2);
        System.out.println (flag3);

        //比较name
        flag1 = fatherCopy.getName () == father.getName ();
        flag2 = fatherCopy.getSon ().getName () == son.getName ();
        flag3 = fatherCopy.getSon ().getSon ().getName () == grandSon.getName ();

        System.out.println (flag1);
        System.out.println (flag2);
        System.out.println (flag3);
    }
 }
