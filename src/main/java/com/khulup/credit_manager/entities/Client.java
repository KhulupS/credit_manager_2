package com.khulup.credit_manager.entities;

import com.khulup.credit_manager.model.dto.ClientDto;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
@Entity
@Table(name = "client")
public class Client implements Serializable {
    @Id
    @Column(name = "credit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private Long numberOfContract;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "credit_id")
    private Credit credit;

    public Client(int id, String firstName, String lastName, Long numberOfContract, Credit credit) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfContract = numberOfContract;
        this.credit = credit;
    }

    public Client() {
    }

    public static Client from(ClientDto clientDto) {
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setFirstName(clientDto.getFirstName());
        client.setLastName(clientDto.getLastName());
        client.setNumberOfContract(clientDto.getNumberOfContract());
        return client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(Long numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }
}
