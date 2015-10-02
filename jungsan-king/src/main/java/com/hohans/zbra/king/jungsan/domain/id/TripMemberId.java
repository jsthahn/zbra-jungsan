package com.hohans.zbra.king.jungsan.domain.id;

import java.io.Serializable;

public class TripMemberId implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;

    public TripMemberId() {
    }

    public TripMemberId(String id) {
        this.id = id;
    }

    public String getIdString() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TripMemberId other = (TripMemberId) o;

        return sameValueAs(other);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    boolean sameValueAs(TripMemberId other) {
        return other != null && this.id.equals(other.id);
    }

    @Override
    public String toString() {
        return id;
    }
}
