//package com.bk.karma.annotation;
//
//import com.sun.glass.ui.View;
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.annotation.Aspect;
//
//import java.lang.reflect.Field;
//
///**
// * @Auther dcb
// * @Date 2020/8/13
// */
//@Aspect
//@Slf4j
//public class DataInitAnotion {
//
//        public static void inject(Activity activity) {
//            Class target = activity.getClass();
//            Field[] fields = target.getDeclaredFields();
//
//            View decorView = activity.getWindow().getDecorView();
//            for (Field f : fields) {
//                BindView bind = f.getAnnotation(BindView.class);
//                if (bind != null) {
//                    f.setAccessible(true);
//                    try {
//                        f.set(activity, decorView.findViewById(bind.value()));
//                    } catch (IllegalAccessException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//
//
//
//}
