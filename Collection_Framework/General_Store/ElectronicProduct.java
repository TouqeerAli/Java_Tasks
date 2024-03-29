
public class ElectronicProduct extends Product{
	private String powerSource;
	private Boolean energyEfficient;
	private Boolean smartHomeCompatible;
	
	
	public ElectronicProduct() {
		super();
		this.powerSource = null;
		this.energyEfficient = false;
		this.smartHomeCompatible = false;
	}
	public ElectronicProduct(String powerSource, Boolean energyEfficient, Boolean smartHomeCompatible,
			String name, String brand, Float price, String type, Boolean eco_friendly) {
		super(name,  brand,  price,  type,  eco_friendly);
		this.powerSource = powerSource;
		this.energyEfficient = energyEfficient;
		this.smartHomeCompatible = smartHomeCompatible;
	}
	public String getPowerSource() {
		return powerSource;
	}
	public void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}
	public Boolean getEnergyEfficient() {
		return energyEfficient;
	}
	public void setEnergyEfficient(Boolean energyEfficient) {
		this.energyEfficient = energyEfficient;
	}
	public Boolean getSmartHomeCompatible() {
		return smartHomeCompatible;
	}
	public void setSmartHomeCompatible(Boolean smartHomeCompatible) {
		this.smartHomeCompatible = smartHomeCompatible;
	}
	
	@Override
	public void print_info() {
		System.out.println("Name : "+super.getName());
		System.out.println("Brand : "+super.getBrand());
		System.out.println("Price : "+super.getPrice());
		System.out.println("Type : "+super.getType());
		System.out.println("Eco-friendly : "+super.getEco_friendly());
		System.out.println("Power Source : "+this.powerSource);
		System.out.println("Energy Efficient : "+this.energyEfficient);
		System.out.println("Smart Home Compatible : "+this.smartHomeCompatible);
	}
}
