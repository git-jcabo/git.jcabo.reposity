package org.jcabo.jcabospring;

import org.jcabo.jcabospring.service.controller.CommonController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc////不启动服务器,使用mockMvc进行测试http请求。启动了完整的Spring应用程序上下文，但没有启动服务器
class JcaboSpringApplicationTests {

    @Resource
    private CommonController commonController;

    @Resource
    private MockMvc mockMvc;

    // 直接测试controller
    @Test
    void contextLoads() throws Exception{
        System.out.println(commonController.testController());
    }

    /**
     * .perform() : 执行一个MockMvcRequestBuilders的请求；MockMvcRequestBuilders有.get()、.post()、.put()、.delete()等请求。
     * .andDo() : 添加一个MockMvcResultHandlers结果处理器,可以用于打印结果输出(MockMvcResultHandlers.print())。
     * .andExpect : 添加MockMvcResultMatchers验证规则，验证执行结果是否正确。
     */
    @Test
    void testTest01() throws Exception{
        ResultActions resultActions = mockMvc.perform(get("/test01"));
        String content = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("content=====" + content);
    }



}
