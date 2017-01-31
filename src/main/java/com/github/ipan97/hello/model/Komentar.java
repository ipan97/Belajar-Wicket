package com.github.ipan97.hello.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "komentar")
public class Komentar {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "waktu_publikasi", nullable = false)
	private Date waktuPublikasi;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "nama", nullable = false)
	private String nama;
	@Column(name = "isi", nullable = false)
	private String isi;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getWaktuPublikasi() {
		return waktuPublikasi;
	}

	public void setWaktuPublikasi(Date waktuPublikasi) {
		this.waktuPublikasi = waktuPublikasi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getIsi() {
		return isi;
	}

	public void setIsi(String isi) {
		this.isi = isi;
	}
}
