package com.khulup.credit_manager.entities;

import com.khulup.credit_manager.model.dto.ClientDto;
import com.khulup.credit_manager.model.dto.CreditDto;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
@Entity
@Table(name = "credit")
public class Credit implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String creditName;
    @Column
    private Long creditValue;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "credit")
    private Client client;

    public Credit (int id, String creditName, Long creditValue, Client client) {
        this.id = id;
        this.creditName = creditName;
        this.creditValue = creditValue;
        this.client = client;
    }

    public Credit() {
    }

    public static Credit from(CreditDto creditDto) {
        Credit credit = new Credit();
        credit.setCreditName(creditDto.getCreditName());
        credit.setCreditValue(creditDto.getCreditValue());
        return credit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public Long getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(Long creditValue) {
        this.creditValue = creditValue;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
