package com.example.PSP3.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.PSP3.model.Vartotojas;



@Repository
public class VartotojasRepository {
	private static List<Vartotojas> vartotojai = new ArrayList<>();

    static {
    	vartotojai.add(new Vartotojas(1, "Jonas", null, null, null, null, null));
    	vartotojai.add(new Vartotojas(2, "Petras", null, null, null, null, null));
    }
    
    public List<Vartotojas> findAll() {
    	return vartotojai;
    }
    
    public Vartotojas findById(int id) {
        Iterator<Vartotojas> iterator = vartotojai.iterator();
        while (iterator.hasNext()) {
        	Vartotojas z = iterator.next();
            if (z.getId() == id) {
                return z;
            }
        }
        return null;
    }
    
    public void update (Vartotojas zm) {
    	if(zm == null) return;
    	
        for (int i=0; i < vartotojai.size(); i++) {
            if (vartotojai.get(i).getId() == zm.getId()) {
            	vartotojai.set(i, zm);
            }
        }
    }
    
    public Vartotojas add(Vartotojas v) {
        vartotojai.add(v);
        return v;
    }
    
    public void deleteById(int id) {
        Iterator<Vartotojas> iterator = vartotojai.iterator();
        while (iterator.hasNext()) {
        	Vartotojas p = iterator.next();
            if (p.getId() == id) {
                iterator.remove();
            }
        }
    }
    
    public void delete(Vartotojas v) {
    	deleteById(v.getId());
    }
    
}

