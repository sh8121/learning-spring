package com.sboo.springdatacommonwebtutorial.post;

import org.springframework.beans.factory.annotation.Value;

public interface CommentSummary {
    String getComment();
    int getUp();
    int getDown();

    //Open Projection
    @Value("#{target.up + ' ' + target.down}")
    String getVotes();
}
