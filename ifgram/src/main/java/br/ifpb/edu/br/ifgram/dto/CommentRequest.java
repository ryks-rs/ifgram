package br.ifpb.edu.br.ifgram.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CommentRequest() {
    @NotBlank(message = "O texto do comentário é obrigatório")
    @Size(max = 500, message = "O comentáriodeve ter no máximo 500 caracteres")
    public static String texto;
    @NotNull(message = "O ID do post é obrigatório")
    static Long postId;
    @NotNull(message = "O Id do autor é obrigatório")
    static long autorId;

    public String texto(){
        return texto;
    }
}
