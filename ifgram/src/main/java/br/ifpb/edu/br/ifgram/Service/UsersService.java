package br.ifpb.edu.br.ifgram.Service;

import br.ifpb.edu.br.ifgram.Model.User;
import br.ifpb.edu.br.ifgram.Repository.UserRepository;
import br.ifpb.edu.br.ifgram.dto.UserRequest;
import br.ifpb.edu.br.ifgram.dto.UserResponse;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersService {

    private final UserRepository repository;

    public UsersService(UserRepository repository) {
        this.repository = repository;
    }
    @Transactional
    public UserResponse criar(UserRequest request) throws Exception {
        if (repository.existsByEmail(request.email()))  {
            throw new Exception();
        }
        User salvo = repository.save(new User(request.nome(), request.email()));
        return UserResponse.from(salvo);
    }

}

