package com.diskun.model;

import javax.persistence.*;

/**
 * Created by Diskun Tsu (Houkun.Zhu) on 5/14/17.
 */


@Entity
@Table(name = "Src_stuData", schema = "uanli", catalog = "")
public class SrcStuDataEntity {
    private Integer stuId;
    private String name;
    private String gender;
    private String birth;
    private String zzmm;
    private String ethnicity;
    private String address;
    private String academy;
    private String major;
    private String clazz;
    private String id;

    @Id
    @Column(name = "stuId")
    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "birth")
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Basic
    @Column(name = "zzmm")
    public String getZzmm() {
        return zzmm;
    }

    public void setZzmm(String zzmm) {
        this.zzmm = zzmm;
    }

    @Basic
    @Column(name = "ethnicity")
    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "academy")
    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    @Basic
    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "class")
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Basic
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SrcStuDataEntity that = (SrcStuDataEntity) o;

        if (stuId != null ? !stuId.equals(that.stuId) : that.stuId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (birth != null ? !birth.equals(that.birth) : that.birth != null) return false;
        if (zzmm != null ? !zzmm.equals(that.zzmm) : that.zzmm != null) return false;
        if (ethnicity != null ? !ethnicity.equals(that.ethnicity) : that.ethnicity != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (academy != null ? !academy.equals(that.academy) : that.academy != null) return false;
        if (major != null ? !major.equals(that.major) : that.major != null) return false;
        if (clazz != null ? !clazz.equals(that.clazz) : that.clazz != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "SrcStuDataEntity{" +
            "academy='" + academy + '\'' +
            ", stuId=" + stuId +
            ", name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", birth='" + birth + '\'' +
            ", zzmm='" + zzmm + '\'' +
            ", ethnicity='" + ethnicity + '\'' +
            ", address='" + address + '\'' +
            ", major='" + major + '\'' +
            ", clazz='" + clazz + '\'' +
            ", id='" + id + '\'' +
            '}';
    }

    @Override
    public int hashCode() {
        int result = stuId != null ? stuId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        result = 31 * result + (zzmm != null ? zzmm.hashCode() : 0);
        result = 31 * result + (ethnicity != null ? ethnicity.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (academy != null ? academy.hashCode() : 0);
        result = 31 * result + (major != null ? major.hashCode() : 0);
        result = 31 * result + (clazz != null ? clazz.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
