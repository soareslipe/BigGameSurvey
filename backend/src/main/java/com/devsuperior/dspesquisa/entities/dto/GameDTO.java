package com.devsuperior.dspesquisa.entities.dto;

import java.io.Serializable;

import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.enums.Platform;

public class GameDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String title;
	private Platform platform;

	public GameDTO() {
	}

	public GameDTO(Long id, String title, Platform platform) {
		this.id = id;
		this.title = title;
		this.platform = platform;

	}

	public GameDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		platform = entity.getPlataform();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlataform() {
		return platform;
	}

	public void setPlataform(Platform platform) {
		this.platform = platform;
	}

}
