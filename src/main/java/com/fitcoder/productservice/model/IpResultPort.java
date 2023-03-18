package com.fitcoder.productservice.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ipresultport")
@Data
public class IpResultPort {

        @Id
        private Long id;

        @Column(name = "ip_id")
        private Long ipId;

        private Integer port;

        private String protocol;

        @Column(name = "port_stat")
        private String portStat;


    }

