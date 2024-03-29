package org.univ.dangol.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;

@Entity
@Table
@SuperBuilder(toBuilder = true)
@Jacksonized
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Shop {

    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Market market;

    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String category;

    @Column(length = 80)
    private String tag;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String image;

    @Column(precision = 20, scale = 16)
    private BigDecimal latitude;

    @Column(precision = 20, scale = 16)
    private BigDecimal longitude;

    @Column(length = 80)
    private String address;
}
