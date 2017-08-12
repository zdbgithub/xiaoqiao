package com.qiaoben.xiaoqiao_manager.bean;

public class BaseInfo {
    private Integer id;

    private String name;

    private String age;

    private String job;

    private String kungfu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getKungfu() {
        return kungfu;
    }

    public void setKungfu(String kungfu) {
        this.kungfu = kungfu == null ? null : kungfu.trim();
    }
}