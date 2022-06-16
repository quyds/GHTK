package ghtk.com.students.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_infomation")
public class Students {
	
	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	@Column(name = "id") // column name
	private Integer id;
	
	@Column(name = "school", length = 100, nullable = false)
	private String school;

	@Column(name = "district", length = 100, nullable = false)
	private String district;

	@Column(name = "student_code", length = 100, nullable = false)
	private String studenCode;
	
	@Column(name = "class", length = 100, nullable = false)
	private String classSchool;
	
	@Column(name = "name", length = 100, nullable = false)
	private String name;
	
	@Column(name = "ngaysinh", length = 100, nullable = false)
	private String ngaySinh;
	
	@Column(name = "gioitinh", length = 100, nullable = false)
	private String gioiTinh;
	
	@Column(name = "noisinh", length = 100, nullable = false)
	private String noiSinh;
	
	@Column(name = "dantoc", length = 100, nullable = false)
	private String danToc;
	
	@Column(name = "city", length = 100, nullable = false)
	private String city;
	
	@Column(name = "phone", length = 100, nullable = false)
	private String phone;
	
	@Column(name = "diemlop1", length = 100, nullable = false)
	private String diemLop1;
	
	@Column(name = "diemlop2", length = 100, nullable = false)
	private String diemLop2;
	
	@Column(name = "diemlop3", length = 100, nullable = false)
	private String diemLop3;
	
	@Column(name = "diemlop4", length = 100, nullable = false)
	private String diemLop4;
	
	@Column(name = "diemlop5", length = 100, nullable = false)
	private String diemLop5;
	
	@Column(name = "tongdiem5", length = 100, nullable = false)
	private String tongDiem5;
	
	@Column(name = "diemuutien", length = 100, nullable = false)
	private String diemUuTien;
	
	@Column(name = "tongdiemsotuyen", length = 100, nullable = false)
	private String tongDiemSoTuyen;
	
	@Column(name = "note", length = 100, nullable = false)
	private String note;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStudenCode() {
		return studenCode;
	}

	public void setStudenCode(String studenCode) {
		this.studenCode = studenCode;
	}

	public String getClassSchool() {
		return classSchool;
	}

	public void setClassSchool(String classSchool) {
		this.classSchool = classSchool;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public String getDanToc() {
		return danToc;
	}

	public void setDanToc(String danToc) {
		this.danToc = danToc;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDiemLop1() {
		return diemLop1;
	}

	public void setDiemLop1(String diemLop1) {
		this.diemLop1 = diemLop1;
	}

	public String getDiemLop2() {
		return diemLop2;
	}

	public void setDiemLop2(String diemLop2) {
		this.diemLop2 = diemLop2;
	}

	public String getDiemLop3() {
		return diemLop3;
	}

	public void setDiemLop3(String diemLop3) {
		this.diemLop3 = diemLop3;
	}

	public String getDiemLop4() {
		return diemLop4;
	}

	public void setDiemLop4(String diemLop4) {
		this.diemLop4 = diemLop4;
	}

	public String getDiemLop5() {
		return diemLop5;
	}

	public void setDiemLop5(String diemLop5) {
		this.diemLop5 = diemLop5;
	}

	public String getTongDiem5() {
		return tongDiem5;
	}

	public void setTongDiem5(String tongDiem5) {
		this.tongDiem5 = tongDiem5;
	}

	public String getDiemUuTien() {
		return diemUuTien;
	}

	public void setDiemUuTien(String diemUuTien) {
		this.diemUuTien = diemUuTien;
	}

	public String getTongDiemSoTuyen() {
		return tongDiemSoTuyen;
	}

	public void setTongDiemSoTuyen(String tongDiemSoTuyen) {
		this.tongDiemSoTuyen = tongDiemSoTuyen;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}
