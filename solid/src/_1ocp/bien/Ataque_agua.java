/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;

/**
 *
 * @author CltControl
 */
public class Ataque_agua implements Ataque{

    @Override
    public void atacar(Pokemon pokemon) {
        pokemon.setPorcentajeVida(pokemon.getPorcentajeVida()*0.70);
    }
    
}
