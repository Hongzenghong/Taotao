package com.example.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Emp {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;

	private String chName;

	private String porName;// 葡语

	private Integer sex;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;

	private String speciality;// 特长

	private String category;// 范畴

	@JoinColumn(name = "position_id")
	@ManyToOne
	private Position position;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName = chName;
	}

	public String getPorName() {
		return porName;
	}

	public void setPorName(String porName) {
		this.porName = porName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", chName=" + chName + ", porName=" + porName + ", sex=" + sex + ", birthday="
				+ birthday + ", speciality=" + speciality + ", category=" + category + ", position=" + position + "]";
	}

	public Emp(Integer id, String chName, String porName, Integer sex, Date birthday, String speciality,
			String category, Position position) {
		super();
		this.id = id;
		this.chName = chName;
		this.porName = porName;
		this.sex = sex;
		this.birthday = birthday;
		this.speciality = speciality;
		this.category = category;
		this.position = position;
	}

	public Emp() {
	
	}

}
