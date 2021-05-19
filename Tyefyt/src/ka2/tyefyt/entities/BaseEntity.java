package ka2.tyefyt.entities;

public abstract class BaseEntity {
private String name;
private String displayName;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDisplayName() {
	return displayName;
}
public void setDisplayName(String displayName) {
	this.displayName = displayName;
}

public String infoString() {
	return this.getDisplayName();
	
	}

}
