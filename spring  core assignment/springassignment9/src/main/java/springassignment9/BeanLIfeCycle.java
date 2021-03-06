package springassignment9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLIfeCycle implements InitializingBean,DisposableBean{
	private String Name;
	private int Id;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public void display() {
		System.out.println("name : " +getName()+"\nId"+getId());
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean Disposed");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initizaling Bean");
	}
	
}

