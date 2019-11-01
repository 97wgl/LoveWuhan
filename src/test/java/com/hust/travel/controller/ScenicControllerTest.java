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
public class ScenicControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void list() throws Exception {
        String resultJsonStr1 = "{\n" +
                "    \"code\": 200,\n" +
                "    \"msg\": \"success\",\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"name\": \"昙华林\",\n" +
                "            \"introduction\": \"昙华林，位于湖北省武汉市武昌区西部，毗邻湖北中医药大学武昌校区，地处城墙内的花园山北麓与螃蟹岬（亦名城山）南麓之间，随两山并行呈东西走向。历史上的昙华林是指与戈甲营出口相连的以东地段。1946年，武昌地方当局将戈甲营出口以西的正卫街和游家巷并入统称为昙华林后，其街名一直沿袭至今。现昙华林街武昌花园山以北、凤凰山以南，东起中山路，西至得胜桥，全长1200米，是明洪武四年（1371年）武昌城扩建定型后逐渐形成的一条老街。\",\n" +
                "            \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/昙华林.mp4\",\n" +
                "            \"address\": \"湖北武汉武昌区[粮道街](https://baike.baidu.com/item/粮道街)，花园山北麓与螃蟹岬之间\",\n" +
                "            \"ticket\": 0.00,\n" +
                "            \"discount\": \"1.00,0.75,0.5\",\n" +
                "            \"population\": 196,\n" +
                "            \"status\": \"1\",\n" +
                "            \"remark\": \"湖北武汉武昌区[粮道街](https://baike.baidu.com/item/粮道街)，花园山北麓与螃蟹岬之间\",\n" +
                "            \"sval\": \"119307\",\n" +
                "            \"cid\": \"09031154412099822493\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"name\": \"武汉大学\",\n" +
                "            \"introduction\": \"武汉大学作为中国最古老的大学之一，被誉为“中国最美的大学校园”。武汉大学校园以樱花最为闻名，每年春季3月中旬，樱花盛开的时候，武汉大学景色十分优美。武汉大学环绕东湖水，坐拥珞珈山，校园内中西合璧的宫殿式早期建筑群古朴典雅，巍峨壮观，堪称“近现代中国大学校园建筑的佳作与典范”，一批武汉大学早期建筑（群）被国务院列为“全国重点文物保护单位”如：宋卿体育馆、樱园老斋舍、老图书馆、理学楼、半山庐、十八栋。武汉大学法学大楼、经管大楼、外语大楼等标志性建筑群气势雄伟，新老建筑交相辉映，相得益彰。\",\n" +
                "            \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/武汉大学.mp4\",\n" +
                "            \"address\": \"湖北省武汉市武昌区八一路299号\",\n" +
                "            \"ticket\": 0.00,\n" +
                "            \"discount\": \"1.00,0.75,0.5\",\n" +
                "            \"population\": 17,\n" +
                "            \"status\": \"1\",\n" +
                "            \"remark\": null,\n" +
                "            \"sval\": \"45011\",\n" +
                "            \"cid\": \"09031058111981296362\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 10,\n" +
                "            \"name\": \"黄鹤楼\",\n" +
                "            \"introduction\": \"黄鹤楼位于湖北省武汉市长江南岸的武昌[蛇山](https://baike.baidu.com/item/蛇山/32580)之巅，濒临万里长江，是国家5A级旅游景区，“江南三大名楼”之一，自古享有“天下江山第一楼“和”天下绝景“之称。楼高5层，总高度51.4米，建筑面积3219平方米。黄鹤楼内部由72根圆柱支撑，外部有60个翘角向外伸展，屋面用10多万块黄色琉璃瓦覆盖构建而成。唐代诗人崔颢在此题下《黄鹤楼》一诗，李白在此写下《黄鹤楼送孟浩然之广陵》，历代文人墨客在此留下了许多千古绝唱，使得黄鹤楼自古以来闻名遐迩。\",\n" +
                "            \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/黄鹤楼.mp4\",\n" +
                "            \"address\": \"武汉市武昌区蛇山西山坡特1号\",\n" +
                "            \"ticket\": 70.00,\n" +
                "            \"discount\": \"1.00,0.5,0.5\",\n" +
                "            \"population\": 14,\n" +
                "            \"status\": \"1\",\n" +
                "            \"remark\": null,\n" +
                "            \"sval\": \"8979\",\n" +
                "            \"cid\": \"09031084410416128453\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 12,\n" +
                "            \"name\": \"知音号\",\n" +
                "            \"introduction\": \"“知音号”是以上世纪初，武汉民生公司的“江华轮”为原型而打造的一艘蒸汽游轮，船剧同名的长江首部文化大剧——《知音号》也在此举行。“知音号”的码头、趸船和演艺船都是戏剧上演的舞台，四层各具特色的船体空间，浮沉晃动的近百间客房，勾勒了一个漂浮在水上的戏梦空间。船上灯光、桌椅等多种道具共同还原了当时的情境，加上4层的“城市记忆博物馆”里陈列我们从全球征集而来的老物件，老故事，它们共同还原着当年的大武汉风情。\",\n" +
                "            \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/知音号.mp4\",\n" +
                "            \"address\": \"武汉市江岸区沿江大道汉口江滩内知音号码头\",\n" +
                "            \"ticket\": 228.00,\n" +
                "            \"discount\": \"1.00,1,1\",\n" +
                "            \"population\": 7,\n" +
                "            \"status\": \"1\",\n" +
                "            \"remark\": null,\n" +
                "            \"sval\": \"2003222\",\n" +
                "            \"cid\": \"09031089210695162206\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 11,\n" +
                "            \"name\": \"园博园\",\n" +
                "            \"introduction\": \"武汉市园博园北靠荆山，南面楚水，由“武汉自然博物馆·贝林大河生命馆、长江文明馆、和武汉园博园213.7公顷的自然景观3个部分共同组成”，武汉自然博物馆·贝林大河生命馆建筑面积2.9万平方米，展览面积1.8万平方米，展出各类标本3000多件。展览主题为“大河之旅 生命之歌”，包括“大河沧桑”、“大河珍灵”、“大河沉思”、“大河探秘”和“科普空间”五大板块。园博园项目在2015年从巴黎捧回“C40城市气候领袖奖”。\",\n" +
                "            \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/园博园.mp4\",\n" +
                "            \"address\": \"武汉市东西湖区金南二路8号\",\n" +
                "            \"ticket\": 55.00,\n" +
                "            \"discount\": \"1.00,1,1\",\n" +
                "            \"population\": 3,\n" +
                "            \"status\": \"1\",\n" +
                "            \"remark\": null,\n" +
                "            \"sval\": \"1739990\",\n" +
                "            \"cid\": \"09031122211213672616\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 3,\n" +
                "            \"name\": \"梵高星空艺术馆\",\n" +
                "            \"introduction\": \"武汉梵高星空艺术馆，颠覆想象、奇迹梵高。艺术馆全面启用空间视错觉、光影效果等高端技术，将原本在平面中呈现的名画彻底立体化，成为一个可触摸、可进入、可任意玩味的真实4D炫酷场景。梦幻时光隧道、魔幻镜像迷宫、世纪之吻、北欧星空、星际穿月、爱在星夜等互动产品，其中尤其以魔幻镜像迷宫颇为神秘，彻底颠覆现有的艺术展览形式，加入音乐灯光秀，使整体氛围渲染更为梦幻，并预计引进立体成像技术，为游客呈现一个前所未见的奇妙魔幻空间。 \",\n" +
                "            \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/梵高星空艺术馆.mp4\",\n" +
                "            \"address\": \"汉阳区龙阳大道188号海宁皮革城3层绿厅湖北路\",\n" +
                "            \"ticket\": 45.00,\n" +
                "            \"discount\": \"1.00,1,1\",\n" +
                "            \"population\": 2,\n" +
                "            \"status\": \"1\",\n" +
                "            \"remark\": null,\n" +
                "            \"sval\": \"2505521\",\n" +
                "            \"cid\": \"09031013312075785501\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
        String resultJsonStr2 = "{\n" +
                "    \"code\": 200,\n" +
                "    \"msg\": \"success\",\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"name\": \"昙华林\",\n" +
                "            \"introduction\": \"昙华林，位于湖北省武汉市武昌区西部，毗邻湖北中医药大学武昌校区，地处城墙内的花园山北麓与螃蟹岬（亦名城山）南麓之间，随两山并行呈东西走向。历史上的昙华林是指与戈甲营出口相连的以东地段。1946年，武昌地方当局将戈甲营出口以西的正卫街和游家巷并入统称为昙华林后，其街名一直沿袭至今。现昙华林街武昌花园山以北、凤凰山以南，东起中山路，西至得胜桥，全长1200米，是明洪武四年（1371年）武昌城扩建定型后逐渐形成的一条老街。\",\n" +
                "            \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/昙华林.mp4\",\n" +
                "            \"address\": \"湖北武汉武昌区[粮道街](https://baike.baidu.com/item/粮道街)，花园山北麓与螃蟹岬之间\",\n" +
                "            \"ticket\": 0.00,\n" +
                "            \"discount\": \"1.00,0.75,0.5\",\n" +
                "            \"population\": 196,\n" +
                "            \"status\": \"1\",\n" +
                "            \"remark\": \"湖北武汉武昌区[粮道街](https://baike.baidu.com/item/粮道街)，花园山北麓与螃蟹岬之间\",\n" +
                "            \"sval\": \"119307\",\n" +
                "            \"cid\": \"09031154412099822493\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"name\": \"武汉大学\",\n" +
                "            \"introduction\": \"武汉大学作为中国最古老的大学之一，被誉为“中国最美的大学校园”。武汉大学校园以樱花最为闻名，每年春季3月中旬，樱花盛开的时候，武汉大学景色十分优美。武汉大学环绕东湖水，坐拥珞珈山，校园内中西合璧的宫殿式早期建筑群古朴典雅，巍峨壮观，堪称“近现代中国大学校园建筑的佳作与典范”，一批武汉大学早期建筑（群）被国务院列为“全国重点文物保护单位”如：宋卿体育馆、樱园老斋舍、老图书馆、理学楼、半山庐、十八栋。武汉大学法学大楼、经管大楼、外语大楼等标志性建筑群气势雄伟，新老建筑交相辉映，相得益彰。\",\n" +
                "            \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/武汉大学.mp4\",\n" +
                "            \"address\": \"湖北省武汉市武昌区八一路299号\",\n" +
                "            \"ticket\": 0.00,\n" +
                "            \"discount\": \"1.00,0.75,0.5\",\n" +
                "            \"population\": 17,\n" +
                "            \"status\": \"1\",\n" +
                "            \"remark\": null,\n" +
                "            \"sval\": \"45011\",\n" +
                "            \"cid\": \"09031058111981296362\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 10,\n" +
                "            \"name\": \"黄鹤楼\",\n" +
                "            \"introduction\": \"黄鹤楼位于湖北省武汉市长江南岸的武昌[蛇山](https://baike.baidu.com/item/蛇山/32580)之巅，濒临万里长江，是国家5A级旅游景区，“江南三大名楼”之一，自古享有“天下江山第一楼“和”天下绝景“之称。楼高5层，总高度51.4米，建筑面积3219平方米。黄鹤楼内部由72根圆柱支撑，外部有60个翘角向外伸展，屋面用10多万块黄色琉璃瓦覆盖构建而成。唐代诗人崔颢在此题下《黄鹤楼》一诗，李白在此写下《黄鹤楼送孟浩然之广陵》，历代文人墨客在此留下了许多千古绝唱，使得黄鹤楼自古以来闻名遐迩。\",\n" +
                "            \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/黄鹤楼.mp4\",\n" +
                "            \"address\": \"武汉市武昌区蛇山西山坡特1号\",\n" +
                "            \"ticket\": 70.00,\n" +
                "            \"discount\": \"1.00,0.5,0.5\",\n" +
                "            \"population\": 14,\n" +
                "            \"status\": \"1\",\n" +
                "            \"remark\": null,\n" +
                "            \"sval\": \"8979\",\n" +
                "            \"cid\": \"09031084410416128453\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 12,\n" +
                "            \"name\": \"知音号\",\n" +
                "            \"introduction\": \"“知音号”是以上世纪初，武汉民生公司的“江华轮”为原型而打造的一艘蒸汽游轮，船剧同名的长江首部文化大剧——《知音号》也在此举行。“知音号”的码头、趸船和演艺船都是戏剧上演的舞台，四层各具特色的船体空间，浮沉晃动的近百间客房，勾勒了一个漂浮在水上的戏梦空间。船上灯光、桌椅等多种道具共同还原了当时的情境，加上4层的“城市记忆博物馆”里陈列我们从全球征集而来的老物件，老故事，它们共同还原着当年的大武汉风情。\",\n" +
                "            \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/知音号.mp4\",\n" +
                "            \"address\": \"武汉市江岸区沿江大道汉口江滩内知音号码头\",\n" +
                "            \"ticket\": 228.00,\n" +
                "            \"discount\": \"1.00,1,1\",\n" +
                "            \"population\": 7,\n" +
                "            \"status\": \"1\",\n" +
                "            \"remark\": null,\n" +
                "            \"sval\": \"2003222\",\n" +
                "            \"cid\": \"09031089210695162206\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 11,\n" +
                "            \"name\": \"园博园\",\n" +
                "            \"introduction\": \"武汉市园博园北靠荆山，南面楚水，由“武汉自然博物馆·贝林大河生命馆、长江文明馆、和武汉园博园213.7公顷的自然景观3个部分共同组成”，武汉自然博物馆·贝林大河生命馆建筑面积2.9万平方米，展览面积1.8万平方米，展出各类标本3000多件。展览主题为“大河之旅 生命之歌”，包括“大河沧桑”、“大河珍灵”、“大河沉思”、“大河探秘”和“科普空间”五大板块。园博园项目在2015年从巴黎捧回“C40城市气候领袖奖”。\",\n" +
                "            \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/园博园.mp4\",\n" +
                "            \"address\": \"武汉市东西湖区金南二路8号\",\n" +
                "            \"ticket\": 55.00,\n" +
                "            \"discount\": \"1.00,1,1\",\n" +
                "            \"population\": 3,\n" +
                "            \"status\": \"1\",\n" +
                "            \"remark\": null,\n" +
                "            \"sval\": \"1739990\",\n" +
                "            \"cid\": \"09031122211213672616\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        String resultJsonStr3 = "{\n" +
                "    \"code\": 40002,\n" +
                "    \"msg\": \"null result\",\n" +
                "    \"data\": null\n" +
                "}";

        mvc.perform(MockMvcRequestBuilders.get("/scenic/list")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr1));

        mvc.perform(MockMvcRequestBuilders.get("/scenic/list")
                .param("page", "-10").param("rows", "5")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr2));

        mvc.perform(MockMvcRequestBuilders.get("/scenic/list")
                .param("page", "80").param("rows", "10")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr3));
    }

    @Test
    public void info() throws Exception {
        String resultJsonStr1 = "{\n" +
                "    \"code\": 200,\n" +
                "    \"msg\": \"success\",\n" +
                "    \"data\": {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"昙华林\",\n" +
                "        \"introduction\": \"昙华林，位于湖北省武汉市武昌区西部，毗邻湖北中医药大学武昌校区，地处城墙内的花园山北麓与螃蟹岬（亦名城山）南麓之间，随两山并行呈东西走向。历史上的昙华林是指与戈甲营出口相连的以东地段。1946年，武昌地方当局将戈甲营出口以西的正卫街和游家巷并入统称为昙华林后，其街名一直沿袭至今。现昙华林街武昌花园山以北、凤凰山以南，东起中山路，西至得胜桥，全长1200米，是明洪武四年（1371年）武昌城扩建定型后逐渐形成的一条老街。\",\n" +
                "        \"videoPath\": \"https://wglcos-1254122634.cos.ap-chengdu.myqcloud.com/videos/昙华林.mp4\",\n" +
                "        \"address\": \"湖北武汉武昌区[粮道街](https://baike.baidu.com/item/粮道街)，花园山北麓与螃蟹岬之间\",\n" +
                "        \"ticket\": 0.00,\n" +
                "        \"discount\": \"1.00,0.75,0.5\",\n" +
                "        \"population\": 196,\n" +
                "        \"status\": \"1\",\n" +
                "        \"remark\": \"湖北武汉武昌区[粮道街](https://baike.baidu.com/item/粮道街)，花园山北麓与螃蟹岬之间\",\n" +
                "        \"sval\": \"119307\",\n" +
                "        \"cid\": \"09031154412099822493\"\n" +
                "    }\n" +
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

        mvc.perform(MockMvcRequestBuilders.get("/scenic/info").param("id", "1")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr1));

        mvc.perform(MockMvcRequestBuilders.get("/scenic/info").param("id", "0")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr2));

        mvc.perform(MockMvcRequestBuilders.get("/scenic/info").param("id", "100")
                .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(content().json(resultJsonStr3));
    }

}
