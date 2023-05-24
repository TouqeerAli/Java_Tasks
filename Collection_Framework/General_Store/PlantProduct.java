
public class PlantProduct extends Product{
	private String potType;
	private String sunlightNeeds;
	private String typeOfPlant;
	
	
	public PlantProduct() {
		super();
		this.potType = null;
		this.sunlightNeeds = null;
		this.typeOfPlant = null;
	}
	public PlantProduct(String potType, String sunlightNeeds, String typeOfPlant) {
		super();
		this.potType = potType;
		this.sunlightNeeds = sunlightNeeds;
		this.typeOfPlant = typeOfPlant;
	}
	public String getPotType() {
		return potType;
	}
	public void setPotType(String potType) {
		this.potType = potType;
	}
	public String getSunlightNeeds() {
		return sunlightNeeds;
	}
	public void setSunlightNeeds(String sunlightNeeds) {
		this.sunlightNeeds = sunlightNeeds;
	}
	public String getTypeOfPlant() {
		return typeOfPlant;
	}
	public void setTypeOfPlant(String typeOfPlant) {
		this.typeOfPlant = typeOfPlant;
	}
	
	@Override
	public void print_info() {
		System.out.println("Pot Type : "+this.potType);
		System.out.println("Sunlight Needs : "+this.sunlightNeeds);
		System.out.println("Type Of Plant : "+this.typeOfPlant);
	}
}
