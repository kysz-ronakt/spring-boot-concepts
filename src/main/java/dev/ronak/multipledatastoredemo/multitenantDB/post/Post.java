package dev.ronak.multipledatastoredemo.multitenantDB.post;

import java.time.LocalDate;

public record Post(
        int id,
        String title,
        String slug,

        LocalDate date,

        String tags

) {

}
