package com.example.raghu_gowda.version_2.module;


import java.util.List;

public class EventResponse {
    /**
     * name : Arts & Culture
     * sort_name : Arts & Culture
     * id : 1
     * shortname : Arts
     */

    private List<ResultsBean> results;

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        private String name;
        private String sort_name;
        private int id;
        private String shortname;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSort_name() {
            return sort_name;
        }

        public void setSort_name(String sort_name) {
            this.sort_name = sort_name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getShortname() {
            return shortname;
        }

        public void setShortname(String shortname) {
            this.shortname = shortname;
        }
    }
//    private MetaBean meta;
//    /**
//     * name : Arts & Culture
//     * sort_name : Arts & Culture
//     * id : 1
//     * shortname : Arts
//     */
//
//    private List<ResultsBean> results;
//
//    public MetaBean getMeta() {
//        return meta;
//    }
//
//    public void setMeta(MetaBean meta) {
//        this.meta = meta;
//    }
//
//    public List<ResultsBean> getResults() {
//        return results;
//    }
//
//    public void setResults(List<ResultsBean> results) {
//        this.results = results;
//    }
//
//    public static class MetaBean {
//        private String next;
//        private String method;
//        private int total_count;
//        private String link;
//        private int count;
//        private String description;
//        private String lon;
//        private String title;
//        private String url;
//        private String signed_url;
//        private String id;
//        private long updated;
//        private String lat;
//
//        public String getNext() {
//            return next;
//        }
//
//        public void setNext(String next) {
//            this.next = next;
//        }
//
//        public String getMethod() {
//            return method;
//        }
//
//        public void setMethod(String method) {
//            this.method = method;
//        }
//
//        public int getTotal_count() {
//            return total_count;
//        }
//
//        public void setTotal_count(int total_count) {
//            this.total_count = total_count;
//        }
//
//        public String getLink() {
//            return link;
//        }
//
//        public void setLink(String link) {
//            this.link = link;
//        }
//
//        public int getCount() {
//            return count;
//        }
//
//        public void setCount(int count) {
//            this.count = count;
//        }
//
//        public String getDescription() {
//            return description;
//        }
//
//        public void setDescription(String description) {
//            this.description = description;
//        }
//
//        public String getLon() {
//            return lon;
//        }
//
//        public void setLon(String lon) {
//            this.lon = lon;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//        public String getUrl() {
//            return url;
//        }
//
//        public void setUrl(String url) {
//            this.url = url;
//        }
//
//        public String getSigned_url() {
//            return signed_url;
//        }
//
//        public void setSigned_url(String signed_url) {
//            this.signed_url = signed_url;
//        }
//
//        public String getId() {
//            return id;
//        }
//
//        public void setId(String id) {
//            this.id = id;
//        }
//
//        public long getUpdated() {
//            return updated;
//        }
//
//        public void setUpdated(long updated) {
//            this.updated = updated;
//        }
//
//        public String getLat() {
//            return lat;
//        }
//
//        public void setLat(String lat) {
//            this.lat = lat;
//        }
//    }
//
//    public static class ResultsBean {
//        private String name;
//        private String sort_name;
//        private int id;
//        private String shortname;
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getSort_name() {
//            return sort_name;
//        }
//
//        public void setSort_name(String sort_name) {
//            this.sort_name = sort_name;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getShortname() {
//            return shortname;
//        }
//
//        public void setShortname(String shortname) {
//            this.shortname = shortname;
//        }
//    }


}
