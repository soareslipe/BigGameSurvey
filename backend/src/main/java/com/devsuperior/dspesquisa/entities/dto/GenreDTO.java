package com.devsuperior.dspesquisa.entities.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class GenreDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;


	List<GameDTO> games = new ArrayList<>();

	public GenreDTO() {
	}

	public GenreDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<GameDTO> getGames() {
		return games;
	}

}
