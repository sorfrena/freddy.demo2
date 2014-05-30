package org.freddy.spring.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Manager {

	private String field;
	@Value("Freddy")
	private String name;
	private List<Worker> workers = new ArrayList<Worker>();

	public Manager() {
	}

	public Manager(String field) {
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Autowired
	public void addWorker(Worker worker) {
		workers.add(worker);
	}
	
	public Worker getFirstWorker() {
		return workers.get(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
