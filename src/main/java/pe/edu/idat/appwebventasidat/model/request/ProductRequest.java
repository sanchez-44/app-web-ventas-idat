package pe.edu.idat.appwebventasidat.model.request;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ProductRequest {
    private Integer productid;
    private String productname;
    private Double unitprice;
    private Boolean discontinued;
    private Integer supplierid;
    private Integer categoryid;

}
