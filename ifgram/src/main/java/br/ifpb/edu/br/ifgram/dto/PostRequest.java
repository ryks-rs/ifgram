package br.ifpb.edu.br.ifgram.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record PostRequest() {
    @NotBlank(message = "A URL da imagem é obrigatório")
    static String imagemUrl;
    @Size(max =300, message = "A legenda deve ter no máximo 300 caracteres")
    static String legenda;
    @NotNull(message = "O Id do autor é obrigatório")
    static Long autorId;

}
