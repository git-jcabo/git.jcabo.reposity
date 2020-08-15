package org.jcabo.jcabospring;

import org.jcabo.jcabospring.service.controller.CommonController;
import org.junit.*;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc// 不启动服务器,使用mockMvc进行测试http请求。启动了完整的Spring应用程序上下文，但没有启动服务器
public class JcaboSpringApplicationTests {

    @BeforeClass
    public static void testBeforeClass(){
        System.out.println("before Class");
    }

    @Before
    public void testBefore(){
        System.out.println("before");
    }

    @After
    public void testAfter(){
        System.out.println("after");
    }

    @AfterClass
    public static void testAfterClass(){
        System.out.println("after class");
    }

    @Resource
    private CommonController commonController;

    @Resource
    private MockMvc mockMvc;

    // 直接测试controller
    @Test
    public void contextLoads() throws Exception{
        System.out.println(commonController.testController());
    }

    /**
     * .perform() : 执行一个MockMvcRequestBuilders的请求；MockMvcRequestBuilders有.get()、.post()、.put()、.delete()等请求。
     * .andDo() : 添加一个MockMvcResultHandlers结果处理器,可以用于打印结果输出(MockMvcResultHandlers.print())。
     * .andExpect : 添加MockMvcResultMatchers验证规则，验证执行结果是否正确。
     */
    @Test
    public void testTest01() throws Exception{

//        MockMvcRequestBuilders.post()
//
//        mockMvc.perform();

        ResultActions resultActions = mockMvc.perform(get("/test01"));
        String content = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("content=====" + content);
    }

//    @Test
    public void mainTest() throws Exception{
//        Integer i1 = 100;
//        Integer i2 = 100;
//        Integer i3 = 200;
//        Integer i4 = 200;
//        System.out.println(i1 == i2);
//        System.out.println(i3 == i4);
//
//        System.out.println(i1.equals(i2));
//        System.out.println(i3.equals(i4));
//
//        Integer i5 = 150;
//        Integer i6 = 150;
//        System.out.println(i5 == i6);
        float f1 = 1f - 0.9f;
        float f2 = 0.9f - 0.8f;
        System.out.println(f1 == f2);
        System.out.println(f1 - f2);
        System.out.println(Math.abs(f1 - f2));

        float f3 = 1.0f;
        float f4 = 0.9f;
        System.out.println(f3 - f4);

        float f5 = 1e-6f;
        System.out.println(f5);

        String s = "iii,iuu,uy,yh,hdh,fd";
        String[] arr = s.split(",");
        System.out.println(arr.length);

        List<String> list = new ArrayList<>();
        list.add("ddd");
        list.add("33");
        list.add("aaa");
        list.forEach(item -> {
            System.out.println(item);
        });

        Integer i8 = null;
        Integer i9 = 99;
        System.out.println(i9 == i8);

//        System.out.println(getInt());
        int ii = i8;
        System.out.println(ii);
    }


}
