package br.ifpb.edu.br.ifgram.dto;

import org.apache.catalina.User;

public record UserResponse(Long id, String nome, String email) {
    public static UserResponse from(User user){
        return new UserResponse(user.getId(),user.getNome(),user.getEmail());
    }

}
