package lesson39;

import java.util.List;

public class Response{
	private int total;
	private int limit;
	private int skip;
	private List<ProductsItem> products;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setLimit(int limit){
		this.limit = limit;
	}

	public int getLimit(){
		return limit;
	}

	public void setSkip(int skip){
		this.skip = skip;
	}

	public int getSkip(){
		return skip;
	}

	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	public List<ProductsItem> getProducts(){
		return products;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"total = '" + total + '\'' + 
			",limit = '" + limit + '\'' + 
			",skip = '" + skip + '\'' + 
			",products = '" + products + '\'' + 
			"}";
		}
}