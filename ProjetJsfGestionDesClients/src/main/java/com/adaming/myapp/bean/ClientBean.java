package com.adaming.myapp.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.logging.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.adaming.myapp.entities.Client;
import com.adaming.myapp.service.IClientService;

//spring
@Component("clientBean")
@ViewScoped
public class ClientBean {

	private Logger LOGGER = Logger.getLogger("ClientBean");

	@Inject
	private IClientService service;
	
	@Inject
	private InfoBean infoBean;
	
	
	
	
    private Client client;
	private String nom;
	private String prenom;
	private int age;
	private List<Client> clients;
	
	
	private int nbr1 =0;
	private int nbr2 =0;
	
	
	public void getNbrNbr1(){
		System.out.println("nbr1 : "+nbr1);
		
	}
	
	public void getNbrNbr2(){
		System.out.println("nbr2 : "+nbr2);
	}
	
	
	
	public void get(){
		setAge(age);
	}
    
	public void getOne(Long id){
		client=service.getOne(id);
		infoBean.afficher();
	}
	
	public String update(){
		service.updateClient(client);
		getAll();
		return "home";
	}
	
	
	public void initFields() {
		nom = "";
		prenom = "";
		age = 0;
	}

	public void add() {
		Client c = new Client(nom, prenom, age);
		service.addClient(c);
        initFields();
        getAll();
	}
	public void getAll(){
		clients = service.getAll();
	}
	@PostConstruct
	public void init2(){
		getAll();
	}
	
	public String forward(){
		return "redirectVsForward";
	}
	
	public String redirect(){
		return "redirectVsForward?faces-redirect=true";
	}

	public ClientBean() {
		System.out.println("<---------new Instence--------->");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
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

	public InfoBean getInfoBean() {
		return infoBean;
	}

	public void setInfoBean(InfoBean infoBean) {
		this.infoBean = infoBean;
	}

}
