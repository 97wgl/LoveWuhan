package com.hust.travel.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PictureControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void slideShow() throws Exception {
        String resultJsonStr = "{\n" +
                "    \"code\": 200,\n" +
                "    \"msg\": \"success\",\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 13,\n" +
                "            \"scenicId\": 3,\n" +
                "            \"path\": \"http://pzxjcv7a5.bkt.clouddn.com/image/fangao/01.jpg\",\n" +
                "            \"remark\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 19,\n" +
                "            \"scenicId\": 4,\n" +
                "            \"path\": \"http://pzxjcv7a5.bkt.clouddn.com/image/dusha/01.jpg\",\n" +
                "            \"remark\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 25,\n" +
                "            \"scenicId\": 5,\n" +
                "            \"path\": \"http://pzxjcv7a5.bkt.clouddn.com/image/qingchuange/01.jpg\",\n" +
                "            \"remark\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 31,\n" +
                "            \"scenicId\": 7,\n" +
                "            \"path\": \"http://pzxjcv7a5.bkt.clouddn.com/image/changjiangdaqiao/01.jpg\",\n" +
                "            \"remark\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 43,\n" +
                "            \"scenicId\": 11,\n" +
                "            \"path\": \"http://pzxjcv7a5.bkt.clouddn.com/image/yuanboyuan/01.jpg\",\n" +
                "            \"remark\": \"\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        mvc.perform(MockMvcRequestBuilders.get("/picture/slideShow").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr));
    }

    @Test
    public void list() throws Exception {
        String resultJsonStr1 = "{\n" +
                "    \"code\": 200,\n" +
                "    \"msg\": \"success\",\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 49,\n" +
                "            \"scenicId\": 12,\n" +
                "            \"path\": \"http://pzxjcv7a5.bkt.clouddn.com/image/zhiyinhao/01.jpg\",\n" +
                "            \"remark\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 50,\n" +
                "            \"scenicId\": 12,\n" +
                "            \"path\": \"http://pzxjcv7a5.bkt.clouddn.com/image/zhiyinhao/02.jpg\",\n" +
                "            \"remark\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 51,\n" +
                "            \"scenicId\": 12,\n" +
                "            \"path\": \"http://pzxjcv7a5.bkt.clouddn.com/image/zhiyinhao/03.jpg\",\n" +
                "            \"remark\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 52,\n" +
                "            \"scenicId\": 12,\n" +
                "            \"path\": \"http://pzxjcv7a5.bkt.clouddn.com/image/zhiyinhao/04.jpg\",\n" +
                "            \"remark\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 53,\n" +
                "            \"scenicId\": 12,\n" +
                "            \"path\": \"http://pzxjcv7a5.bkt.clouddn.com/image/zhiyinhao/05.jpg\",\n" +
                "            \"remark\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 54,\n" +
                "            \"scenicId\": 12,\n" +
                "            \"path\": \"http://pzxjcv7a5.bkt.clouddn.com/image/zhiyinhao/06.jpg\",\n" +
                "            \"remark\": \"\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        String resultJsonStr2 = "{\n" +
                "    \"code\": 40001,\n" +
                "    \"msg\": \"param error\",\n" +
                "    \"data\": null\n" +
                "}";

        String resultJsonStr3 = "{\n" +
                "    \"code\": 40002,\n" +
                "    \"msg\": \"null result\",\n" +
                "    \"data\": null\n" +
                "}";

        mvc.perform(MockMvcRequestBuilders.get("/picture/list").param("sid", "12")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr1));

        mvc.perform(MockMvcRequestBuilders.get("/picture/list").param("sid", "-1")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr2));

        mvc.perform(MockMvcRequestBuilders.get("/picture/list").param("sid", "100")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr3));

    }
}
