package com.dayday.cook.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by fan on 2016/12/1.
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
public class Bannar implements Serializable {

    /**
     * msg : 操作成功
     * code : 200
     * data : [{"area":"156","filemImg":null,"releasePlat":"IPHONE,IPAD,ANDROID","modifyDate":1480563193000,"endDate":1512099185000,"pageInfo":null,"title":"翻滚吧 泡面君","type":"1","content":"null","url":"39575","path":"http://pic.daydaycook.com/production/images/20161201/b1dadea2-466d-4301-aa46-c11346858890","beginDate":1480563185000,"linkType":"00","id":562,"live":null,"createDate":1480563193000},{"area":"156","filemImg":null,"releasePlat":"IPHONE,IPAD,ANDROID","modifyDate":1480471314000,"endDate":1512007229000,"pageInfo":null,"title":"用一碗饭搞定一餐","type":"1","content":"null","url":"39448","path":"http://pic.daydaycook.com/production/images/20161130/395c6c52-9b98-4b5d-8d73-660ee853aa5e","beginDate":1480471229000,"linkType":"00","id":558,"live":null,"createDate":1480471314000},{"area":"156","filemImg":null,"releasePlat":"IPHONE,ANDROID","modifyDate":1480442030000,"endDate":1511977970000,"pageInfo":null,"title":"现代长效不锈钢保温壶","type":"1","content":"null","url":"39561","path":"http://pic.daydaycook.com/production/images/20161130/ec263600-e8ae-48d1-a203-a778dd9e6d3a","beginDate":1480441970000,"linkType":"00","id":557,"live":null,"createDate":1480441976000},{"area":"156","filemImg":null,"releasePlat":"IPHONE,IPAD,ANDROID","modifyDate":1480441809000,"endDate":1511977804000,"pageInfo":null,"title":"小鲜肉的舒食五蔬生活","type":"1","content":"null","url":"39556","path":"http://pic.daydaycook.com/production/images/20161130/641b50a3-14e3-4846-9537-694aa76e454d","beginDate":1480441804000,"linkType":"00","id":556,"live":null,"createDate":1480441809000},{"area":"156","filemImg":null,"releasePlat":"IPHONE,IPAD,ANDROID","modifyDate":1480389369000,"endDate":1511920945000,"pageInfo":null,"title":"就爱水蒸蛋","type":"1","content":"null","url":"39449","path":"http://pic.daydaycook.com/production/images/20161129/68964c69-dac0-4f95-bbcf-fc68060cbb18","beginDate":1480384945000,"linkType":"00","id":555,"live":null,"createDate":1480384953000},{"area":"156","filemImg":null,"releasePlat":"IPHONE,ANDROID","modifyDate":1480375583000,"endDate":1511911580000,"pageInfo":null,"title":"黑胡桃木日系餐具盘","type":"1","content":"null","url":"39543","path":"http://pic.daydaycook.com/production/images/20161129/1ebf3974-c0b3-42b1-965c-7c9f00501a93","beginDate":1480375580000,"linkType":"00","id":553,"live":null,"createDate":1480375583000}]
     */
    private String msg;
    private String code;
    private List<DataEntity> data;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public String getCode() {
        return code;
    }

    public List<DataEntity> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Bannar{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", data=" + data +
                '}';
    }

    public class DataEntity implements Serializable {
        @Override
        public String toString() {
            return "DataEntity{" +
                    "area='" + area + '\'' +
                    ", filemImg='" + filemImg + '\'' +
                    ", releasePlat='" + releasePlat + '\'' +
                    ", modifyDate='" + modifyDate + '\'' +
                    ", endDate='" + endDate + '\'' +
                    ", pageInfo='" + pageInfo + '\'' +
                    ", title='" + title + '\'' +
                    ", type='" + type + '\'' +
                    ", content='" + content + '\'' +
                    ", url='" + url + '\'' +
                    ", path='" + path + '\'' +
                    ", beginDate='" + beginDate + '\'' +
                    ", linkType='" + linkType + '\'' +
                    ", id=" + id +
                    ", live='" + live + '\'' +
                    ", createDate='" + createDate + '\'' +
                    '}';
        }

        /**
         * area : 156
         * filemImg : null
         * releasePlat : IPHONE,IPAD,ANDROID
         * modifyDate : 1480563193000
         * endDate : 1512099185000
         * pageInfo : null
         * title : 翻滚吧 泡面君
         * type : 1
         * content : null
         * url : 39575
         * path : http://pic.daydaycook.com/production/images/20161201/b1dadea2-466d-4301-aa46-c11346858890
         * beginDate : 1480563185000
         * linkType : 00
         * id : 562
         * live : null
         * createDate : 1480563193000
         */
        private String area;
        private String filemImg;
        private String releasePlat;
        private String modifyDate;
        private String endDate;
        private String pageInfo;
        private String title;
        private String type;
        private String content;
        private String url;
        private String path;
        private String beginDate;
        private String linkType;
        private int id;
        private String live;
        private String createDate;

        public void setArea(String area) {
            this.area = area;
        }

        public void setFilemImg(String filemImg) {
            this.filemImg = filemImg;
        }

        public void setReleasePlat(String releasePlat) {
            this.releasePlat = releasePlat;
        }

        public void setModifyDate(String modifyDate) {
            this.modifyDate = modifyDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public void setPageInfo(String pageInfo) {
            this.pageInfo = pageInfo;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public void setBeginDate(String beginDate) {
            this.beginDate = beginDate;
        }

        public void setLinkType(String linkType) {
            this.linkType = linkType;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setLive(String live) {
            this.live = live;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public String getArea() {
            return area;
        }

        public String getFilemImg() {
            return filemImg;
        }

        public String getReleasePlat() {
            return releasePlat;
        }

        public String getModifyDate() {
            return modifyDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public String getPageInfo() {
            return pageInfo;
        }

        public String getTitle() {
            return title;
        }

        public String getType() {
            return type;
        }

        public String getContent() {
            return content;
        }

        public String getUrl() {
            return url;
        }

        public String getPath() {
            return path;
        }

        public String getBeginDate() {
            return beginDate;
        }

        public String getLinkType() {
            return linkType;
        }

        public int getId() {
            return id;
        }

        public String getLive() {
            return live;
        }

        public String getCreateDate() {
            return createDate;
        }
    }
}
