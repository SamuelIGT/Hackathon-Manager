package br.ufc.quixada.hackthonGreenMile.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.ufc.quixada.hackthonGreenMile.model.Team;

public interface TeamService {
	public ResponseEntity<Team> create (Team team);
	public ResponseEntity<Boolean> delete (Team team);
	public ResponseEntity<Team> get (Long id);
	public ResponseEntity<Team> update (Team team);
	public ResponseEntity<List<Team>> getAll ();
}
