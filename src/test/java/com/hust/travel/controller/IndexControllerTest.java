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
public class IndexControllerTest {
    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void spider() throws Exception {
        String resultJsonStr1 = "{\n" +
                "    \"code\": 200,\n" +
                "    \"msg\": \"success\",\n" +
                "    \"data\": {\n" +
                "        \"head\": {\n" +
                "            \"errcode\": 0,\n" +
                "            \"auth\": \"\",\n" +
                "            \"errmsg\": \"\"\n" +
                "        },\n" +
                "        \"data\": {\n" +
                "            \"actses\": [\n" +
                "                {\n" +
                "                    \"mprice\": 399,\n" +
                "                    \"catyid\": 246,\n" +
                "                    \"saletag\": null,\n" +
                "                    \"link\": \"http://huodong.ctrip.com/activity/18947662.html\",\n" +
                "                    \"taginfos\": null,\n" +
                "                    \"sc\": 0.0,\n" +
                "                    \"imgurl\": \"https://dimg04.c-ctrip.com/images/350n0s000000hw47u3C84_C_130_130_Q60.jpg\",\n" +
                "                    \"catyname\": \"休闲娱乐\",\n" +
                "                    \"price\": 299.00,\n" +
                "                    \"pmrand\": \"三年到五年资质旅拍摄影师\",\n" +
                "                    \"name\": \"武汉摄影短视频录制MV跟拍亲子旅拍情侣照全家福闺蜜 【可定今日】啊旅拍\",\n" +
                "                    \"depid\": 477,\n" +
                "                    \"id\": 18947662,\n" +
                "                    \"depname\": \"武汉\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"mprice\": 0,\n" +
                "                    \"catyid\": 247,\n" +
                "                    \"saletag\": null,\n" +
                "                    \"link\": \"http://huodong.ctrip.com/activity/21756415.html\",\n" +
                "                    \"taginfos\": null,\n" +
                "                    \"sc\": 0.0,\n" +
                "                    \"imgurl\": \"https://dimg04.c-ctrip.com/images/350613000000udtzc9CE4_C_130_130_Q60.jpg\",\n" +
                "                    \"catyname\": \"新奇探险\",\n" +
                "                    \"price\": 100.00,\n" +
                "                    \"pmrand\": \"带你上天带你飞！全程专业教练陪伴，放心体验飞行乐趣！\",\n" +
                "                    \"name\": \"湖北荆门圣境山滑翔伞体验-高空全新极限挑战玩法/楚天航空基地俱乐部 【空中视角 独特体验】\",\n" +
                "                    \"depid\": 477,\n" +
                "                    \"id\": 21756415,\n" +
                "                    \"depname\": \"武汉\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"mprice\": 0,\n" +
                "                    \"catyid\": 247,\n" +
                "                    \"saletag\": null,\n" +
                "                    \"link\": \"http://huodong.ctrip.com/activity/21741459.html\",\n" +
                "                    \"taginfos\": null,\n" +
                "                    \"sc\": 0.0,\n" +
                "                    \"imgurl\": \"https://dimg04.c-ctrip.com/images/350115000000xvyd0FF45_C_130_130_Q60.jpg\",\n" +
                "                    \"catyname\": \"新奇探险\",\n" +
                "                    \"price\": 100.00,\n" +
                "                    \"pmrand\": \"带你上天带你飞！全程专业教练陪伴，放心体验飞行乐趣！\",\n" +
                "                    \"name\": \"湖北武汉木兰山滑翔伞体验-高空全新极限挑战玩法/九头鸟基地俱乐部 【空中视角 独特体验】\",\n" +
                "                    \"depid\": 477,\n" +
                "                    \"id\": 21741459,\n" +
                "                    \"depname\": \"武汉\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        \"ResponseStatus\": {\n" +
                "            \"Extension\": [\n" +
                "                {\n" +
                "                    \"ContentType\": null,\n" +
                "                    \"Version\": null,\n" +
                "                    \"Value\": \"5667020607905799319\",\n" +
                "                    \"Id\": \"CLOGGING_TRACE_ID\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"ContentType\": null,\n" +
                "                    \"Version\": null,\n" +
                "                    \"Value\": \"921812-0a0f9033-436830-307877\",\n" +
                "                    \"Id\": \"RootMessageId\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"Errors\": [],\n" +
                "            \"Version\": null,\n" +
                "            \"Build\": null,\n" +
                "            \"Ack\": \"Success\",\n" +
                "            \"Timestamp\": \"/Date(1572588459144+0800)/\"\n" +
                "        }\n" +
                "    }\n" +
                "}";

        String resultJsonStr2 = "{\n" +
                "    \"code\": 40005,\n" +
                "    \"msg\": \"数据爬取异常！\",\n" +
                "    \"data\": null\n" +
                "}";

        mvc.perform(MockMvcRequestBuilders.get("/spider")
                .param("sval", "1739990").param("cid", "09031034310124659114")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr1));

        mvc.perform(MockMvcRequestBuilders.get("/spider")
                .param("sval", "999999").param("cid", "8974327225532532532")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr2));
    }
}
