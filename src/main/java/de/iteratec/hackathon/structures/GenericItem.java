package de.iteratec.hackathon.structures;

import de.iteratec.hackathon.persistence.AbstractEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GenericItem<T extends AbstractEntity> extends AbstractItem<T> {

    @OneToOne(targetEntity = AbstractEntity.class)
    private T item = null;

    public GenericItem() {}

    public GenericItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
