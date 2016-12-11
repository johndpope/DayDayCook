package com.dayday.cook.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by fan on 2016/12/8.
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting
 * 　　　　┃　　　┃    神兽保佑,代码无bug
 * 　　　　┃　　　┃
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * <p/>
 * ━━━━━━感觉萌萌哒━━━━━━
 */
public class ShiPinZhuanQu {

    /**
     * msg : 操作成功
     * code : 200
     * data : [{"icon_url":"","videoCount":0,"name":"最新","videos":[]},{"icon_url":"http://pic.daydaycook.com/production/images/20161027/60407c06-5c67-4771-8fb2-113382e45e6e","videoCount":7,"name":"最新","videos":[{"videoLength":"02:47","clickCount":594,"releaseDate":"2016-12-02 18:37:31","pageInfo":null,"description":"有料厨房","indexUrl":"http://pic.daydaycook.com/production/images/20161202/b2f2d656-de80-4061-911a-220ab1f54ba6","source":"","title":"文艺青年的快手早餐指南","shareCount":1,"videoUrl":"http://pic.daydaycook.com/production/videos/20161202/0042c1b5-41b3-484b-a44e-f9b434dcd09f","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=139&languageId=3&mainland=1&site=bve","id":139,"favoriteCount":2},{"videoLength":"04:49","clickCount":442,"releaseDate":"2016-11-29 12:45:24","pageInfo":null,"description":"测哪儿","indexUrl":"http://pic.daydaycook.com/production/images/20161129/e1f14721-1c43-4542-9dd2-48df0fe6d785","source":"","title":"烘焙烤箱大测评","shareCount":1,"videoUrl":"http://pic.daydaycook.com/production/videos/20161129/85fd2f69-cc10-466f-87a9-4d35b8910a5b","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=135&languageId=3&mainland=1&site=bve","id":135,"favoriteCount":2},{"videoLength":"04:32","clickCount":650,"releaseDate":"2016-11-28 13:19:09","pageInfo":null,"description":"趣食","indexUrl":"http://pic.daydaycook.com/production/images/20161128/48f7530a-d34b-4945-b722-b1d06c2e17ce","source":"","title":"在家独享的4款中式小食","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161128/dcef1b8d-ad08-4f39-9cfc-d06d1395e450","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=134&languageId=3&mainland=1&site=bve","id":134,"favoriteCount":3},{"videoLength":"03:08","clickCount":566,"releaseDate":"2016-11-24 11:03:32","pageInfo":null,"description":"厨访","indexUrl":"http://pic.daydaycook.com/production/images/20161124/73b30cb0-8355-433b-9dfa-75564ccff83e","source":"","title":"最吸引眼球的盐烤带鱼","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161124/7459be3f-8179-4f54-9c62-dabac7e9f0ac","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=130&languageId=3&mainland=1&site=bve","id":130,"favoriteCount":0},{"videoLength":"04:50","clickCount":532,"releaseDate":"2016-11-23 11:18:07","pageInfo":null,"description":"生活N次方","indexUrl":"http://pic.daydaycook.com/production/images/20161123/ec42fc8c-c4e0-4927-b4f1-badc879de3b9","source":"","title":"Get最装X去果皮技能","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161123/4023baa3-82bf-48c4-9114-a576a3a04f5d","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=129&languageId=3&mainland=1&site=bve","id":129,"favoriteCount":2},{"videoLength":"04:43","clickCount":273,"releaseDate":"2016-11-22 15:12:03","pageInfo":null,"description":"Norma在这里","indexUrl":"http://pic.daydaycook.com/production/images/20161122/81586733-aabe-4b36-84d4-fd4ac3e907c7","source":"","title":"享受阳朔慢生活","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161122/41c6d9e4-06d3-4a2e-b517-edf9b553bf9f","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=128&languageId=3&mainland=1&site=bve","id":128,"favoriteCount":2},{"videoLength":"01:59","clickCount":534,"releaseDate":"2016-11-21 12:57:56","pageInfo":null,"description":"趣食","indexUrl":"http://pic.daydaycook.com/production/images/20161121/6a46555c-286b-4d33-82ad-c60875406da8","source":"","title":"百分百还原小当家料理","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161121/c6059a98-2bc3-45d4-b1d5-0ad06adfb7a4","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=124&languageId=3&mainland=1&site=bve","id":124,"favoriteCount":2}],"id":10},{"icon_url":"http://pic.daydaycook.com/production/images/20161027/101b7f13-fac5-4692-b0c5-5e0d551fb856","videoCount":7,"name":"烹饪小贴士","videos":[{"videoLength":"01:37","clickCount":25,"releaseDate":"2016-12-08 10:00:34","pageInfo":null,"description":"入厨101","indexUrl":"http://pic.daydaycook.com/production/images/20161208/eccfa149-d447-419f-97bf-0c413a85c493","source":"","title":"如何剁鸡肉","shareCount":0,"videoUrl":"http://pic.daydaycook.com/production/videos/20161208/1b3dc844-99a6-4672-9312-39c0b7fe6748","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=143&languageId=3&mainland=1&site=bve","id":143,"favoriteCount":0},{"videoLength":"01:58","clickCount":126,"releaseDate":"2016-12-07 11:03:06","pageInfo":null,"description":"入厨101","indexUrl":"http://pic.daydaycook.com/production/images/20161207/5ae301f1-89d9-4f89-8a6e-584bc7530bd1","source":"","title":"如何切洋葱","shareCount":0,"videoUrl":"http://pic.daydaycook.com/production/videos/20161207/55107666-f1cd-465c-bcc4-3e8db0da68a2","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=142&languageId=3&mainland=1&site=bve","id":142,"favoriteCount":1},{"videoLength":"02:04","clickCount":274,"releaseDate":"2016-12-06 10:40:55","pageInfo":null,"description":"入厨101","indexUrl":"http://pic.daydaycook.com/production/images/20161206/7ccc4479-c217-4469-9104-b297c2d42058","source":"","title":"如何处理虾","shareCount":0,"videoUrl":"http://pic.daydaycook.com/production/videos/20161206/e3b88c6a-f5f6-42ef-af09-9fdccc135f79","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=141&languageId=3&mainland=1&site=bve","id":141,"favoriteCount":1},{"videoLength":"02:20","clickCount":211,"releaseDate":"2016-12-05 13:42:52","pageInfo":null,"description":"入厨101","indexUrl":"http://pic.daydaycook.com/production/images/20161205/3f0e07f9-3423-4d8e-b0c5-2cb8320d1405","source":"","title":"如何切萝卜","shareCount":0,"videoUrl":"http://pic.daydaycook.com/production/videos/20161205/9ab4a817-f7e5-4f42-992a-5c0ff1967397","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=140&languageId=3&mainland=1&site=bve","id":140,"favoriteCount":0},{"videoLength":"02:08","clickCount":307,"releaseDate":"2016-12-02 10:58:44","pageInfo":null,"description":"入厨101","indexUrl":"http://pic.daydaycook.com/production/images/20161202/dab7a947-6eb5-4675-8de6-7f7b48658060","source":"","title":"如何快速煮粥","shareCount":0,"videoUrl":"http://pic.daydaycook.com/production/videos/20161202/879ad1dd-69f1-4870-a6f8-85c7600f83b8","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=138&languageId=3&mainland=1&site=bve","id":138,"favoriteCount":2},{"videoLength":"01:29","clickCount":256,"releaseDate":"2016-12-01 10:49:54","pageInfo":null,"description":"入厨101","indexUrl":"http://pic.daydaycook.com/production/images/20161201/0b176d68-051e-4c0a-a60e-23c6e0058160","source":"","title":"如何煮意粉","shareCount":0,"videoUrl":"http://pic.daydaycook.com/production/videos/20161201/f6a19583-59c5-4b34-9952-3bd6929e9ef1","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=137&languageId=3&mainland=1&site=bve","id":137,"favoriteCount":1},{"videoLength":"01:38","clickCount":282,"releaseDate":"2016-11-30 10:25:59","pageInfo":null,"description":"入厨101","indexUrl":"http://pic.daydaycook.com/production/images/20161130/8ce15b6c-0a87-43d9-a899-fad917d8c416","source":"","title":"如何做风琴薯","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161130/15307870-2b66-4329-940f-7d6fb7d6d7a5","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=136&languageId=3&mainland=1&site=bve","id":136,"favoriteCount":1}],"id":14},{"icon_url":"http://pic.daydaycook.com/production/images/20161027/6f240ea8-1116-43a1-a897-2b501e00559c","videoCount":7,"name":"创意","videos":[{"videoLength":"04:53","clickCount":711,"releaseDate":"2016-11-11 00:00:00","pageInfo":null,"description":"趣食 -五种泡面神吃法\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/2427b62e-2140-4f23-9acb-6375ed4766cf","source":"","title":"泡面，除了煮，还能怎么吃？","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161104/5b71fbe3-6e38-4e5e-81f1-31de50ba3ccb","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=117&languageId=3&mainland=1&site=bve","id":117,"favoriteCount":3},{"videoLength":"05:04","clickCount":552,"releaseDate":"2016-11-08 00:00:00","pageInfo":null,"description":"生活N次方 - 咖喱的奇妙世界\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161104/5bf27dd5-3883-42b9-9ede-f8fa690cd13d","source":"","title":"一学就会的自制咖喱","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161104/18c0369d-e54c-4202-b26b-d98d7fda99fe","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=108&languageId=3&mainland=1&site=bve","id":108,"favoriteCount":3},{"videoLength":"03:54","clickCount":813,"releaseDate":"2016-10-27 20:34:09","pageInfo":null,"description":"趣食 -巧克力可乐瓶蛋糕","indexUrl":"http://pic.daydaycook.com/production/images/20161124/3c83f916-f2c6-4f64-91b6-fc4111272850","source":"","title":"你能为谁吃掉一个\u201c可乐瓶","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161028/623777b5-a3bc-4ad6-a606-bc7071658be7","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=88&languageId=3&mainland=1&site=bve","id":88,"favoriteCount":null},{"videoLength":"01:49","clickCount":264,"releaseDate":"2016-11-08 00:00:00","pageInfo":null,"description":"趣食 - 薯片的2种另类吃法\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/4382c12a-4458-4fdd-b07b-170b4010d982","source":"","title":"原来你是这样的薯片！","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161104/6ab95e58-8056-4fbb-b4b0-2d033e4f6cfd","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=107&languageId=3&mainland=1&site=bve","id":107,"favoriteCount":1},{"videoLength":"02:24","clickCount":524,"releaseDate":"2016-10-27 20:28:00","pageInfo":null,"description":"趣食 -三款星冰乐隐藏菜单","indexUrl":"http://pic.daydaycook.com/production/images/20161124/07b5bb02-e46f-4b1f-90ec-ad1000ab62b8","source":"","title":"因为爱你，不想隐藏自己","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161027/3ac5881c-e099-4ea8-b2a1-b96cc51398d1","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=53&languageId=3&mainland=1&site=bve","id":53,"favoriteCount":0},{"videoLength":"03:52","clickCount":296,"releaseDate":"2016-10-27 20:28:00","pageInfo":null,"description":"趣食 -网红麦片的五种吃法","indexUrl":"http://pic.daydaycook.com/production/images/20161027/5e7a1ed3-463b-4222-85cc-5d9b8f7be4a0","source":"","title":"神奇麦片，好吃到没朋友","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161027/ee2c496c-a32c-4d5d-b61c-1b84349b2340","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=50&languageId=3&mainland=1&site=bve","id":50,"favoriteCount":null},{"videoLength":"02:20","clickCount":288,"releaseDate":"2016-10-27 20:16:53","pageInfo":null,"description":"趣食 - 三道蟹料理\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/c4e20d19-f3b7-4b96-9bd5-4644f4efbdfc","source":"","title":"屌丝逆袭吃蟹","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161027/5a3d45d4-0044-4064-96f6-812c58f87365","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=55&languageId=3&mainland=1&site=bve","id":55,"favoriteCount":null}],"id":11},{"icon_url":"http://pic.daydaycook.com/production/images/20161027/b8cd5e01-8dd7-4b74-80b9-4322447fa53b","videoCount":7,"name":"旅行","videos":[{"videoLength":"06:49","clickCount":716,"releaseDate":"2016-10-27 23:00:11","pageInfo":null,"description":"Norma在这里 - 日本精致之味\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/58a6354d-2fc1-4738-8de5-fe41294595ab","source":"","title":"让你一口气吃8道菜的米其林餐厅","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161027/c20924e7-9f21-483e-b134-50216ae4fbed","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=93&languageId=3&mainland=1&site=bve","id":93,"favoriteCount":1},{"videoLength":"04:55","clickCount":635,"releaseDate":"2016-11-09 00:00:00","pageInfo":null,"description":"Norma在这里 - 桂林地道小吃\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/ba40f4fb-4c3b-4df0-9b3b-562898673790","source":"","title":"DIY桂林米粉","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161104/09f0bd38-02cb-4884-8d6f-e3b9e3a320bc","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=114&languageId=3&mainland=1&site=bve","id":114,"favoriteCount":null},{"videoLength":"04:22","clickCount":656,"releaseDate":"2016-11-07 00:00:00","pageInfo":null,"description":"Norma在这里 - 桂林地道吃\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/51563493-4759-409c-bc81-db8fd9f535a5","source":"","title":"\u201c船说\u201d中的美食","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161104/5e15d2e1-d2b0-4c95-b496-acc568d81ec0","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=112&languageId=3&mainland=1&site=bve","id":112,"favoriteCount":null},{"videoLength":"05:20","clickCount":377,"releaseDate":"2016-10-27 22:55:18","pageInfo":null,"description":"Norma在这里 - 日本美食攻略\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/d727caa8-f989-4928-a693-a47d0c6bcc56","source":"","title":"这个拉面会喷火","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161027/0bbbf042-6f20-42dd-8fbf-32646002d290","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=92&languageId=3&mainland=1&site=bve","id":92,"favoriteCount":null},{"videoLength":"06:47","clickCount":290,"releaseDate":"2016-10-27 22:54:22","pageInfo":null,"description":"Norma在这里 - 泰爱学\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/ed884349-febf-4cdb-8ac8-78776cd40460","source":"","title":"一学就会的泰式炒河粉","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161027/e10e13cd-e6ef-489c-b377-8567d157ede2","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=91&languageId=3&mainland=1&site=bve","id":91,"favoriteCount":null},{"videoLength":"06:04","clickCount":170,"releaseDate":"2016-10-27 22:53:04","pageInfo":null,"description":"Norma在这里-泰特别\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/9d652afc-f5b6-4dd0-b05e-92115e5f3d41","source":"","title":"The Commons，吃到停不下来","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161027/77698d7d-6153-48fc-8117-25cfdf7fbd16","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=90&languageId=3&mainland=1&site=bve","id":90,"favoriteCount":null},{"videoLength":"03:05","clickCount":172,"releaseDate":"2016-10-27 22:51:47","pageInfo":null,"description":"Norma在这里 - 泰能吃\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/c59db192-cda1-42ec-9c57-b4c39061d375","source":"","title":"这碗海南鸡饭比脸大","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161027/6fbb43ee-7ad5-43d1-8ad6-af1c12a594ec","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=89&languageId=3&mainland=1&site=bve","id":89,"favoriteCount":null}],"id":12},{"icon_url":"http://pic.daydaycook.com/production/images/20161027/c5f186a0-dc2b-490c-8c2f-9fcaa44a37d0","videoCount":7,"name":"探食到店","videos":[{"videoLength":"03:35","clickCount":538,"releaseDate":"2016-10-27 23:06:07","pageInfo":null,"description":"厨访 - 地中海碳烤海鲜拼盘\r\n","indexUrl":"http://pichk.daydaycook.com/production/images/20161027/3ba1e4d5-7d31-4032-b29e-63ce2d0423d7","source":"","title":"和对的人吃饭，心情会好六成","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161027/de23de50-7781-4174-98f3-b9d8cf2d450d","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=100&languageId=3&mainland=1&site=bve","id":100,"favoriteCount":1},{"videoLength":"05:29","clickCount":523,"releaseDate":"2016-10-27 20:11:35","pageInfo":null,"description":"厨访 - 养生花胶全鸡汤\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161027/2163b301-6bb5-4684-bdf6-8877a4511eed","source":"","title":"男人，懂得让女人更美","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161028/7dd78f07-0928-49be-b95b-4df441985a03","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=66&languageId=3&mainland=1&site=bve","id":66,"favoriteCount":1},{"videoLength":"03:05","clickCount":132,"releaseDate":"2016-11-09 00:00:00","pageInfo":null,"description":"厨访 - 多宝鱼骨香\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/68e08738-261d-4178-882a-cbfb78871d69","source":"","title":"一口嫩滑，一口酥脆，鱼要这样才好吃","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161104/dbdf76cd-006e-48ee-a5d9-2b07b99eb3d9","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=113&languageId=3&mainland=1&site=bve","id":113,"favoriteCount":1},{"videoLength":"04:06","clickCount":202,"releaseDate":"2016-10-27 23:05:12","pageInfo":null,"description":"厨访 - 苏格兰秘制溏心蛋\r\n","indexUrl":"http://pichk.daydaycook.com/production/images/20161027/ecbdf1ca-8ced-43c8-bce4-4f22c47bae89","source":"","title":"有时想念一道菜，是在想念一个人","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161027/ffd83d0b-bbbc-4151-a46e-9df2c1a18c81","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=96&languageId=3&mainland=1&site=bve","id":96,"favoriteCount":null},{"videoLength":"04:22","clickCount":449,"releaseDate":"2016-10-27 23:03:59","pageInfo":null,"description":"厨访 - 老板鹅肝煎蛋饭\r\n","indexUrl":"http://pic.daydaycook.com/production/images/20161124/5214f6c4-ec50-4b30-8c05-00e7f32a241c","source":"","title":"这碗拌饭最好吃","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161027/e890bb3b-54be-4b7c-aa50-13364357e6cb","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=97&languageId=3&mainland=1&site=bve","id":97,"favoriteCount":null},{"videoLength":"02:24","clickCount":174,"releaseDate":"2016-10-27 23:02:38","pageInfo":null,"description":"厨访 - 三色手打虾丸\r\n","indexUrl":"http://pichk.daydaycook.com/production/images/20161027/45459e80-90bf-4859-a426-14a4eeb288a0","source":"","title":"手工美食，每一口都好吃","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161027/23335f80-56ad-4824-9f9b-6301f8b55753","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=95&languageId=3&mainland=1&site=bve","id":95,"favoriteCount":null},{"videoLength":"03:17","clickCount":163,"releaseDate":"2016-10-27 23:01:27","pageInfo":null,"description":"厨访-香港炒牛河\r\n","indexUrl":"http://pichk.daydaycook.com/production/images/20161027/b1bbac23-f128-4e1b-80e6-864d676e5c20","source":"","title":"总有一种食物，见证你我的细水长流","shareCount":null,"videoUrl":"http://pichk.daydaycook.com/production/videos/20161027/b3e8bc14-cb58-46be-832b-d1117183c649","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=94&languageId=3&mainland=1&site=bve","id":94,"favoriteCount":1}],"id":13}]
     */
    public String msg;
    public String code;
    @SerializedName("data")
    public List<Data> mData;

    @Override
    public String toString() {
        return "ShiPinZhuanQu{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", mData=" + mData +
                '}';
    }

    public class Data{

        /**
         * icon_url : http://pic.daydaycook.com/production/images/20161027/60407c06-5c67-4771-8fb2-113382e45e6e
         * videoCount : 7
         * name : 最新
         * videos : [{"videoLength":"02:47","clickCount":594,"releaseDate":"2016-12-02 18:37:31","pageInfo":null,"description":"有料厨房","indexUrl":"http://pic.daydaycook.com/production/images/20161202/b2f2d656-de80-4061-911a-220ab1f54ba6","source":"","title":"文艺青年的快手早餐指南","shareCount":1,"videoUrl":"http://pic.daydaycook.com/production/videos/20161202/0042c1b5-41b3-484b-a44e-f9b434dcd09f","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=139&languageId=3&mainland=1&site=bve","id":139,"favoriteCount":2},{"videoLength":"04:49","clickCount":442,"releaseDate":"2016-11-29 12:45:24","pageInfo":null,"description":"测哪儿","indexUrl":"http://pic.daydaycook.com/production/images/20161129/e1f14721-1c43-4542-9dd2-48df0fe6d785","source":"","title":"烘焙烤箱大测评","shareCount":1,"videoUrl":"http://pic.daydaycook.com/production/videos/20161129/85fd2f69-cc10-466f-87a9-4d35b8910a5b","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=135&languageId=3&mainland=1&site=bve","id":135,"favoriteCount":2},{"videoLength":"04:32","clickCount":650,"releaseDate":"2016-11-28 13:19:09","pageInfo":null,"description":"趣食","indexUrl":"http://pic.daydaycook.com/production/images/20161128/48f7530a-d34b-4945-b722-b1d06c2e17ce","source":"","title":"在家独享的4款中式小食","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161128/dcef1b8d-ad08-4f39-9cfc-d06d1395e450","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=134&languageId=3&mainland=1&site=bve","id":134,"favoriteCount":3},{"videoLength":"03:08","clickCount":566,"releaseDate":"2016-11-24 11:03:32","pageInfo":null,"description":"厨访","indexUrl":"http://pic.daydaycook.com/production/images/20161124/73b30cb0-8355-433b-9dfa-75564ccff83e","source":"","title":"最吸引眼球的盐烤带鱼","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161124/7459be3f-8179-4f54-9c62-dabac7e9f0ac","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=130&languageId=3&mainland=1&site=bve","id":130,"favoriteCount":0},{"videoLength":"04:50","clickCount":532,"releaseDate":"2016-11-23 11:18:07","pageInfo":null,"description":"生活N次方","indexUrl":"http://pic.daydaycook.com/production/images/20161123/ec42fc8c-c4e0-4927-b4f1-badc879de3b9","source":"","title":"Get最装X去果皮技能","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161123/4023baa3-82bf-48c4-9114-a576a3a04f5d","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=129&languageId=3&mainland=1&site=bve","id":129,"favoriteCount":2},{"videoLength":"04:43","clickCount":273,"releaseDate":"2016-11-22 15:12:03","pageInfo":null,"description":"Norma在这里","indexUrl":"http://pic.daydaycook.com/production/images/20161122/81586733-aabe-4b36-84d4-fd4ac3e907c7","source":"","title":"享受阳朔慢生活","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161122/41c6d9e4-06d3-4a2e-b517-edf9b553bf9f","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=128&languageId=3&mainland=1&site=bve","id":128,"favoriteCount":2},{"videoLength":"01:59","clickCount":534,"releaseDate":"2016-11-21 12:57:56","pageInfo":null,"description":"趣食","indexUrl":"http://pic.daydaycook.com/production/images/20161121/6a46555c-286b-4d33-82ad-c60875406da8","source":"","title":"百分百还原小当家料理","shareCount":null,"videoUrl":"http://pic.daydaycook.com/production/videos/20161121/c6059a98-2bc3-45d4-b1d5-0ad06adfb7a4","multipleRateUrl":"http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=124&languageId=3&mainland=1&site=bve","id":124,"favoriteCount":2}]
         * id : 10
         */
        private String icon_url;
        private int videoCount;
        private String name;
        private List<VideosEntity> videos;
        private int id;

        @Override
        public String toString() {
            return "Data{" +
                    "icon_url='" + icon_url + '\'' +
                    ", videoCount=" + videoCount +
                    ", name='" + name + '\'' +
                    ", videos=" + videos +
                    ", id=" + id +
                    '}';
        }

        public void setIcon_url(String icon_url) {
            this.icon_url = icon_url;
        }

        public void setVideoCount(int videoCount) {
            this.videoCount = videoCount;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setVideos(List<VideosEntity> videos) {
            this.videos = videos;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIcon_url() {
            return icon_url;
        }

        public int getVideoCount() {
            return videoCount;
        }

        public String getName() {
            return name;
        }

        public List<VideosEntity> getVideos() {
            return videos;
        }

        public int getId() {
            return id;
        }

        public class VideosEntity {
            @Override
            public String toString() {
                return "VideosEntity{" +
                        "videoLength='" + videoLength + '\'' +
                        ", clickCount=" + clickCount +
                        ", releaseDate='" + releaseDate + '\'' +
                        ", pageInfo='" + pageInfo + '\'' +
                        ", description='" + description + '\'' +
                        ", indexUrl='" + indexUrl + '\'' +
                        ", source='" + source + '\'' +
                        ", title='" + title + '\'' +
                        ", shareCount=" + shareCount +
                        ", videoUrl='" + videoUrl + '\'' +
                        ", multipleRateUrl='" + multipleRateUrl + '\'' +
                        ", id=" + id +
                        ", favoriteCount=" + favoriteCount +
                        '}';
            }

            /**
             * videoLength : 02:47
             * clickCount : 594
             * releaseDate : 2016-12-02 18:37:31
             * pageInfo : null
             * description : 有料厨房
             * indexUrl : http://pic.daydaycook.com/production/images/20161202/b2f2d656-de80-4061-911a-220ab1f54ba6
             * source :
             * title : 文艺青年的快手早餐指南
             * shareCount : 1
             * videoUrl : http://pic.daydaycook.com/production/videos/20161202/0042c1b5-41b3-484b-a44e-f9b434dcd09f
             * multipleRateUrl : http://api.daydaycook.com.cn:80/daydaycook/server/video/catalog/videoDetail.do?videoId=139&languageId=3&mainland=1&site=bve
             * id : 139
             * favoriteCount : 2
             */
            private String videoLength;
            private int clickCount;
            private String releaseDate;
            private String pageInfo;
            private String description;
            private String indexUrl;
            private String source;
            private String title;
            private int shareCount;
            private String videoUrl;
            private String multipleRateUrl;
            private int id;
            private int favoriteCount;

            public void setVideoLength(String videoLength) {
                this.videoLength = videoLength;
            }

            public void setClickCount(int clickCount) {
                this.clickCount = clickCount;
            }

            public void setReleaseDate(String releaseDate) {
                this.releaseDate = releaseDate;
            }

            public void setPageInfo(String pageInfo) {
                this.pageInfo = pageInfo;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public void setIndexUrl(String indexUrl) {
                this.indexUrl = indexUrl;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public void setShareCount(int shareCount) {
                this.shareCount = shareCount;
            }

            public void setVideoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
            }

            public void setMultipleRateUrl(String multipleRateUrl) {
                this.multipleRateUrl = multipleRateUrl;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setFavoriteCount(int favoriteCount) {
                this.favoriteCount = favoriteCount;
            }

            public String getVideoLength() {
                return videoLength;
            }

            public int getClickCount() {
                return clickCount;
            }

            public String getReleaseDate() {
                return releaseDate;
            }

            public String getPageInfo() {
                return pageInfo;
            }

            public String getDescription() {
                return description;
            }

            public String getIndexUrl() {
                return indexUrl;
            }

            public String getSource() {
                return source;
            }

            public String getTitle() {
                return title;
            }

            public int getShareCount() {
                return shareCount;
            }

            public String getVideoUrl() {
                return videoUrl;
            }

            public String getMultipleRateUrl() {
                return multipleRateUrl;
            }

            public int getId() {
                return id;
            }

            public int getFavoriteCount() {
                return favoriteCount;
            }
        }
    }
}
