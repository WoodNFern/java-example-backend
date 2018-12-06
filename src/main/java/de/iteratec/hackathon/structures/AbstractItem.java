package de.iteratec.hackathon.structures;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * Defines basic methods required by the concept of a 'block' in a 'blockchain'. This includes only methods for
 * combining blocks to a chain and methods for manipulating contents of a block.
 *
 * @param <T>
 */
@Entity
public abstract class AbstractItem<T> {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
