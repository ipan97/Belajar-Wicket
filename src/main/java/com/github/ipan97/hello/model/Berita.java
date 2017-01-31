package com.github.ipan97.hello.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "berita")
public class Berita {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "waktu_publikasi", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date waktuPublikasi;
	@Column(name = "judul", nullable = false)
	private String judul;
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

	public String getJudul() {
		return judul;
	}

	public void setJudul(String judul) {
		this.judul = judul;
	}

	public String getIsi() {
		return isi;
	}

	public void setIsi(String isi) {
		this.isi = isi;
	}

}
