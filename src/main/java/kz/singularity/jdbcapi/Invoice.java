package kz.singularity.jdbcapi;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "invoice")
public class Invoice {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "invoice_id")
    private @Id Long invoiceId;
    @Column(name = "invoice_date")
    private Date invoiceDate;
}
