/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Coviddatabase;

/**
 *
 * @author acer
 */
@WebService(serviceName = "CovidWebService")
public class CovidWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapServicePU");

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "findAllCovid")
    public List <Coviddatabase> findAllCovid() {
        EntityManager em = emf.createEntityManager();
        List<Coviddatabase> coList = (List<Coviddatabase>) em.createNamedQuery("Coviddatabase.findAll").getResultList();
        return coList;
    }
    
    @WebMethod(operationName = "insertCovid")
    @Oneway
    public void insertCovid(@WebParam(name = "co") Coviddatabase co) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(co);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    
}
