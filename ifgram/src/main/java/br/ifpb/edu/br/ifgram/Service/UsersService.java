package br.ifpb.edu.br.ifgram.Service;

import br.ifpb.edu.br.ifgram.dto.UserRequest;
import br.ifpb.edu.br.ifgram.dto.UserResponse;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersService {

    private final UserRepository repository;

    public UsersService(UserRepository repository) {
        this.repository = repository;
    }
    @Transactional
    public UserResponse criar(UserRequest request) {
        if (repository.existsByEmail)(request.email())) {
            throw new EmailDuplicadoException(request.email());
        }
        User salvo = repository.save(new User(request.nome(), request.email()));
        return UserResponse.from(salvo);
    }

}
