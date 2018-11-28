package me.afibarra.productrestapi.repositories;

import me.afibarra.productrestapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
