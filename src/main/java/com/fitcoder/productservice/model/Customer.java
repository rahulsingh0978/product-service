package com.fitcoder.productservice.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
@Data
public class Customer {

    @Id
    private Long id;

    @Column(name = "site_id")
    private Long siteId;

    private String ip;

}