package com.privalia.model;

import java.util.UUID;

public class PrivaliaObject {

	public UUID uuid;
	
	public PrivaliaObject() {
		uuid = UUID.randomUUID();
	}
	
	public PrivaliaObject(UUID uuid) {
		this.uuid = uuid;
	}
	
	public UUID getUUID() {
		return uuid;
	}
	
}
