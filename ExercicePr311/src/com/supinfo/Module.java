package com.supinfo;

public class Module {
	private int id;
	private String nom;
	private String description;
	private Float volumeHoraire;
	private Double coefficient;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getVolumeHoraire() {
		return volumeHoraire;
	}
	public void setVolumeHoraire(Float volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
	}
	public Double getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(Double coefficient) {
		this.coefficient = coefficient;
	}
	@Override
	public String toString() {
		return "Module [id=" + id + ", nom=" + nom + ", description=" + description + ", volumeHoraire=" + volumeHoraire
				+ ", coefficient=" + coefficient + "]";
	}
	public static void main(String[]args) {
		Module module= new Module();
		module.setId(2)	;
		module.setNom("java");
		module.setDescription("cours tres interessant" );
		module.setVolumeHoraire((float) 320);
		module.setCoefficient((double) 20);
		
	
	}
	

}
