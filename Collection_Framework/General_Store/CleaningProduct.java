
public class CleaningProduct extends Product{
	private String surfaceType; 
	private String scent;
	private Boolean biodegradable;
	
	public CleaningProduct() {
		super();
		this.surfaceType = null;
		this.scent = null;
		this.biodegradable = false;
	}
	public CleaningProduct(String surfaceType, String scent, Boolean biodegradable) {
		super();
		this.surfaceType = surfaceType;
		this.scent = scent;
		this.biodegradable = biodegradable;
	}
	public String getSurfaceType() {
		return surfaceType;
	}
	public void setSurfaceType(String surfaceType) {
		this.surfaceType = surfaceType;
	}
	public String getScent() {
		return scent;
	}
	public void setScent(String scent) {
		this.scent = scent;
	}
	public Boolean getBiodegradable() {
		return biodegradable;
	}
	public void setBiodegradable(Boolean biodegradable) {
		this.biodegradable = biodegradable;
	}
	
	@Override
	public void print_info() {
		System.out.println("Surface Type : "+this.surfaceType);
		System.out.println("Scent : "+this.scent);
		System.out.println("Biodegradable : "+this.biodegradable);
	}
}
