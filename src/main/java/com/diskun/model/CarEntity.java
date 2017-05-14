package com.diskun.model;

import javax.persistence.*;

/**
 * Created by Diskun Tsu (Houkun.Zhu) on 5/13/17.
 */


@Entity
@Table(name = "car", schema = "uanli")
public class CarEntity {
    private Integer id;
    private String brand;
    private Integer speed;
    private Double price;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "speed")
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarEntity carEntity = (CarEntity) o;

        if (id != null ? !id.equals(carEntity.id) : carEntity.id != null) return false;
        if (brand != null ? !brand.equals(carEntity.brand) : carEntity.brand != null) return false;
        if (speed != null ? !speed.equals(carEntity.speed) : carEntity.speed != null) return false;
        if (price != null ? !price.equals(carEntity.price) : carEntity.price != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
            "brand='" + brand + '\'' +
            ", id=" + id +
            ", speed=" + speed +
            ", price=" + price +
            '}';
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (speed != null ? speed.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
