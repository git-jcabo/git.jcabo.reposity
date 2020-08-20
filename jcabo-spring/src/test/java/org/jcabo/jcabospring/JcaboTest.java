package org.jcabo.jcabospring;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class JcaboTest {

    //    @Test
    public void testExcel() throws Exception {
        Workbook book = WorkbookFactory.create(new File(""));
        System.out.println("book====" + book);
    }

    /**
     * stream分组计数
     * @throws Exception
     */
    @Test
    public void testStream() throws Exception {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("prefix", "pre001");
        map1.put("suffix", "suf001");
        Map<String, String> map2 = new HashMap<>();
        map2.put("prefix", "pre002");
        map2.put("suffix", "suf002");
        Map<String, String> map3 = new HashMap<>();
        map3.put("prefix", "pre001");
        map3.put("suffix", "suf001");
        list.add(map1);
        list.add(map3);
        list.add(map2);
        System.out.println(list);
        List<String> list2 = list.stream().map(map -> map.get("prefix") + "|" + map.get("suffix")).collect(Collectors.toList());
        System.out.println(list2);
        Map<String, Long> ret = list.stream().map(map -> map.get("prefix") + "|" + map.get("suffix")).
                collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        System.out.println(ret);
        Long collect = list.stream().map(map -> map.get("prefix") + "|" + map.get("suffix")).
                collect(Collectors.counting());
        System.out.println("count===" + collect);


    }

    @Test
    public void test01()throws Exception{
        Map<String, Long> map = new HashMap<>();
        map.put("WF05010002|ND05010002", 99L);
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("222");
        list1.add("111");
        list.add("WF05010002|ND05010002");
        list.add("WF05010002|ND05010000");
        list.add("WF05010002|ND05010001");
        list1.forEach(ss -> {
            list.forEach(item -> {
                Long tem = Optional.ofNullable(map.get(item)).orElse(0L);
                System.out.println(tem);
            });
        });

    }

}
