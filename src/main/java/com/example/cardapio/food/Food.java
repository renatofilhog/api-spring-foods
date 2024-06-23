package com.example.cardapio.food;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Table(name = "foods")
@Entity(name = "foods")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private BigDecimal price;

    public Food(FoodRequestDTO data) {
        this(null, data.title(), data.image(), data.price());
    }
}
