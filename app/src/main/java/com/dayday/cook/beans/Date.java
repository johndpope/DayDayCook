package com.dayday.cook.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by fan on 2016/12/7.
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
public class Date {
    /**
     * msg : success
     * code : 200
     * data : {"catalogHot":{"imageClickUrl":"http://pic.daydaycook.com/production/images/20161116/85e4973e-4fa7-4fae-8791-516c85b47999","children":[{"catalogId":163,"imageClickUrl":null,"imageUrl":"http://pic.daydaycook.com/production/images/20161027/1055a041-c00d-4ab7-996b-f986d98997fb","name":"家常菜"},{"catalogId":165,"imageClickUrl":null,"imageUrl":"http://pic.daydaycook.com/production/images/20161027/56fa514f-e172-4c7c-9a5e-a7bfe83d2bbe","name":"快手菜"},{"catalogId":180,"imageClickUrl":null,"imageUrl":"http://pic.daydaycook.com/production/images/20161027/53ab82c2-a590-41aa-8c2b-d96dcaea7763","name":"早餐"},{"catalogId":210,"imageClickUrl":null,"imageUrl":"http://pic.daydaycook.com/production/images/20161027/8a8f5aa1-abd6-4ef2-9387-672bec23c9a8","name":"甜点"},{"catalogId":190,"imageClickUrl":null,"imageUrl":"http://pic.daydaycook.com/production/images/20161027/af81f95d-d39c-4a32-ac61-70e7f0ecd556","name":"肉类"},{"catalogId":192,"imageClickUrl":null,"imageUrl":"http://pic.daydaycook.com/production/images/20161027/7e69b50b-80ce-4704-a12c-87ad5e7fc602","name":"蔬菜"}],"imageUrl":"http://pic.daydaycook.com/production/images/20161116/57fdf614-1a44-4b09-862d-40af3a7f9528","name":"热门"},"catalogShows":[{"catalogId":162,"imageClickUrl":"http://pic.daydaycook.com/production/images/20161116/8c28b9d3-1c76-400a-b96a-60b23d958ab2","rootId":98,"children":[{"catalogId":172,"imageClickUrl":null,"rootId":98,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/24a672cb-c90e-4b8d-bea9-6a86c096524b","name":"创意菜"},{"catalogId":173,"imageClickUrl":null,"rootId":98,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/91fde0a5-2c22-41ad-bed0-bb48a2d46dd2","name":"素食"},{"catalogId":165,"imageClickUrl":null,"rootId":98,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/56fa514f-e172-4c7c-9a5e-a7bfe83d2bbe","name":"快手菜"},{"catalogId":163,"imageClickUrl":null,"rootId":98,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/1055a041-c00d-4ab7-996b-f986d98997fb","name":"家常菜"},{"catalogId":174,"imageClickUrl":null,"rootId":98,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/f0da4ed1-3dd2-4fd5-a834-40f786207cd1","name":"汤水"},{"catalogId":175,"imageClickUrl":null,"rootId":98,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/f7662199-7c93-4e6c-8c79-389a5195c246","name":"冷菜"},{"catalogId":176,"imageClickUrl":null,"rootId":98,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/d928ac47-5e29-45d9-be5a-bafc73cbda24","name":"饮品"},{"catalogId":177,"imageClickUrl":null,"rootId":98,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/7a3efa91-0799-4d25-887e-b4efbd542b5d","name":"中式"}],"imageUrl":"http://pic.daydaycook.com/production/images/20161116/27187800-e35e-425c-8bba-93db65dd0577","name":"菜式"},{"catalogId":179,"imageClickUrl":"http://pic.daydaycook.com/production/images/20161116/6684269c-bd75-407b-83c2-7ca219b5a15c","rootId":100,"children":[{"catalogId":180,"imageClickUrl":null,"rootId":100,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/53ab82c2-a590-41aa-8c2b-d96dcaea7763","name":"早餐"},{"catalogId":181,"imageClickUrl":null,"rootId":100,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/c14ef510-61fe-423a-9490-a4b903c864c6","name":"便当"},{"catalogId":182,"imageClickUrl":null,"rootId":100,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/d346bc4a-6848-41be-928d-47d96ccbc190","name":"午餐"},{"catalogId":183,"imageClickUrl":null,"rootId":100,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/0f4293a7-e5c8-46cf-833f-73d1d1cd36de","name":"下午茶"},{"catalogId":184,"imageClickUrl":null,"rootId":100,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/494683bb-d65c-480c-9fc6-16a72f163f09","name":"晚餐"},{"catalogId":185,"imageClickUrl":null,"rootId":100,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/52eefa66-d37f-4703-938e-bf6e3f4e5fc7","name":"宵夜"},{"catalogId":186,"imageClickUrl":null,"rootId":100,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/9ffac35a-0263-4535-b20e-18cc9648f526","name":"零食"},{"catalogId":187,"imageClickUrl":null,"rootId":100,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/e280973a-46a5-4fcb-b446-208feec7ac74","name":"派对"},{"catalogId":188,"imageClickUrl":null,"rootId":100,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/ed8d31af-6a12-468b-b4cc-5acd809d761d","name":"野餐"}],"imageUrl":"http://pic.daydaycook.com/production/images/20161116/034ea656-aa9c-4203-821c-17f371347aa4","name":"场景"},{"catalogId":189,"imageClickUrl":"http://pic.daydaycook.com/production/images/20161116/0422fc28-e065-495b-bff0-19526a5495c9","rootId":101,"children":[{"catalogId":190,"imageClickUrl":null,"rootId":101,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/af81f95d-d39c-4a32-ac61-70e7f0ecd556","name":"肉类"},{"catalogId":191,"imageClickUrl":null,"rootId":101,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/bd75c417-b28d-443a-b4e6-8d834d3e4c4a","name":"水产"},{"catalogId":192,"imageClickUrl":null,"rootId":101,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/7e69b50b-80ce-4704-a12c-87ad5e7fc602","name":"蔬菜"},{"catalogId":193,"imageClickUrl":null,"rootId":101,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/7eb70e20-5de4-4504-8a59-7198ee6dda13","name":"水果"},{"catalogId":194,"imageClickUrl":null,"rootId":101,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/b36f6ff0-b0b5-40a9-a34f-b778ad74fd9a","name":"豆制品"},{"catalogId":195,"imageClickUrl":null,"rootId":101,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/640b3b60-2fe0-4a7a-bb23-0c193369c0ef","name":"奶制品"}],"imageUrl":"http://pic.daydaycook.com/production/images/20161116/6744511b-dd77-45c3-b997-e1407904b1f6","name":"食材"},{"catalogId":196,"imageClickUrl":"http://pic.daydaycook.com/production/images/20161116/41112ace-c79b-4960-b6d1-37d0238c294b","rootId":102,"children":[{"catalogId":197,"imageClickUrl":null,"rootId":102,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/8d527f17-a1df-4bdd-a07e-0e5a8277bf65","name":"港式"},{"catalogId":198,"imageClickUrl":null,"rootId":102,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/e97e888f-6776-4706-9172-2315d3296bf1","name":"台式"},{"catalogId":199,"imageClickUrl":null,"rootId":102,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/f82dee32-f575-4e71-9435-62e523810c27","name":"川菜"},{"catalogId":200,"imageClickUrl":null,"rootId":102,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/703da302-4e40-48d5-abf3-25b6a9cc8d65","name":"韩式"},{"catalogId":201,"imageClickUrl":null,"rootId":102,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/40a2225d-99b3-4938-840b-e9f5c944faf7","name":"日式"},{"catalogId":202,"imageClickUrl":null,"rootId":102,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/8a165a5f-f5c2-466d-a935-195f9332e66a","name":"泰式"},{"catalogId":203,"imageClickUrl":null,"rootId":102,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/279f4cc8-43bc-4cb7-a304-36256274f881","name":"法式"},{"catalogId":204,"imageClickUrl":null,"rootId":102,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/dd3ab513-236b-48cd-a92f-31072790d64d","name":"美式"},{"catalogId":205,"imageClickUrl":null,"rootId":102,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/15534d96-22db-4938-b6d9-f805a6515199","name":"意式"},{"catalogId":212,"imageClickUrl":null,"rootId":102,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/166c7992-bf39-4895-bb43-4bb996414429","name":"北欧菜"},{"catalogId":213,"imageClickUrl":null,"rootId":102,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/9a2a937b-a2e3-44aa-bf57-a2fd5252b46c","name":"东南亚菜"}],"imageUrl":"http://pic.daydaycook.com/production/images/20161116/dd270b42-c16e-436f-ba23-ef372913367c","name":"菜系"},{"catalogId":206,"imageClickUrl":"http://pic.daydaycook.com/production/images/20161116/f718938e-99b8-4215-be3e-842cd93a0ae3","rootId":103,"children":[{"catalogId":208,"imageClickUrl":null,"rootId":103,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/7d7c1fd5-00ac-489b-b93f-629f8b871a67","name":"面包"},{"catalogId":209,"imageClickUrl":null,"rootId":103,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/5ac40b3d-c5dc-48e5-ad09-2f40f8e175be","name":"饼干"},{"catalogId":210,"imageClickUrl":null,"rootId":103,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/8a8f5aa1-abd6-4ef2-9387-672bec23c9a8","name":"甜点"},{"catalogId":211,"imageClickUrl":null,"rootId":103,"children":[],"imageUrl":"http://pic.daydaycook.com/production/images/20161027/d5e02797-1ce3-4ed0-8206-4221e1424919","name":"披萨"}],"imageUrl":"http://pic.daydaycook.com/production/images/20161116/b8170cd6-b0b5-4b1f-9dd9-33f93817f98b","name":"烘焙"}]}
     */
    public String msg;
    public String code;
    @SerializedName("data")
    public Data mData;
    public class Data{
        @SerializedName("catalogHot")
        public CatalogHot mCatalogHot;
        @SerializedName("catalogShows")
        public List<CatalogShow> mCatalogShows;

        @Override
        public String toString() {
            return "Data{" +
                    "mCatalogHot=" + mCatalogHot +
                    ", mCatalogShows=" + mCatalogShows +
                    '}';
        }
    }
    @Override
    public String toString() {
        return "Date{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", mData=" + mData +
                '}';
    }
    public class  CatalogHot{
        public String imageClickUrl;
        public String imageUrl;
        public List<Children> children;
        public String name;

        @Override
        public String toString() {
            return "CatalogHot{" +
                    "imageClickUrl='" + imageClickUrl + '\'' +
                    ", imageUrl='" + imageUrl + '\'' +
                    ", children=" + children +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public class Children{

        /**
         * catalogId : 163
         * imageClickUrl : null
         * imageUrl : http://pic.daydaycook.com/production/images/20161027/1055a041-c00d-4ab7-996b-f986d98997fb
         * name : 家常菜
         */
        public int catalogId;
        public String imageClickUrl;
        public String imageUrl;
        public String name;

        @Override
        public String toString() {
            return "Children{" +
                    "catalogId=" + catalogId +
                    ", imageClickUrl='" + imageClickUrl + '\'' +
                    ", imageUrl='" + imageUrl + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public class CatalogShow{
        public int catalogId;
        public String rootId;
        @SerializedName("children")
        public List<Children> mChildrens;
        public String imageClickUrl;
        public String imageUrl;
        public String name;

        @Override
        public String toString() {
            return "CatalogShow{" +
                    "catalogId=" + catalogId +
                    ", rootId='" + rootId + '\'' +
                    ", mChildrens=" + mChildrens +
                    ", imageClickUrl='" + imageClickUrl + '\'' +
                    ", imageUrl='" + imageUrl + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
