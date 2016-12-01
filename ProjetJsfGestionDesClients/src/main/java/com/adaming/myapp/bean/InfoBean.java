package com.adaming.myapp.bean;

import javax.faces.bean.NoneScoped;
import javax.faces.bean.ViewScoped;

import org.springframework.stereotype.Component;

@Component("infoBean")
@ViewScoped
public class InfoBean {

	private int age = 15;
	
	private int nbr1;
	private int nbr2;
	private int resultMulti;
	private int resultAdd;
	
	public void multi(){
		setResultMulti(nbr1*nbr2);
		System.out.println(resultMulti);
	}
    public void add(){
		setResultAdd(nbr1+nbr2);
		System.out.println(resultAdd);
	}
    
    
	
	
	
	
	
	public int getNbr1() {
		return nbr1;
	}
	public void setNbr1(int nbr1) {
		this.nbr1 = nbr1;
	}
	public int getNbr2() {
		return nbr2;
	}
	public void setNbr2(int nbr2) {
		this.nbr2 = nbr2;
	}
	public int getResultMulti() {
		return resultMulti;
	}
	public void setResultMulti(int resultMulti) {
		this.resultMulti = resultMulti;
	}
	public int getResultAdd() {
		return resultAdd;
	}
	public void setResultAdd(int resultAdd) {
		this.resultAdd = resultAdd;
	}
	public void afficher(){
		System.out.println(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
