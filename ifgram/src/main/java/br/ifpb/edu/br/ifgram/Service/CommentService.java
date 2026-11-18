package br.ifpb.edu.br.ifgram.Service;

import br.ifpb.edu.br.ifgram.Repository.CommentRepository;
import br.ifpb.edu.br.ifgram.Repository.PostRepository;
import br.ifpb.edu.br.ifgram.Repository.UserRepository;
import br.ifpb.edu.br.ifgram.dto.CommentRequest;
import br.ifpb.edu.br.ifgram.dto.CommentResponse;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public CommentService(CommentRepository commentRepository, PostRepository postRepository, UserRepository userRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    public CommentResponse criar(CommentRequest request) {

        if(request.texto() == null || request.texto().isBlank()) {
            throw new ResponseStatusException(HttpsStatus.BAD_REQUEST, "O comentário não pode estar vazio");
        }

        Post post = postRepository.findById(request.postId())
                .orElseThrow(() -> new ResponseStatusException(HttpsStatus.NOT_FOUND, "Publicação não encontrada"))
}
