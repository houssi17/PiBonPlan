/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IService<T> {
     public void ajouter(T t);
     public void supprimer(int id);
     public void modifier(int id,T t);
     public List<T> selectAll();
}
