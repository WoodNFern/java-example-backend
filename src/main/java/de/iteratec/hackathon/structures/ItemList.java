package de.iteratec.hackathon.structures;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class ItemList<T> extends AbstractItemList<T> {

    @OneToMany(
            targetEntity = AbstractItem.class,
            cascade = CascadeType.ALL
    )
    private List<AbstractItem<T>> items;

    public ItemList() {
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(AbstractItem newItem) {
        this.items.add(newItem);
    }

    @Override
    public AbstractItem getItem(int index) {
        return this.items.get(index);
    }

    @Override
    public long size() {
        return this.items.size();
    }

    public List<AbstractItem<T>> getItems() {
        return items;
    }

    public void setItems(List<AbstractItem<T>> blocks) {
        this.items = blocks;
    }


}
