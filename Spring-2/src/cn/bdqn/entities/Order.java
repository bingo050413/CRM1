package cn.bdqn.entities;

public class Order {
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Order(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + "]";
	}
	
}
