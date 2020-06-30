package com.sboo.springdatacommonwebtutorial.post;

import org.springframework.beans.factory.annotation.Value;

public interface CommentSummary {
    String getComment();
    int getUp();
    int getDown();

    // Closed Extended? Projection
    default String getVotes() {
        return getUp() + " " + getDown();
    }

    //Open Projection
//    @Value("#{target.up + ' ' + target.down}")
//    String getVotes();
}
