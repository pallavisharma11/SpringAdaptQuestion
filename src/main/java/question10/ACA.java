package question10;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ACA implements ApplicationContextAware {
	
	private List<Integer> list;
	ApplicationContext applicationContext;

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}
	
	

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}

	public void print() {
		// TODO Auto-generated method stub
		
		for(int l :list)
		System.out.println(l);
		
	}

}
