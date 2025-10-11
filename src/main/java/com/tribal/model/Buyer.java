package com.tribal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "buyers")
@PrimaryKeyJoinColumn(name = "user_id")
public class Buyer extends Base {

    // Relationships
    @OneToMany(mappedBy = "buyer", cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToMany(mappedBy = "buyer", cascade = CascadeType.ALL)
    private List<Cart> cartItems;

}

