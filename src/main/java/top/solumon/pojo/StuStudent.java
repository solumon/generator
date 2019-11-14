package top.solumon.pojo;

import java.io.Serializable;
import java.util.Date;

public class StuStudent implements Serializable {
    private String id;

    private String stuNumber;

    private String name;

    private String sex;

    private Date enterdate;

    private String school;

    private String college;

    private String specialty;

    private String cls;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber == null ? null : stuNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls == null ? null : cls.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stuNumber=").append(stuNumber);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", enterdate=").append(enterdate);
        sb.append(", school=").append(school);
        sb.append(", college=").append(college);
        sb.append(", specialty=").append(specialty);
        sb.append(", cls=").append(cls);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}