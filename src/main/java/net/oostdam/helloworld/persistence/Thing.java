package net.oostdam.helloworld.persistence;


import org.springframework.data.annotation.Id;

public class Thing{

    @Id
    private String id;

	String foo, bar;

	protected Thing() {
		this.foo = null;
		this.bar = null;
	}

	public Thing(String foo, String bar){
		this.foo = foo;
		this.bar = bar;
	}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}