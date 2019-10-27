package com.hust.travel.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hust.travel.vo.Result;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author HUST SE1901
 * @since 2019-10-22
 */
@Controller
public class IndexController {

    /**
     * 周边玩乐项目推荐（爬取携程数据）
     */
    @ResponseBody
    @GetMapping("spider")
    public Result spider(@RequestParam("sval") String sval,
                         @RequestParam("cid") String cid) {

        String requestBody = "{\n" +
                "    \"stype\": 0,\n" +
                "    \"sval\": \"" + sval + "\",\n" +
                "    \"size\": \"C_130_130\",\n" +
                "    \"sort\": 0,\n" +
                "    \"limit\": 20,\n" +
                "    \"contentType\": \"json\",\n" +
                "    \"head\": {\n" +
                "        \"appid\": \"100013776\",\n" +
                "        \"cid\": \"" + cid + "\",\n" +
                "        \"ctok\": \"\",\n" +
                "        \"cver\": \"1.0\",\n" +
                "        \"lang\": \"01\",\n" +
                "        \"sid\": \"8888\",\n" +
                "        \"syscode\": \"09\",\n" +
                "        \"auth\": \"\",\n" +
                "        \"extension\": [\n" +
                "            {\n" +
                "                \"name\": \"protocal\",\n" +
                "                \"value\": \"https\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"ver\": \"7.10.3.0319180000\",\n" +
                "    \"pageid\": 10650000804\n" +
                "}";

        HttpResponse<String> response = Unirest.post("https://sec-m.ctrip.com/restapi/soa2/12530/json/activityProdSearch?_fxpcqlniredt=" + cid)
                .header("Content-Type", "application/json")
                .header("User-Agent", "PostmanRuntime/7.19.0")
                .header("Accept", "*/*")
                .header("Cache-Control", "no-cache")
                .header("Postman-Token", "bdc14076-969a-4a33-8d7a-2a37f5a97553,461cc70e-98f1-4604-969b-319002d42ac4")
                .header("Host", "sec-m.ctrip.com")
                .header("Accept-Encoding", "gzip, deflate")
                .header("Connection", "keep-alive")
                .header("cache-control", "no-cache")
                .body(requestBody)
                .asString();
        if (response.isSuccess()) {
            return Result.success(JSON.parse(response.getBody()));
        } else {
            return Result.error(40005, "数据爬取异常！");
        }
    }
}
