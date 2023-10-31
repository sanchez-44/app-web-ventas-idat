package pe.edu.idat.appwebventasidat.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Data
@Entity
@Table(name = "orderdetails")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "unitprice")
    private BigDecimal unitprice;
    @Column(name = "quantity")
    private Short quantity;
    @Column(name = "discount")
    private Double discount;
    @ManyToOne
    @JoinColumn(name = "orderid")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "productid")
    private Product product;
}
