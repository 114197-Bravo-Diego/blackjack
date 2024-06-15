package ar.edu.utn.frc.tup.lc.iii.services;

import org.springframework.stereotype.Service;

@Service
public interface RoundService {

    void forceEndOfRound(Long id);
    Round getRoundById(Long id);
}
