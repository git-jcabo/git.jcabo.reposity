package org.jcabo.jcabospring.service.controller.jcabotest;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MainTest {

    public static void main (String[] args) {
//        timeTest01();
//        testOptional();
        testTime();
    }


    public static void timeTest(){

        List<TestFuncInterface> list = new ArrayList<>();
        TestFuncInterface t1 = new TestFuncInterface();
        TestFuncInterface t2 = new TestFuncInterface();
        TestFuncInterface t3 = new TestFuncInterface();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.forEach(t -> t.showName("jcabo"));
    }

    public static void timeTest01(){
        List<TestFuncInterface> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            list.add(new TestFuncInterface(i, i + "_jcabo", i + "==calss"));
        }
        List<String> addList = list.stream().map(TestFuncInterface::getAdd).collect(Collectors.toList());
        addList.forEach(add -> System.out.println(add));
    }

    public static void testOptional(){
        Map<String, String> map = new HashMap<>();
        map.put("222", "ee");
        Optional<Map<String, String>> oM = Optional.ofNullable(map);
        System.out.println(oM.isPresent());
        Optional<Map<String, String>> oM1 = Optional.ofNullable(null);
        System.out.println(oM1.isPresent());
        Consumer<Map> con = (Map) -> System.out.println(map);
        oM.ifPresent(con);
    }

    public static void testTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate ld = LocalDate.now();
        LocalDateTime ldf0 = ld.atStartOfDay();
        LocalDate ld1 = LocalDate.parse("2020-08-06");
        LocalDateTime ldf01 = ld1.atStartOfDay();
        Period period = Period.between(ld1, ld);
        Duration duration = Duration.between(ldf01, ldf0);
        System.out.println("days===" + duration.toDays());
        System.out.println("duration=== " + duration);
        System.out.println("years == " + period.getYears() + "\nmonths == " + period.getMonths() + "\ndays == " + period.getDays());
        System.out.println("period==" + period.toTotalMonths());
        System.out.println("ld" + ld);
        System.out.println("zhuanhuanhou" + LocalDateTime.parse("2222-12-22T13:12:12"));
        LocalDateTime ldf1 = ld.atStartOfDay();
        System.out.println("ldf1" + ldf1);
        LocalTime lt = LocalTime.now();
        System.out.println("lt" + lt);
        LocalDateTime ldf = LocalDateTime.now();
        System.out.println("ldf" + ldf);
        System.out.println("zhuanweizifuchuan==" + ldf.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.ss")));
    }


}

