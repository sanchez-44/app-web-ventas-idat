package pe.edu.idat.appwebventasidat.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;
    @Column(name = "orderdate")
    private Date orderdate;
    @Column(name = "requireddate")
    private Date requireddate;
    @Column(name = "shippeddate")
    private Date shippeddate;
    @Column(name = "shipvia")
    private int shipvia;
    @Column(name = "freight")
    private BigDecimal freight;
    @Column(name = "shipname")
    private String shipname;
    @Column(name = "shipaddress")
    private String shipaddress;
    @Column(name = "shipcity")
    private String shipcity;
    @Column(name = "shipregion")
    private String shipregion;
    @Column(name = "shippostalcode")
    private String shippostalcode;
    @Column(name = "shipcountry")
    private String shipcountry;
    @ManyToOne
    @JoinColumn(name = "customerid")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "employeeid")
    private Employee employee;
}
