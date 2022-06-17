package com.devsuperior.dspesquisa.entities.dto;

import java.io.Serializable;
import java.time.Instant;

public class RecordDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Integer age;
	private Instant moment;

	private GameDTO game;

	public RecordDTO() {
	}

	public RecordDTO(Long id, String name, Integer age, Instant moment, GameDTO game) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.moment = moment;
		this.game = game;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public GameDTO getGameDTO() {
		return game;
	}

	public void setGameDTO(GameDTO game) {
		this.game = game;
	}

}
