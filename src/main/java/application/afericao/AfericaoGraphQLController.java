package application.afericao;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

@Controller
public class AfericaoGraphQLController {

    @Autowired
    private AfericaoService afericaoService;

    @QueryMapping
    public Iterable<AfericaoDTO> afericoes() {
        return afericaoService.getAll();
    }

    @QueryMapping
    public AfericaoDTO afericao(@Argument long id) {
        return afericaoService.getOne(id);
    }

    @MutationMapping
    public AfericaoDTO criarAfericao(@Argument AfericaoInsertDTO dados) {
        return afericaoService.insert(dados);
    }

    @MutationMapping
    public AfericaoDTO alterarAfericao(
        @Argument long id, 
        @Argument AfericaoInsertDTO dados
    ) {
        return afericaoService.update(id, dados);
    }
}
