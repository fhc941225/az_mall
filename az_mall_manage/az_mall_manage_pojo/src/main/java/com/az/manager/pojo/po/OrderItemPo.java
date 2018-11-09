package com.az.manager.pojo.po;

public class OrderItemPo {
    private int id;
    private int user_id;
    private int order_no;
    private int product_id;
    private String product_name;
    private String product_image;
    private double current_unit_price;
    private int quantity;
    private int total_price;
    private String create_time;
    private String update_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getOrder_no() {
        return order_no;
    }

    public void setOrder_no(int order_no) {
        this.order_no = order_no;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public double getCurrent_unit_price() {
        return current_unit_price;
    }

    public void setCurrent_unit_price(double current_unit_price) {
        this.current_unit_price = current_unit_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "OrderItemPo{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", order_no=" + order_no +
                ", product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_image='" + product_image + '\'' +
                ", current_unit_price=" + current_unit_price +
                ", quantity=" + quantity +
                ", total_price=" + total_price +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
