/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import model.hocKy;
import repository.hocKyRepo;

/**
 *
 * @author PC
 */
public class hocKyService {
    private hocKyRepo hRepo;
    
    public hocKyService(){
        this.hRepo = new hocKyRepo();
    }
    
    public void insert(hocKy hk){
        this.hRepo.insert(hk);
    }
    
    public void update(int id, hocKy hk){
        this.hRepo.update(id, hk);
    }
    
    public void delete(int id){
        this.hRepo.delete(id);
    }
    
    public ArrayList<hocKy> getList(){
        return this.hRepo.all();
    }
}
