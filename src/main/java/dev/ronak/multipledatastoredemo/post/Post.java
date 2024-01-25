package dev.ronak.multipledatastoredemo.post;

import java.time.LocalDate;

public record Post(
        int id,
        String title,
        String slug,

        LocalDate date,

        String tags

) {

}
