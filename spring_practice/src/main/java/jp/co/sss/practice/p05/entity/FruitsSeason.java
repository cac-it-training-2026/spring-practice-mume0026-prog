package jp.co.sss.practice.p05.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruits_season")
public class FruitsSeason {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fruit")
	@SequenceGenerator(name = "seq_fruit", sequenceName = "seq_fruit_season", allocationSize = 1)
	private Integer fruitId;

	private String fruitName;
	private Integer seasonMonth;

	public Integer getFruitId() {
		return fruitId;
	}

	public void setFruitId(Integer fruitId) {
		this.fruitId = fruitId;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public Integer getSeasonMonth() {
		return seasonMonth;
	}

	public void setSeasonMonth(Integer seasonMonth) {
		this.seasonMonth = seasonMonth;
	}

}
