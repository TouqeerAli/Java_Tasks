
public class ClothingProduct extends Product {

	private String size;
	private String material;
	private String color;
	private String style;

	public ClothingProduct() {
		this.size = null;
		this.material = null;
		this.color = null;
		this.style = null;
	}

	public ClothingProduct(String size, String material, String color, String style) {
		super();
		this.size = size;
		this.material = material;
		this.color = color;
		this.style = style;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public void print_info() {
		System.out.println("Size : " + this.size);
		System.out.println("Material : " + this.material);
		System.out.println("Color : " + this.color);
		System.out.println("Style : " + this.style);
	}

}
