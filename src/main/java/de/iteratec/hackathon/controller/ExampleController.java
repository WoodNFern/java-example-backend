package de.iteratec.hackathon.controller;

import de.iteratec.hackathon.structures.Item;
import de.iteratec.hackathon.structures.ItemList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/example")
public class ExampleController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response processGet(@QueryParam("param") String param) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExampleDB");
        EntityManager em = emf.createEntityManager();

        return Response.ok(Item.fetchByValue(em, param)).build();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String processPost(@QueryParam("param") String param) {
        if (param != null) {
            Item item = new Item(param);
            ItemList<String> list = new ItemList<>();
            list.addItem(item);
            persistItemList(list);
        }
        return "I received a POST request & persisted your parameter!";
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String processPut(@QueryParam("param") String param) {
        return "I received a PUT request!";
    }

    private EntityManager beginTransaction() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExampleDB");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        return em;
    }

    private void endTransaction(EntityManager em) {
        em.getTransaction().commit();

        em.close();
    }

    private ItemList getItemListById(long listId) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExampleDB");
        EntityManager em = emf.createEntityManager();

        return em.find(ItemList.class, listId);
    }

    private void persistItemList(ItemList itemList) {
        EntityManager em = beginTransaction();
        em.persist(itemList);
        endTransaction(em);
    }
}
