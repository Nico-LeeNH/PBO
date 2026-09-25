import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// relasi 1 Customer -> banyak Order
class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private String phone;
    private List<Order> orders = new ArrayList<>();

    public Customer(int customerId, String customerName, String address, String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public void addCustomer() {
        System.out.println("Customer baru ditambahkan: " + customerName);
    }

    public void editCustomer() {
        System.out.println("Data customer " + customerName + " diperbarui.");
    }

    public void deleteCustomer() {
        System.out.println("Customer " + customerName + " dihapus.");
    }

    // dipanggil oleh Order saat dibuat, menjaga konsistensi relasi dua arah
    void tambahOrder(Order order) {
        orders.add(order);
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

// relasi agregasi: 1 Product -> banyak Stock
class Product {
    private int productId;
    private float productPrice;
    private String productType;
    private List<Stock> stokDiCabang = new ArrayList<>();

    public Product(int productId, float productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public void addProduct() {
        System.out.println("Product baru ditambahkan, id = " + productId);
    }

    public void modifyProduct() {
        System.out.println("Product id=" + productId + " diperbarui.");
    }

    public Product selectProduct(int productId) {
        System.out.println("Mencari product id=" + productId);
        return this;
    }

    void tambahStock(Stock stock) {
        stokDiCabang.add(stock);
    }

    public int getProductId() {
        return productId;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public String getProductType() {
        return productType;
    }
}

// Product mengagregasi Stock
class Stock {
    private int productId;
    private int quantity;
    private int shopNo;

    public Stock(Product product, int quantity, int shopNo) {
        this.productId = product.getProductId();
        this.quantity = quantity;
        this.shopNo = shopNo;
        product.tambahStock(this);
    }

    public void addStock() {
        System.out.println("Stock baru ditambahkan untuk product id = " + productId);
    }

    public void modifyStock(int productId) {
        System.out.println("Stock product id = " + productId + " diperbarui");
    }

    public Stock selectStockItem(int productId) {
        System.out.println("Mencari stock product id = " + productId);
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getShopNo() {
        return shopNo;
    }
}

// hasil many-to-many Order dan Product
class OrderItem {
    private Product product;
    private int quantity;
    private float unitPrice;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = product.getProductPrice();
    }

    public float hitungSubtotal() {
        return unitPrice * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Order {
    private int orderId;
    private Date orderDate;
    private Customer customer;
    // relasi komposisi: 1 Order -> banyak OrderItem
    private List<OrderItem> items = new ArrayList<>();

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.orderDate = new Date();
        this.customer = customer;
        customer.tambahOrder(this);
    }

    public void createOrder() {
        System.out.println("Order #" + orderId + " dibuat untuk " + customer.getCustomerName());
    }

    public void editOrder(int orderId) {
        System.out.println("Order " + orderId + " diperbarui");
    }

    public void tambahItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public float hitungTotal() {
        float total = 0;
        for (OrderItem item : items) {
            total += item.hitungSubtotal();
        }
        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}

public class OrderProcessingSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Adi Suloso", "Jl. Kayutangan No. 10", "08789564322");
        c1.addCustomer();

        Product p1 = new Product(001, 15000, "Makanan");
        Product p2 = new Product(002, 25000, "Minuman");
        p1.addProduct();
        p2.addProduct();

        new Stock(p1, 50, 1);
        new Stock(p1, 30, 2); // produk yang sama, stok di cabang berbeda (agregasi)
        new Stock(p2, 20, 1);

        Order order1 = new Order(1011, c1);
        order1.createOrder();
        order1.tambahItem(p1, 3);
        order1.tambahItem(p2, 3);

        System.out.println("\n=== Ringkasan Order ===");
        System.out.println("Order " + order1.getOrderId() + " milik " + c1.getCustomerName());
        for (OrderItem item : order1.getItems()) {
            System.out.println("- Product id " + item.getProduct().getProductId()
                    + " x" + item.getQuantity()
                    + " = Rp" + item.hitungSubtotal());
        }
        System.out.println("Total: Rp" + order1.hitungTotal());
        System.out.println("Jumlah order: " + c1.getOrders().size());
    }
}