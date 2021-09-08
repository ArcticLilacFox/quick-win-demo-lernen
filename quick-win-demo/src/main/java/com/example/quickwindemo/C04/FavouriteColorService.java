package com.example.quickwindemo.C04;

import com.example.quickwindemo.C03.C03Entity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class FavouriteColorService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void storeColor(String colorName) {
        entityManager.persist(new FavouriteColor(colorName));
    }

    @Transactional
    public List<FavouriteColor> loadColors() {
        TypedQuery<FavouriteColor> query = entityManager.createQuery("select color from FavouriteColor color", FavouriteColor.class);
        return query.getResultList();
    }
}
