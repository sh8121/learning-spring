package com.sboo.springframeworktutorial;

import java.util.Date;

public class Book {
    private Date created;
    private BookStatus status;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }
}
