package by.ldy.hw5.ex01;

import java.util.ArrayList;
import java.util.List;

public class NewbieKit {
	
	private List<Stationery> newbieKit = new ArrayList<Stationery>();
	
	public NewbieKit() {
		
		newbieKit = new ArrayList<Stationery>(); 
	}

	public List<Stationery> getNewbieKit() {
		return newbieKit;
	}

	public void setNewbieKit(List<Stationery> newbieKit) {
		this.newbieKit = newbieKit;
	}

	public NewbieKit(List<Stationery> newbieKit) {
		super();
		this.newbieKit = newbieKit;
	}
	
	public void add(Stationery obj) {
		
		newbieKit.add(obj);
		
	}
	
	public void showDetails() {
		for(Stationery n : newbieKit) {
			System.out.println(n.getInfo());
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((newbieKit == null) ? 0 : newbieKit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewbieKit other = (NewbieKit) obj;
		if (newbieKit == null) {
			if (other.newbieKit != null)
				return false;
		} else if (!newbieKit.equals(other.newbieKit))
			return false;
		return true;
	}
	
	

}
