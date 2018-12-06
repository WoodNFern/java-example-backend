package de.iteratec.hackathon.structures;

import de.iteratec.hackathon.persistence.AbstractEntity;

import javax.persistence.Entity;

@Entity
public abstract class AbstractItemList<T> extends AbstractEntity {

    public abstract void addItem(AbstractItem<T> newBlock);

    public abstract AbstractItem<T> getItem(int index);

    public abstract long size();
}
