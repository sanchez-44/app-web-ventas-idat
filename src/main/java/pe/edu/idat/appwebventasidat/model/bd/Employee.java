package pe.edu.idat.appwebventasidat.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeesid;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "title")
    private String title;
    @Column(name = "titleofcourtesy")
    private String titleofcourtesy;
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "hiredate")
    private Date hiredate;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "region")
    private String region;
    @Column(name = "postalcode")
    private String postalcode;
    @Column(name = "country")
    private String country;
    @Column(name = "homephone")
    private String homephone;
    @Column(name = "extension")
    private String extension;
    @Column(name = "notes")
    private String notes;
    @Column(name = "reportsto")
    private int reportsto;
    @Column(name = "photopath")
    private String photopath;
    @Column(name = "salary")
    private  float salary;

}
