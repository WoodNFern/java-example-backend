package de.iteratec.hackathon.structures;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import java.util.List;

@Entity
@NamedQuery(
        name = "Item.findByValue",
        query = "SELECT searchItem FROM Item searchItem WHERE searchItem.item = :targetItem"
)
public class Item extends AbstractItem {

    private String item = null;

    public Item() {}

    public Item(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public static String fetchByValue(EntityManager em, String str) {
        List<Item> results = em.createNamedQuery("Item.findByValue", Item.class)
                .setParameter("targetItem", str)
                .getResultList();
        if(results.size() > 0) {
            return results.get(0).getItem();
        } else {
            return "Could not find any such items in the database!";
        }
    }
}
