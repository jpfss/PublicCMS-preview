package com.publiccms.entities.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.source.annotation.GeneratorColumn;

/**
 * SysDomain generated by hbm2java
 */
@Entity
@Table(name = "sys_domain")
public class SysDomain implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "域名")
    private String name;
    @GeneratorColumn(title = "站点", condition = true)
    private int siteId;
    @GeneratorColumn(title = "路径")
    private String path;

    public SysDomain() {
    }

    public SysDomain(String name, int siteId) {
        this.name = name;
        this.siteId = siteId;
    }

    public SysDomain(String name, int siteId, String path) {
        this.name = name;
        this.siteId = siteId;
        this.path = path;
    }

    @Id
    @Column(name = "name", unique = true, nullable = false)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "path")
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}