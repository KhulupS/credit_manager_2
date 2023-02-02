package com.khulup.credit_manager.model.dto;

import com.khulup.credit_manager.entities.Client;
import lombok.Data;

@Data
public class ClientDto {
    private int id;
    private String firstName;
    private String lastName;
    private Long numberOfContract;

    public static ClientDto from(Client client){
        ClientDto clientDto = new ClientDto();
        clientDto.setId(client.getId());
        clientDto.setFirstName(client.getFirstName());
        clientDto.setLastName(client.getLastName());
        clientDto.setNumberOfContract(client.getNumberOfContract());
        return clientDto;
    }
}
