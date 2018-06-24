package br.com.unirriter.bobsin.pdaaalert.service;

import br.com.unirriter.bobsin.pdaaalert.domain.Team;
import br.com.unirriter.bobsin.pdaaalert.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public void create(Team team) {
        teamRepository.save(team);
    }

    public List<Team> listAll() {
        return teamRepository.findAll();
    }

    public Team findByName(String name) {
        return teamRepository.findByName(name);
    }

    public void delete(Long id) {
        teamRepository.deleteById(id);
    }

}