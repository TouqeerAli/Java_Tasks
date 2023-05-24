import java.util.List;

public class Product {
	private String name;
	private String brand;
	private Float price;
	private String type;
	private Boolean eco_friendly;
	private ClothingProduct clothing;
	private SkincareProduct skincare;
	private CleaningProduct cleaning;
	private PlantProduct plant;
	private ElectronicProduct electronic;
	
	
	public Product() {
		this.name =null;
		this.brand = null;
		this.price = 0.0f;
		this.type = null;
		this.eco_friendly = false;
	}
	public Product(String name, String brand, Float price, String type, Boolean eco_friendly) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.eco_friendly = eco_friendly;
	}
	
	public Product(String name, String brand, Float price, String type, Boolean eco_friendly,
			ClothingProduct clothing) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.eco_friendly = eco_friendly;
		this.clothing = clothing;
	}
	
	public Product(String name, String brand, Float price, String type, Boolean eco_friendly,
			SkincareProduct skincare) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.eco_friendly = eco_friendly;
		this.skincare = skincare;
	}
	
	public Product(String name, String brand, Float price, String type, Boolean eco_friendly,
			CleaningProduct cleaning) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.eco_friendly = eco_friendly;
		this.cleaning = cleaning;
	}
	
	public Product(String name, String brand, Float price, String type, Boolean eco_friendly, PlantProduct plant) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.eco_friendly = eco_friendly;
		this.plant = plant;
	}
	
	
	public Product(String name, String brand, Float price, String type, Boolean eco_friendly,
			ElectronicProduct electronic) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.eco_friendly = eco_friendly;
		this.electronic = electronic;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getEco_friendly() {
		return eco_friendly;
	}
	public void setEco_friendly(Boolean eco_friendly) {
		this.eco_friendly = eco_friendly;
	}
	
	public ClothingProduct getClothing() {
		return clothing;
	}
	public void setClothing(ClothingProduct clothing) {
		this.clothing = clothing;
	}
	
	public SkincareProduct getSkincare() {
		return skincare;
	}
	public void setSkincare(SkincareProduct skincare) {
		this.skincare = skincare;
	}
	public CleaningProduct getCleaning() {
		return cleaning;
	}
	public void setCleaning(CleaningProduct cleaning) {
		this.cleaning = cleaning;
	}
	public PlantProduct getPlant() {
		return plant;
	}
	public void setPlant(PlantProduct plant) {
		this.plant = plant;
	}
	public ElectronicProduct getElectronic() {
		return electronic;
	}
	public void setElectronic(ElectronicProduct electronic) {
		this.electronic = electronic;
	}
	public void print_info() {
		System.out.println("Name : "+name);
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Type : "+type);
		System.out.println("Eco-friendly : "+eco_friendly);
	}
}
